package model.tiles;

import view.Assets;

public class Wall extends Tile {

	public Wall(int id) {
		super(Assets.wall, id);
	}

	@Override
	public boolean isSolide(){
		return true;
	}
}
