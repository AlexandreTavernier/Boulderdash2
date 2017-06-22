/**
 * @author Alexandre
 * @version 1.1
 */
package model;

import Interface.ISprite;
import Interface.Permeability;

public class Dirt extends MotionlessElement {
	private static final ISprite SPRITE = new Sprite('W', "Wall.jpg");

<<<<<<< HEAD
	Dirt(final ISprite sprite, final Permeability permeability){
=======
	Dirt(){
>>>>>>> ed25254e66b4f3262bb9b0c0af0825bb20086bed
		super(SPRITE, Permeability.BLOCKING);
	}
}
