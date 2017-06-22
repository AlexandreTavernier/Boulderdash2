package model;

import java.io.IOException;

import Interface.IBoulderdashModel;
import Interface.IMap;
import Interface.IMobile;

/**
 * @author Bruno
 * @version 1
 */

public class BoulderdashModel implements IBoulderdashModel {

	//The player
	private IMobile Player;

	//The level
	private  IMap level;

	public BoulderdashModel(final String fileName, final int playerStartX, final int playerStartY) throws IOException {
		this.setlevel(new Map(fileName));
		this.setPlayer(new Player(playerStartX, playerStartY, this.getLevel()));
	}

	@Override
	public final IMobile getPlayer() {
			return this.Player;
	}

	@Override
	public final IMap getLevel() {
		return this.level;
	}

	private void setPlayer(final IMobile Player) {
		this.Player = Player;
	}

}
