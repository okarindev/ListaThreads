package controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ThreadController extends Thread {

	String url;
	String title;
	
	public ThreadController(String url){
		this.url = url;
		this.title = setName();
	}
	
	public void run(){
		
		try {
			ProcessBuilder command = new ProcessBuilder("ping","-c 5","-4",url);
			Process runCommand = command.start();
			BufferedReader reader = new BufferedReader(new InputStreamReader(runCommand.getInputStream()));
	
			double ping = 0;
			String linha;
	      	while ((linha = reader.readLine()) != null) {
	        	if(linha.contains("time=")) {
	        		System.out.println(linha);
	        		ping += Double.parseDouble(linha.split("time=")[1].replace(" ms", ""));
	        	}
			}
	      	
	      	String ms = String.format("%.2fms", (ping/5)).replace(",",".");
	      	
	      	sleep(1000);
	      	System.out.println("Tempo medio  [" + title + "] = " + ms);
	      	
					
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}
	
	private String setName(){
		String title =  (this.url.contains("uol")) ? "UOL" : this.url.replace("www.","").replace(".com.br","");
		title = title.substring(0,1).toUpperCase() + title.substring(1);
		return title;
 	}
	
}
