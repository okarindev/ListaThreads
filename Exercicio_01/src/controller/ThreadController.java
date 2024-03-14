package controller;

public class ThreadController extends Thread {

	public void run(){
		System.out.println((int)getId());
	}
	
}
