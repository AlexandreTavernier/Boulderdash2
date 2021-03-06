/**
 * @author Alexandre & Bruno
 * @version 1.1
 */
package view;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import Interface.IBoulderdashView;
import Interface.IMap;
import Interface.IMobile;
import Interface.IOrderPerformer;
import Interface.UserOrder;
import fr.exia.showboard.BoardFrame;

//Implementation Runnable, KeyListener, IBoulderdashView 
public class BoulderdashView implements  Runnable, KeyListener, IBoulderdashView {
	private static final int mapView = 19;
	private static final int squareSize = 40;
	private Rectangle closeView;
	private IMap map;
	private IMobile Player;
	private int view;
	private IOrderPerformer orderPerformer;
	public static boolean isKeyTyped = false;


//Implementation of map and player 
	public BoulderdashView(final IMap Map, final IMobile Player) throws IOException{
		this.setView(mapView);
		this.setMap(Map);
		this.setPlayer(Player);
		this.getPlayer().getSprite().loadImage();
		this.setCloseView(new Rectangle(0, this.getPlayer().getY(), this.getMap().getWidth(), mapView));
		SwingUtilities.invokeLater(this);
	}

	@Override
	public final void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
	}

	//Implementation of boardframe with welcome message and start fonction
	@Override
    public final void run() {
		
    	final BoardFrame boardFrame = new BoardFrame("Boulder Dash fan Game Java A1");
        boardFrame.setDimension(new Dimension(this.getMap().getWidth(), this.getMap().getHeight()));
        boardFrame.setDisplayFrame(this.closeView);
        boardFrame.setSize(this.closeView.width * squareSize, this.closeView.height * squareSize);
        boardFrame.setHeightLooped(true);
        boardFrame.addKeyListener(this);
        boardFrame.setFocusable(true);
        boardFrame.setFocusTraversalKeysEnabled(false);

            for (int x = 0; x < this.getMap().getWidth(); x++) {
                for (int y = 0; y < this.getMap().getHeight(); y++) {
                    boardFrame.addSquare(this.map.getOnTheMapXY(x, y), x, y);
                }
            }
            boardFrame.addPawn(this.getPlayer());

            this.getMap().getObservable().addObserver(boardFrame.getObserver());
            //this.followPlayer();

            boardFrame.setVisible(true);
        }

        public final void show(final int yStart){
        	int y = yStart % this.getMap().getHeight();
        	for (int view = 0; view < this.getView(); view++){
        		for(int x = 0; x < this.getMap().getWidth(); x++){
        			if((x == this.getPlayer().getX()) && (y == yStart)){
        				System.out.print(this.getPlayer().getSprite().getConsoleImage());
        			}else{
        				System.out.print(this.getMap().getOnTheMapXY(x, y).getSprite().getConsoleImage());
        			}
        		}
        		y = (y+ 1) % this.getMap().getHeight();
        		System.out.print("\n");
        	}
        }
        //Setup command, for moved the player
        
       private static UserOrder keyCodeToUserOrder(final int keyCode){
    	   UserOrder userOrder;
    	   switch (keyCode){
    	   case KeyEvent.VK_RIGHT :
    	   		userOrder = UserOrder.RIGHT;
    	   		break;
    	   case KeyEvent.VK_LEFT :
    	   		userOrder = UserOrder.LEFT;
    	   		break;
    	   case KeyEvent.VK_UP :
    	   		userOrder = UserOrder.UP;
    	   		break;
    	   case KeyEvent.VK_DOWN :
    	   		userOrder = UserOrder.DOWN;
    	   		break;
    	   default:
    		   userOrder = UserOrder.NOP;
    		   break;
    	   }

    	 return userOrder;

       }

       @Override
       public void KeyTyped(final KeyEvent keyEvent){
    	   isKeyTyped  = true;

       }

       @Override
       public final void keyPressed(final KeyEvent keyEvent){
    	 try{
    		 this.getOrderPerformer().orderPerform(keyCodeToUserOrder(keyEvent.getKeyCode()));
    	 } catch (final IOException exception){
    		 exception.printStackTrace();
    	 }
       }

       /*@Override
       public void keyReleased(final KeyEvent keyEvent){

       }   */

      /* @Override
       public final void followPlayer(){
    	   this.getCloseView().y = this.getPlayer().getY() - 1;
       }*/

       	private IMap getMap(){
       		return this.map;
       	}

       	private void setMap(final IMap map) throws IOException {
            this.map = map;
            for (int x = 0; x < this.getMap().getWidth(); x++) {
                for (int y = 0; y < this.getMap().getHeight(); y++) {
                    this.getMap().getOnTheMapXY(x, y).getSprite().loadImage();
                }

            }
        }

       	private IMobile getPlayer(){
       		return this.Player;
       	}

       	private void setPlayer(final IMobile Player){
       		this.Player = Player;
       	}

       	private int getView(){
       		return this.view;
       	}

       	private void setView(final int view){
       		this.view = view;
       	}

       	/*private Rectangle getCloseView(){
       		return this.closeView;
       	}*/

       	private void setCloseView(final Rectangle closeView){
       		this.closeView = closeView;
       	}

       	private IOrderPerformer getOrderPerformer(){
       		return this.orderPerformer;
       	}

       	public final void setOrderPerformer(final IOrderPerformer orderPerformer) {
       		this.orderPerformer = orderPerformer;
       	}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub

		}

}
