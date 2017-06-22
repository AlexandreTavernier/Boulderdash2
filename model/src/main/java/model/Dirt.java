/**
 * @author Alexandre
 * @version 1.1
 */
package model;

public class Dirt extends MotionlessElement {
	private static final Sprite SPRITE = new Sprite ('B', "Dirt.jpg");

	Dirt(final int x, final int y, Sprite sprite, final IMap map) throws IOException){
		super(SPRITE, Permeability.BLOCKING);
	}
}
