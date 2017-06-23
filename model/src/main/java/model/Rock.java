/**
 * @author Alexandre
 * @version 1.1
 */
package model;

import Interface.ISprite;
import Interface.Permeability;

public class Rock extends MotionlessElement {
	//Setup new sprite
	private static final ISprite SPRITE = new Sprite('R', "boulder.jpg");

	public Rock(){
		super(SPRITE,Permeability.PUSH);
	}
}
