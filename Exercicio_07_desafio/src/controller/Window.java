package controller;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Window extends JFrame {

	Field field_01 = new Field(this,50,50);
	Field field_02 = new Field(this,75,50);
	Field field_03 = new Field(this,100,50);
	JButton button = new Button(this);
	int loaded = 3;
	
	public Window(){
		
		setSize(500, 250);
		setLocationRelativeTo(null);
		setLayout(null);
		setResizable(false);
		configComponents();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
			
	}
	
	public void configComponents(){
		
		add(field_01);
		add(field_02);
		add(field_03);
		add(button);
				
	}
	
	public void loadNumber(){
		loaded--;
		if(loaded == 0){
			button.setVisible(true);
		}
	}
	

	
}
