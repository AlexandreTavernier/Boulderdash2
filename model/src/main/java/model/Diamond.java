/**
 * @author Alexandre
 * @version 1.1
 */

package model;

import Interface.ISprite;
import Interface.Permeability;

public class Diamond extends MotionlessElement{
	private final static ISprite SPRITE = new Sprite('D',"diamond.jpg");
<<<<<<< HEAD
	private static int x;
	private static int y;

=======
	//Take sprite for diamond
>>>>>>> f0fe6f766eb96d76cf3dd888495106e989b97ca1
	public Diamond(){
		super(SPRITE,Permeability.TAKE, x,y);
	}
	
}
