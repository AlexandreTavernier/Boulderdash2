package main;

import model.BoulderdashModel;

public class Launcher {
	
	
	public static void main(String[] args){
		
		//Create the JFRAME
		BoulderdashModel game = new BoulderdashModel("BoulderDash JavaGame", 640,640);
		game.start();
	}

}
