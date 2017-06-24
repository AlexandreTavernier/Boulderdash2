/**
 * @author Alexandre
 * @version 1.1
 */
package model;

import Interface.ISprite;
import Interface.Permeability;

public class Dirt extends MotionlessElement {
	
	private static final ISprite SPRITE = new Sprite('G', "dirt.jpg");
<<<<<<< HEAD
	private static int x;
	private static int y;
=======

	private static final ISprite SPRITEAIR = new Sprite('A', "dirt_air.jpg");
>>>>>>> f0fe6f766eb96d76cf3dd888495106e989b97ca1
	
	//Setup Dirt
	public Dirt(){
		super(SPRITE, Permeability.DIG, x, y);
	}
<<<<<<< HEAD
	
=======

	public static ISprite setDirt(){
		if (Mobile.getIsDig() == false){
			return SPRITE;
		}else if (Mobile.getIsDig() == true){
			return SPRITEAIR;
		}
		
		return SPRITE;

	}
>>>>>>> f0fe6f766eb96d76cf3dd888495106e989b97ca1
}

