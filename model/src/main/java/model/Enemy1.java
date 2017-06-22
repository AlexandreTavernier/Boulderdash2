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
  private static final ISprite SPRITE = new Sprite('1', "enemy1.jpg");


  public Enemy1(final int x, final int y, final IMap map) throws IOException{
		super(x, y, SPRITE, map, Permeability.BLOCKING);
		SPRITE.loadImage();
	}
}
