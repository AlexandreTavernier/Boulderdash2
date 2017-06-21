package model;

public class Door extends MotionlessElement {
	private static final Sprite SPRITE = new Sprite('D', "Door.jpg");

	Door(){
		super(SPRITE, Permeability.PENETRABLE);
	}
}
