package model;
/**
 * @author Bruno
 * @version 1
 */

import java.io.IOException;

public class Air extends MotionlessElement {
	private static final Sprite SPRITE = new Sprite ('A', "Dirt_dig.jpg");

	Air(){
		super(SPRITE, Permeability.BLOCKING);
	}
}
