package model;

/**
 * @author Bruno
 * @version 1
 */

public class Enemy2 extends Mobile {
  private static final ISprite spriteEnemy2 = new Sprite('2', "enemy2.jpg");


  public Enemy2(final int x, final int y, final IMap map) throws IOException{
		super(x, y, sprite, map, Permeability.BLOCKING);
		spriteEnemy2.loadImage();
	}

}
