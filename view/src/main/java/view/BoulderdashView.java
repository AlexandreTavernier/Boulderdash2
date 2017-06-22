package view;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import model.IMap;
import model.IMobile;


public class BoulderdashView implements Runnable, KeyListener {
	private static final int mapView = 10;
	private static final int squareSize = 100;
	private Rectangle closeView;
	private IMap map;
	private IMobile Player;
	private int view;
	private IOrderPerformer orderPerformer;
	


	public BoulderdashView(final IMap map, final IMobile Player) throws IOException{
		this.setView(mapView);
		this.setMap(map);
		this.setPlayer(player);
		this.getPlayer().getSprite().loadImage();
		this.setCloseView(new Rectangle(0, this.getPlayer().getY(), this.getMap.getWidth(), mapView));
		SwingUtilities.invokeLater(this);
	}
	
	public final void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
     
        public final void run() {
            final BoardFrame boardFrame = new BoardFrame("Close view");
            boardFrame.setDimension(new Dimension(this.getmap().getWidth(), this.getmap().getHeight()));
            boardFrame.setDisplayFrame(this.closeView);
            boardFrame.setSize(this.closeView.width * squareSize, this.closeView.height * squareSize);
            boardFrame.setHeightLooped(true);
            boardFrame.addKeyListener(this);
            boardFrame.setFocusable(true);
            boardFrame.setFocusTraversalKeysEnabled(false);

            for (int x = 0; x < this.getmap().getWidth(); x++) {
                for (int y = 0; y < this.getmap().getHeight(); y++) {
                    boardFrame.addSquare(this.map.getOnThemapXY(x, y), x, y);
                }
            }
            boardFrame.addPawn(this.getPlayer());

            this.getmap().getObservable().addObserver(boardFrame.getObserver());
            this.followPlayer();

            boardFrame.setVisible(true);
        }
      
	
}
