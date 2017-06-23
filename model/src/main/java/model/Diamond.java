/**
 * @author Alexandre
 * @version 1.1
 */

package model;

import Interface.ISprite;
import Interface.Permeability;

public class Diamond extends MotionlessElement{
	private final static ISprite SPRITE = new Sprite('D',"diamond.jpg");
	//Take sprite for diamond
	public Diamond(){
		super(SPRITE,Permeability.TAKE);
	}
	
}
