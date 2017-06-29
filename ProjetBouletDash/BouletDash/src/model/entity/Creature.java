package model.entity;

import model.Handler;
import model.tiles.Tile;

public abstract class Creature extends Entity{
	
	public static final int CREATURE_WIDTH = 32,
							CREATURE_HEIGHT = 32;
	
	protected int speed = 3;
	protected int speedenemy = 6;
	protected int xMove, yMove;

	public Creature(Handler handler, int x, int y, int width, int height) {
		super(handler, x, y, width, height);
		xMove = 0;
		yMove = 0;
	}
	
	public void move(){
		if(!checkEntityCollisions(xMove,0))
			moveX();
		if(!checkEntityCollisions(0, yMove))
			moveY();
	}
	
	public void moveX(){
		//Right
		if (xMove > 0){ 
			
			int tx = (x + xMove + bounds.x + bounds.width) / Tile.TILEWIDTH;
			if(!collisionWithTile(tx, (y + bounds.y) / Tile.TILEHEIGHT) && !collisionWithTile(tx, (y + bounds.y + bounds.height) / Tile.TILEHEIGHT)){
				x += xMove;
			}else{
				x = tx * Tile.TILEWIDTH - bounds.x - bounds.width -1;
			}
		}
		//Left
		else if (xMove < 0){
			int tx = (x + xMove + bounds.x) / Tile.TILEWIDTH;
			if(!collisionWithTile(tx, (y + bounds.y) / Tile.TILEHEIGHT) && !collisionWithTile(tx, (y + bounds.y + bounds.height) / Tile.TILEHEIGHT)){
				x += xMove;
			}
			else{
				x = tx * Tile.TILEWIDTH + Tile.TILEWIDTH - bounds.x;
			}
		}

	}
	
	public void moveY(){
		//up
		if(yMove < 0){
			int ty = (y + yMove + bounds.y) / Tile.TILEHEIGHT;
			if(!collisionWithTile((x + bounds.x) / Tile.TILEWIDTH, ty) && !collisionWithTile((x + bounds.x + bounds.width) / Tile.TILEWIDTH, ty)){
				y += yMove;
			}
			else{
				y = ty * Tile.TILEHEIGHT + Tile.TILEHEIGHT - bounds.y;
			}
		}
		//Down
		else if (yMove > 0){
			int ty = (y + yMove + bounds.y + bounds.height) / Tile.TILEHEIGHT;
			if(!collisionWithTile((x + bounds.x) / Tile.TILEWIDTH, ty) && !collisionWithTile((x + bounds.x + bounds.width) / Tile.TILEWIDTH, ty)){
				y += yMove;
			}
			else{
				y = ty * Tile.TILEHEIGHT - bounds.y - bounds.height -1;
			}
		}
	}

	protected boolean collisionWithTile(int x, int y){
		return handler.getWorld().getTile(x, y).isSolide();
	}

}
