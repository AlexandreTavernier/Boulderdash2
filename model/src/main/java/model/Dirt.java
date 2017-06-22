/**
 * @author Alexandre
 * @version 1.1
 */
package model;

import Interface.ISprite;
import Interface.Permeability;

public class Dirt extends MotionlessElement {
	private static final ISprite SPRITE = new Sprite('W', "Wall.jpg");


	Dirt(final ISprite sprite, final Permeability permeability){
<<<<<<< HEAD
=======
	
>>>>>>> 387c2ae576315d399ecff555bc33143896c0923d
		super(SPRITE, Permeability.BLOCKING);
	}
}
