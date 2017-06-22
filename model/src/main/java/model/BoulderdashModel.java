package model;

/**
 * @author Bruno
 * @version 1
 */

public class BoulderdashModel implements IBoulderdashModel {

	//The player
	private IMobile myPlayer;

	//The level
	private  IMap level;

	public BoulderdashModel(final String fileName, final int playerStartX, final int playerStartY)
		throws IOException {
		this.setMyPlayer(new MyPlayer(playerStartX, playerStartY, this.getLevel()));
	}

	@Override
	public final IMobile getPlayer() {
			return this.myPlayer;
	}

	@Override
	public final IMap getLevel() {
			return this.level;
	}

	private void setPlayer(final IMobile myPlayer) {
			this.myPlayer = myPlayer;
	}

}
