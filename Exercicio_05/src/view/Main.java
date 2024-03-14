package view;

import controller.ThreadController;

public class Main {

	public static void main(String[] args){
		
		new ThreadController("www.uol.com.br").start();
		new ThreadController("www.terra.com.br").start();
		new ThreadController("www.google.com.br").start();
	
	}
	
}
