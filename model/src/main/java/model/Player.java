package model;

/**
 * @author Alexandre
 * @version 1.1
 */

import java.io.IOException;

import Interface.IMap;
import Interface.ISprite;
import Interface.Permeability;

public class Player extends Mobile {

	private static final ISprite sprite = new Sprite('P', "player.jpg");
	private static final ISprite spriteTurnLeft = new Sprite('P', "player_left.jpg");
	private static final ISprite spriteTurnRight = new Sprite('P', "player_right.jpg");
	private static final ISprite spriteTurnDown = new Sprite('P', "player.jpg");
	private static final ISprite spriteTurnUp = new Sprite('P', "player_up.jpg");


	public Player(final int x, final int y, final IMap map) throws IOException{
		super(x, y, sprite, map, Permeability.BLOCKING);
		spriteTurnLeft.loadImage();
<<<<<<< HEAD
        spriteTurnRight.loadImage();
=======
    spriteTurnRight.loadImage();
>>>>>>> cc8be033f6507a5c571346ee809c5e3170457a1c
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
