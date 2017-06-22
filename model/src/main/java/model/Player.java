package model;

/**
 * @author Alexandre
 * @version 1.1
 */

import java.io.IOException;

public class Player extends Mobile {

	private static final ISprite sprite = new Sprite('P', "player.jpg");
	private static final ISprite spriteTurnLeft = new Sprite('P', "player_left.jpg");
	private static final ISprite spriteTurnRight = new Sprite('P', "player_right.jpg");
	private static final ISprite spriteTurnDown = new Sprite('P', "player.jpg");
	private static final ISprite spriteTurnUp = new Sprite('P', "player_up.jpg");


	public Player(final int x, final int y, final IMap map) throws IOException{
		super(x, y, sprite, map, Permeability.BLOCKING);
		spriteTurnLeft.loadImage();
        spriteTurnRight.loadImage();
						spriteTurnDown.loadImage();
								spriteTurnUp.loadImage();
	}


}
