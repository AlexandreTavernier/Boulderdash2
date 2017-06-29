package model.entity;

import java.awt.Graphics;
import java.awt.Rectangle;

import model.Handler;

public abstract class Entity {
	
	protected Handler handler;
	protected Rectangle bounds;
	
	public static final int DEFAULT_HEALTH = 1;
	protected int x, y;
	protected int width, height;
	protected int health;
	
	protected boolean alive = true;
	
	public Entity (Handler handler , int x, int y, int width, int height){
		this.handler = handler;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		health = DEFAULT_HEALTH;
		
		bounds = new Rectangle(0,0, width-3, height-3);
	}
	
	public abstract void tick();
	
	public abstract void render(Graphics g);
	
	public void dig(int amt){
		health -= amt;
		if(health <= 0){
			alive = false;
			die();
		}
		
	}
	
	public abstract void die();
	
	public boolean checkEntityCollisions(float xOffset, float yOffset){
		for(Entity e : handler.getWorld().getEntityManager().getEntities()){
			if(e.equals(this))
				continue;
			if(e.getCollisionBounds(0f, 0f).intersects(getCollisionBounds(xOffset, yOffset)))
				return true;
		}
		return false;
	}
	
	public Rectangle getCollisionBounds(float xOffset, float yOffset){
		return new Rectangle((int) (x + bounds.x + xOffset), (int) (y + bounds.y + yOffset), bounds.width, bounds.height);
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
}
