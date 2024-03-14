package controller;

public class ThreadController extends Thread {

	private int[] vetor;
	private int id;
	
	public ThreadController(int[] vetor, int id){
		this.vetor = vetor;
		this.id = id;
	}
	
	public void run(){
		int soma = 0;
		for(int i = 0; i < 5; i++){
			soma += vetor[i];
		}
		System.out.println("Thread_0"+id+": "+soma);
	}
	
}
