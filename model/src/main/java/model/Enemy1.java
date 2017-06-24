package model;

import Interface.ISprite;
import Interface.Permeability;

/**
 * @author Bruno
 * @version 1
 */

public class Enemy1 extends MotionlessElement {
  //Setup sprite for enemy1
  private static final ISprite SPRITE = new Sprite('1', "enemy1.jpg");
  private static int x;
private static int y;

  //Setup position
  public Enemy1(){
		super( SPRITE, Permeability.ENEMY, x, y);
	}
}
