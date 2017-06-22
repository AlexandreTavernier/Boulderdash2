/**
 * @author Alexandre
 * @version 1.1
 */
package model;

import Interface.ISprite;
import Interface.Permeability;

public class Dirt extends MotionlessElement {
<<<<<<< HEAD
	private static final ISprite SPRITE = new Sprite('G', "Wall.jpg");
=======
	private static final ISprite SPRITE = new Sprite('W', "wall.jpg");
>>>>>>> teste


	Dirt(final ISprite sprite, final Permeability permeability){
	
		super(SPRITE, Permeability.BLOCKING);
	}
}
