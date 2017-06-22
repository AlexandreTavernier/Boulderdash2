package model;

/**
 * @author Bruno
 * @version 1
 */

public class Enemy1 extends Mobile {
  private static final Sprite spriteEnemy1 = new Sprite('1', "enemy1.jpg");


  public Enemy1(final int x, final int y, final IMap map) throws IOException{
		super(x, y, sprite, map, Permeability.BLOCKING);
		spriteEnemy1.loadImage();
	}
}
