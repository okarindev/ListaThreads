package controller;
import java.awt.Font;
import javax.swing.JTextField;

public class Field extends JTextField {

	Window main;
	int active;
	
	public Field(Window main, int x, int y){
		super("0");
		this.main = main;
		this.active = 0;
		Font fonte = new Font("Arial", Font.BOLD, 24);
		setBounds(x,y,25,25);
		setFont(fonte);
		setEditable(false);	
	}	
	
	public void startThread(){
		active = 1;
		new Thread(new Runnable() {
			public void run() {
				try {
					for(int i = 0; i < 150; i++){
						int number = (int)((Math.random()*(7+1))+0);
						Thread.sleep(5);
						setText(String.valueOf(number));
					}
					active = 0;
										
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
				
	}
}
