/**
 * @author Alexandre
 * @version 1.1
 */

package model;

import java.io.IOException;

import Interface.IMap;
import Interface.ISprite;
import Interface.Permeability;

public class Diamond extends Mobile {
	private final static ISprite SPRITE = new Sprite('D',"Diamond.jpg");
	
	public Diamond(final int x, final int y, ISprite sprite, final IMap map) throws IOException{
		super(x, y, SPRITE, map, Permeability.BLOCKING);
	}
}