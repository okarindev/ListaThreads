package view;
import controller.ThreadController;
import controller.RaceController;

public class Main {

	
	public static void main(String[] args){
		
		RaceController race = new RaceController(100);
		for(int i = 0; i < 5; i++){
			new ThreadController(race, i+1).start();
		}
		
	}
	
}
