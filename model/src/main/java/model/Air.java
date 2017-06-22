package model;
/**
 * @author Bruno
 * @version 1
 */

import java.io.IOException;

import Interface.ISprite;
import Interface.Permeability;

public class Air extends MotionlessElement {
	private static final ISprite SPRITE = new Sprite ('A', "Dirt_dig.jpg");

	Air(){
		super(SPRITE, Permeability.BLOCKING);
	}
}
