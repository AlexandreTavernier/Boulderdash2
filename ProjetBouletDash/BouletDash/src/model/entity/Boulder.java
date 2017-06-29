package model.entity;

import java.awt.Graphics;

import model.Handler;
import model.tiles.Tile;
import view.Assets;

public class Boulder extends StaticEntity {

	public Boulder(Handler handler, int x, int y) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
	}

	@Override
	public void tick() {
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.boulder, (int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
		
	}

	@Override
	public void die() {
		
	}

}
