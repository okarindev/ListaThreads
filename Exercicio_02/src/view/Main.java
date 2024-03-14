package view;

import controller.ThreadController;

public class Main {

	public static void main(String[] args){
		
		int[][] matriz = new int[3][5];
		System.out.println("Soma de todos elementos de cada vetor");
		for(int y = 0; y < 3; y++){
			for(int x = 0; x < 5; x++) {
				matriz[y][x] = (int)(Math.random()*(100+1));
			}
			new ThreadController(matriz[y], y+1).start();
		}
		
	}
	
}
