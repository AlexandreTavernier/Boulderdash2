package model;
/**
 * @author Bruno
 * @version 1
 */

import Interface.ISprite;
import Interface.Permeability;

public class Air extends MotionlessElement {
	private static final ISprite SPRITE = new Sprite ('A', "dirt_dig.jpg");
	private static int x;
	private static int y;

	Air(){
		super(SPRITE, Permeability.PENETRABLE, x,y);
	}
}
