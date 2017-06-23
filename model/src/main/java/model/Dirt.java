/**
 * @author Alexandre
 * @version 1.1
 */
package model;

import Interface.ISprite;
import Interface.Permeability;
import model.Mobile;

public class Dirt extends MotionlessElement {
	
	private static final ISprite SPRITE = new Sprite('G', "dirt.jpg");
	private static final ISprite SPRITEAIR = new Sprite('A', "dirt_air.jpg");
	//Setup Dirt
	public Dirt(){
		super(setDirt(), Permeability.DIG);
	}

	public static ISprite setDirt(){
		if (Mobile.getIsDig() == false){
			return SPRITE;
		}else if (Mobile.getIsDig() == true){
			return SPRITEAIR;
		}
		
		return SPRITE;
	}
}
