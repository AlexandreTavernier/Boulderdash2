/**
 * @author Alexandre
 * @version 1.1
 */
package model;

import Interface.ISprite;
import Interface.Permeability;

public class Dirt extends MotionlessElement {
	
	private static final ISprite SPRITE = new Sprite('G', "dirt.jpg");
	private static final ISprite AIRSPRITE = new Sprite('G', "air.jpg");

	Dirt(){
	
		super(SPRITE,Permeability.BLOCKING);
	}
}

