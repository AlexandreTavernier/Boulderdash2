/**
 * @author Alexandre
 * @version 1.1
 */
package model;

public class Wall extends MotionlessElement {
	private static final Sprite SPRITE = new Sprite('W', "Wall.jpg");

	Wall(final int x, final int y, final IMap map){
		super(x, y, SPRITE, map, Permeability.BLOCKING);
	}
}
