package model.entity;

import java.awt.Graphics;

import javax.swing.JOptionPane;

import model.Handler;
import model.tiles.Tile;
import view.Assets;

public class Exit extends StaticEntity{

	public static boolean openexit = false;

	public Exit(Handler handler, int x, int y) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		
		bounds.x = 16;
		bounds.y = 16;
		bounds.width = 16;
		bounds.height = 16;
	}

	@Override
	public void tick() {
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.exit, x, y, width, height, null);
	}

	@Override
	public void die() {
		if(openexit)
			JOptionPane.showMessageDialog(null,"You win !");
			System.exit(1);
	}

}
