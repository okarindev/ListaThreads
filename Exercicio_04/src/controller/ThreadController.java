package controller;

public class ThreadController extends Thread {

	private RaceController raceControl;
	private int frogId;
	private int maxStep;
	private int finalDistance;
	private int position;
	
	public ThreadController(RaceController raceControl, int frogId){
		this.raceControl = raceControl;
		this.frogId = frogId;
		this.maxStep = raceControl.maxStep;
		this.finalDistance = raceControl.raceDistance;
		this.position = 0;
	}
	
	public void run() {
		
		setPriority(Thread.NORM_PRIORITY);
		
		try {
			while(true){
				sleep(100);
				int step = (int)((Math.random() * (maxStep+1)));
				position += step;
				System.out.println("O sapo " + frogId + " andou " + step + "m");
				if(position >= finalDistance){
					break;
				}
			}
			System.out.println("O sapo " + frogId + " encerrou em " + raceControl.addPosition() + " lugar");
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
