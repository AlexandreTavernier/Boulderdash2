/**
 * @author Alexandre
 * @version 1.1
 */
package model;

import Interface.ISprite;
import Interface.Permeability;

public class Wall extends MotionlessElement {
	
	private static final ISprite SPRITE = new Sprite('W', "wall.jpg");
	
	private static int x;
	private static int y;

	Wall(){
		super(SPRITE, Permeability.BLOCKING, x,y);
	}
}
