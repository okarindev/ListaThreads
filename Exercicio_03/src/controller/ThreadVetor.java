package controller;

public class ThreadVetor extends Thread {

	private int number;
	private int[] vetor;
	
	public ThreadVetor(int number, int[] vetor){
		this.number = number;
		this.vetor = vetor;
	}
	
	public void run(){
		Object[] time = ((number % 2) == 0) ? forTime() : forEachTime();
		System.out.println(String.format(time[0]+": %.20f", time[1]).replace(",", ".")+"s");
	}
	
	public Object[] forTime(){
		
		double initialTime = System.nanoTime();
		
		for(int i = 0; i < vetor.length;i++){
			System.out.println(vetor[i]);		
		}
		
		double finalTime = System.nanoTime();
		double time = (finalTime - initialTime) / (Math.pow(10, 9));
		
		Object[] args = {"For    ",time};
		return args;
		
	}
	public Object[] forEachTime(){
		double initialTime = System.nanoTime();
		
		for(int i : vetor){
			System.out.println(i);
		}
		
		double finalTime = System.nanoTime();
		double time = (finalTime - initialTime) / (Math.pow(10, 9));
		
		Object[] args = {"Foreach",time};
		return args;
	}
	
}
