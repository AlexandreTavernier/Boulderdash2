package model;

import Interface.ISprite;
import Interface.Permeability;

/**
 * @author Bruno
 * @version 1
 */

public class Enemy2 extends MotionlessElement{
  //Setup sprite for enemy2
  private static final ISprite SPRITE = new Sprite('2', "enemy2.jpg");
  
  private static int x;
  private static int y;
  //Setup position
  public Enemy2(){
		super( SPRITE,Permeability.TAKE, x, y);
		
	}

}
