package model;

public class Dirt extends MotionlessElement {
	private static final Sprite SPRITE = new Sprite ('B', "Dirt.jpg");

	Dirt(){
		super(SPRITE, Permeability.BLOCKING);
	}
}
