package controller;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Button extends JButton {
	Window main;
	public Button(Window main){
		super("Jogar");
		this.main = main;
		Font fonte = new Font("Arial", Font.BOLD, 24);
		setBounds(200,100,150,35);
		setFont(fonte);
		
		addActionListener(new ActionListener() {
	
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				checkVisible();
				main.field_01.startThread();	
				main.field_02.startThread();
				main.field_03.startThread();
			}
		});
		
	}
	
	private void checkVisible(){
		new Thread(new Runnable() {
			public void run() {
				while(true){
					try {
						Thread.sleep(100);
						if(checkThreadField() == 0){
							setVisible(true);
							break;
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
	
			}
		}).start();
	}
	
	private int checkThreadField(){
		return main.field_01.active +main.field_02.active + main.field_03.active;
	}
	
}
