package model.entity;

import model.Handler;

public abstract class StaticEntity extends Entity{

	public StaticEntity(Handler handler, int x, int y, int width, int height) {
		super(handler, x, y, width, height);
	}
	
}
