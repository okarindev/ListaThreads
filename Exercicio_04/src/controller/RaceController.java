package controller;

public class RaceController {

	public int raceDistance;
	public int maxStep;
	private int positionRelation = 0;
	
	public RaceController(int raceDistance){
		this.raceDistance = raceDistance;
		this.maxStep = (int)(raceDistance*0.75);
	}

	public int addPosition(){
		positionRelation++;
		return positionRelation;
	}
	
}
