package model.entity;

import java.awt.Graphics;

import model.Handler;
import model.tiles.Tile;
import view.Assets;

public class Diamond extends StaticEntity{

	public Diamond(Handler handler, int x, int y) {
		super(handler, x, y,Tile.TILEWIDTH, Tile.TILEHEIGHT);

	}

	@Override
	public void tick() {
		
	}

	@Override
	public void render(Graphics g) {
		
		g.drawImage(Assets.diamond, (int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
		
	}

	@Override
	public void die() {
		Player.nb_Diamond ++;
		System.out.println(Player.nb_Diamond);
		
		if(Player.nb_Diamond == 5)
			System.out.println("Exit Open");
			Exit.openexit = true;
	}

}
