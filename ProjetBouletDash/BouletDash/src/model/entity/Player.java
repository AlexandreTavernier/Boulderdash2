package model.entity;

import java.awt.Graphics;
import java.awt.Rectangle;

import model.Handler;
import view.Assets;

public class Player extends Creature {
	
	public static int nb_Diamond = 0;

	public Player(Handler handler, int x, int y) {
		super(handler, x, y, Creature.CREATURE_WIDTH, Creature.CREATURE_HEIGHT);
	}

	@Override
	public void tick() {
		getInput();
		move();
		handler.getGameCamera().centerOnEntity(this);
		checkDig();
	}
	
	private void getInput(){
		xMove = 0;
		yMove = 0;
		
		if(handler.getKeyManager().up)
			yMove = -speed;
		if(handler.getKeyManager().down)
			yMove =  speed;
		if(handler.getKeyManager().left)
			xMove = -speed;
		if(handler.getKeyManager().right)
			xMove =  speed;
		
	}
	
	private void checkDig(){
		
		Rectangle cb = getCollisionBounds(0, 0);
		Rectangle ar = new Rectangle();
		int arSize = 10;
		ar.width = arSize;
		ar.height = arSize;
		
		if(handler.getKeyManager().space && handler.getKeyManager().up){
			ar.x = cb.x + cb.width / 2 - arSize / 2;
			ar.y = cb.y - arSize;
		}else if(handler.getKeyManager().space && handler.getKeyManager().down){
			ar.x = cb.x + cb.width / 2 - arSize / 2;
			ar.y = cb.y + cb.height;
		}else if(handler.getKeyManager().space && handler.getKeyManager().left){
			ar.x = cb.x - arSize;
			ar.y = cb.y + cb.height / 2 - arSize / 2;
		}else if(handler.getKeyManager().space && handler.getKeyManager().right){
			ar.x = cb.x + cb.width;
			ar.y = cb.y + cb.height / 2 - arSize / 2;
		}else{
			return;
		}
		
		for(Entity e : handler.getWorld().getEntityManager().getEntities()){
			if(e.equals(this))
				continue;
			if(e.getCollisionBounds(0, 0).intersects(ar)){
				e.dig(1);
				return;
			}
		}
		
	}
	

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.player, x, y, width, height, null);

	}

	@Override
	public void die() {
		System.out.println("You lose");
		
	}

}
