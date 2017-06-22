package model;

/**
 * @author Alexandre
 * @version 1
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

	public final void moveLeft() {
			super.moveLeft();
			this.setSprite(spriteTurnLeft);
	}

	public final void moveRight() {
			super.moveRight();
			this.setSprite(spriteTurnRight);
	}

	public final void moveDown() {
			super.moveDown();
			this.setSprite(spriteTurnDown);
	}

	public final void moveUp() {
			super.moveUp();
			this.setSprite(spriteTurnUp);
	}

	public final void doNothing() {
			super.doNothing();
			this.setSprite(sprite);
	}

	protected final void die() {
			super.die();
			this.setSprite(sprite);
	}

}
