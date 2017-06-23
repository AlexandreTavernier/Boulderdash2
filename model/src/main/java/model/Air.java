package model;
/**
 * @author Bruno
 * @version 1
 */

import Interface.ISprite;
import Interface.Permeability;
//Create the sprite
public class Air extends MotionlessElement {
	private static final ISprite SPRITE = new Sprite ('A', "dirt_dig.jpg");

	
	Air(){
		super(SPRITE, Permeability.PENETRABLE);
	}
}
