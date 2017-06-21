package model;

import java.io.IOException;

public class Player extends Mobile {
	private static final Sprite sprite = new Sprite('P', "player.jpg");
	private static final Sprite spriteTurnLeft = new Sprite('P', "player.jpg");
	private static final Sprite spriteTurnRight = new Sprite('P', "player.jpg");

	public Player(final int x, final int y, final IMap map) throws IOException{
		super(x, y, sprite, map, Permeability.BLOCKING);
		spriteTurnLeft.loadImage();
        spriteTurnRight.loadImage();	
	}
	
	
}
