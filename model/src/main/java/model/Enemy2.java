package model;

import java.io.IOException;

import Interface.IMap;
import Interface.ISprite;
import Interface.Permeability;

/**
 * @author Bruno
 * @version 1
 */

public class Enemy2 extends Mobile {
  private static final ISprite SPRITE = new Sprite('2', "enemy2.jpg");


  public Enemy2(final int x, final int y, final IMap map) throws IOException{
		super(x, y, SPRITE, map, Permeability.ENEMY);
		SPRITE.loadImage();
	}

}
