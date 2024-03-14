package view;

import controller.ThreadVetor;

public class Main {

	public static void main(String[] args){
		
		int[] vetor = new int[1000];
		
		for(int i = 0; i < 1000; i++){
			vetor[i] = (int)(Math.random()*(100+1));
		}
		
		new ThreadVetor(1, vetor).start();
		new ThreadVetor(2, vetor).start();
		
	}
	
}
