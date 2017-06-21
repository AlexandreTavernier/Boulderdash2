package view;

import java.awt.Rectangle;
import java.awt.event.KeyListener;
import model.src.main.java.model;

public class BoulderdashView implements Runnable, KeyListener {
	private static final int mapView = 10;
	private static final int squareSize = 100;
	private Rectangle closeView;
	private IMap map;
	private IMobile player;
	private int view;
	private IOrderPerformer orderPerformer;
	


	public BoulderdashView(final IMap map, final IMobile player) throws IOException{
		this.setView(mapView);
		this.setMap(map);
		this.setplayer(player);
		this.getplayer().getSprite().loadImage();
	}
}
