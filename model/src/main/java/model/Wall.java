package model;

public class Wall extends MotionlessElement {
	private static final Sprite SPRITE = new Sprite('W', "Wall.jpg");

	Wall(){
		super(SPRITE, Permeability.BLOCKING);
	}
}