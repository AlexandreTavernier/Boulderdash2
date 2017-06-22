package model;

/**
 * @author Alexandre
 * @version 1.1
 */

import java.io.IOException;

public class Player extends Mobile {

	private static final Sprite sprite = new Sprite('P', "player.jpg");
	private static final Sprite spriteTurnLeft = new Sprite('P', "player_left.jpg");
	private static final Sprite spriteTurnRight = new Sprite('P', "player_right.jpg");
	private static final Sprite spriteTurnDown = new Sprite('P', "player.jpg");
	private static final Sprite spriteTurnUp = new Sprite('P', "player_up.jpg");


	public Player(final int x, final int y, final IMap map) throws IOException{
		super(x, y, sprite, map, Permeability.BLOCKING);
		spriteTurnLeft.loadImage();
        spriteTurnRight.loadImage();
						spriteTurnDown.loadImage();
								spriteTurnUp.loadImage();
	}


}
