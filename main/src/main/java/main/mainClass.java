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
  public static final int startX =5;

  public static final int startY = 0;


  public static void main(String[] args) throws IOException, InterruptedException {


    final IBoulderdashModel model = new BoulderdashModel("C:/Users/malor/Documents/GitHub/Boulderdash2/Maps txt/Map 1.txt", startX, startY);
    final BoulderdashView view = new BoulderdashView(model.getMap(), model.getPlayer());
    //Get the control for the player
    final IBoulderdashController controller = new BoulderdashController(view, model);

    //Play the OrderPerform
    view.setOrderPerformer(controller.getOrderPeformer());
    //Launch the game
    controller.play();

  }
}
