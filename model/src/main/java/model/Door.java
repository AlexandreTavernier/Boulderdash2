/**
 * @author Alexandre
 * @version 1.1
 */
package model;

import Interface.ISprite;
import Interface.Permeability;

public class Door extends MotionlessElement {
	private static final ISprite SPRITE = new Sprite('E', "door.jpg");
<<<<<<< HEAD
	
	private static int x;
	private static int y;

=======
	//Take sprite for Door
>>>>>>> f0fe6f766eb96d76cf3dd888495106e989b97ca1
	Door(){
		super(SPRITE, Permeability.EXIT, x,y);
	}
}
