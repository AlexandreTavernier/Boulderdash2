package model;

import java.io.IOException;

import Interface.IMap;
import Interface.ISprite;
import Interface.Permeability;

/**
 * @author Bruno
 * @version 1
 */

public class Enemy1 extends Mobile {
  //Setup sprite for enemy1
  private static final ISprite SPRITE = new Sprite('1', "enemy1.jpg");

  //Setup position
  public Enemy1(final int x, final int y, final IMap map) throws IOException{
		super(x, y, SPRITE, map, Permeability.ENEMY);
		SPRITE.loadImage();
	}
}
