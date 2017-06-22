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
  private static final int startX = 5;

  private static final int startY = 5;


  public static void main(String[] args) throws IOException, InterruptedException {


    final IBoulderdashModel model = new BoulderdashModel("C:\\Users\\taver\\git\\Boulderdash2\\scene1", startX, startY);
    final BoulderdashView view = new BoulderdashView(model.getMap(), model.getPlayer());
    final IBoulderdashController controller = new BoulderdashController(view, model);

    view.setOrderPerformer(controller.getOrderPeformer());

    controller.play();

  }
}
