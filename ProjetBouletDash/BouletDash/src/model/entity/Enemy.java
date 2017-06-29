package model.entity;

import java.awt.Graphics;
import java.util.Random;

import model.Handler;
import view.Assets;

public class Enemy extends Creature{
	
	Random r = new Random();
	
	private long lastMoveTimer, MoveCooldown = 100, MoveTimer = MoveCooldown;

	public Enemy(Handler handler, int x, int y) {
		super(handler, x, y, Creature.CREATURE_WIDTH, Creature.CREATURE_HEIGHT);

	}

	@Override
	public void tick() {
		getInput();
		move();
		
	}
	
	private void getInput(){
		xMove = 0;
		yMove = 0;
		
		MoveTimer += System.currentTimeMillis() - lastMoveTimer;
		lastMoveTimer = System.currentTimeMillis();
		if(MoveTimer < MoveCooldown)
			return;
		
		
		int value = 0 + r.nextInt(5 - 0);

		switch(value){
			case 0 :
				yMove = -speedenemy;
				break;
			case 1 :
				yMove =  speedenemy;
				break;
			case 2 :
				xMove = -speedenemy;
				break;
			case 3 :
				xMove =  speedenemy;
				break;				
		}	
		
		MoveTimer = 0;
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.enemy1, x, y, width, height, null);
	}

	@Override
	public void die() {
		
	}

}
