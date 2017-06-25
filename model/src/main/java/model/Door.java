/**
 * @author Thomas Alexandre
 * @version 1.1
 */
package model;

import Interface.ISprite;
import Interface.Permeability;

public class Door extends MotionlessElement {
	private static final ISprite SPRITE = new Sprite('E', "door.jpg");
	
	private static int x;
	private static int y;

	Door(){
		super(SPRITE, Permeability.EXIT, x,y);
	}
}
