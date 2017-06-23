/**
 * @author Bruno
 * @version 1
 */

package main;

import java.io.IOException;

import Interface.IBoulderdashController;
import controller.BoulderdashController;
import Interface.IBoulderdashModel;
import model.BoulderdashModel;
import view.BoulderdashView;



public abstract class mainClass {
  //Intial value for the player
  private static final int startX =5;

  private static final int startY = 0;


  public static void main(String[] args) throws IOException, InterruptedException {

	//Create the player
    final IBoulderdashModel model = new BoulderdashModel("C:/Users/taver/git/Boulderdash2/scene1.txt", startX, startY);
    //Diplay the map and the player
    final BoulderdashView view = new BoulderdashView(model.getMap(), model.getPlayer());
    //Get the control for the player
    final IBoulderdashController controller = new BoulderdashController(view, model);

    //Play the OrderPerform
    view.setOrderPerformer(controller.getOrderPeformer());
    //Launch the game
    controller.play();

  }
}
