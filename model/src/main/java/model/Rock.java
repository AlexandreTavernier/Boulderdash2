/**
 * @author Alexandre
 * @version 1.1
 */
package model;

import Interface.ISprite;
import Interface.Permeability;

public class Rock extends MotionlessElement {
	private static final ISprite SPRITE = new Sprite('R', "boulder.jpg");
	
	private static int x;
	private static int y;

	public Rock(){
		super(SPRITE,Permeability.PUSH, x,y);
	}
}
