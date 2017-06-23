/**
 * @author Alexandre
 * @version 1.1
 */
package model;

import java.io.IOException;

import Interface.IMap;
import Interface.ISprite;
import Interface.Permeability;

public class Rock extends Mobile {
	private static final ISprite SPRITE = new Sprite('R', "boulder.jpg");

	public Rock(final int x, final int y, final IMap map) throws IOException{
		super(x, y, SPRITE, map, Permeability.PUSH);
	}
}
