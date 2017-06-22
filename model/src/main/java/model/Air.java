package model;

import java.io.IOException;

public class Air extends MotionlessElement {
	private static final Sprite SPRITE = new Sprite ('A', "Dirt_dig.jpg");

	Air(){
		super(SPRITE, Permeability.BLOCKING);
	}
}
