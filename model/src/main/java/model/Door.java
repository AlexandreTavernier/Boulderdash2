/**
 * @author Alexandre
 * @version 1.1
 */
package model;

public class Door extends MotionlessElement {
	private static final Sprite SPRITE = new Sprite('E', "Door.jpg");

	Door(){
		super(SPRITE, Permeability.PENETRABLE);
	}
}
