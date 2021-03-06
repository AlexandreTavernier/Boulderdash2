/**
 * @author Alexandre Bruno
 * @version 1.1
 */
package model;

import Interface.ISprite;
import Interface.Permeability;

public class Dirt extends MotionlessElement {
	private static final ISprite SPRITE = new Sprite('G', "dirt.jpg");

	private static int x;
	private static int y;

	Dirt(){

		super(SPRITE, Permeability.DIG, x,y);
	}
}
