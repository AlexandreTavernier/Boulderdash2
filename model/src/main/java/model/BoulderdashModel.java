package model;

import java.io.IOException;
import Interface.IMap;
import Interface.IMobile;
import Interface.IBoulderdashModel;

/**
 * @author Bruno Thomas
 * @version 1
 */

public class BoulderdashModel implements IBoulderdashModel {

	//The player
	private IMobile Player;

	//The level
	private  IMap level;

	public BoulderdashModel(final String fileName, final int playerStartX, final int playerStartY) throws IOException {
		this.setMap(new Map(fileName));
		this.setPlayer(new Player(playerStartX, playerStartY, this.getMap()));
	}

	@Override
	public final IMobile getPlayer() {
			return this.Player;
	}
	//Select level
	private void setMap(final IMap map){
		this.level = map;
	}
	//Get variable Map
	@Override
	public final IMap getMap() {
		return this.level;
	}
	//Setup the player
	private void setPlayer(final IMobile Player) {
		this.Player = Player;
	}

}
