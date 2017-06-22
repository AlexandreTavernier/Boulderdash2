/**
 * @author Alexandre
 * @version 1.1
 */
package model;

import Interface.ISprite;
import Interface.Permeability;

public class Door extends MotionlessElement {
	private static final ISprite SPRITE = new Sprite('E', "door.jpg");

	Door(){
		super(SPRITE, Permeability.PENETRABLE);
	}
}
