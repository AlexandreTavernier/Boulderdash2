/**
 * @author Bruno
 * @version 1
 */

package controller;

import java.io.IOException;
import view.*;
import model.*;

public class BoulderdashController implements IBoulderdashController, IOrderPerformer {
  // The Constant speed.
  private static final int speed = 2;

  // The view
  private IBoulderdashView  view;

  //The model.
  private IBoulderdashModel model;

  // The stack order
  private UserOrder stackOrder;

  //Instantiates a new insane vehicles controller.
  public InsaneVehiclesController(final IBoulderdashView view, final IBoulderdashModel model) {
      this.setView(view);
      this.setModel(model);
      this.clearStackOrder();
  }

  //play
  public final void play() throws InterruptedException {
      //Check if the player is Alive
      while (this.getModel().getPlayer().isAlive()) {
          Thread.sleep(speed);
          //move the player 
          switch (this.getStackOrder()) {
              case RIGHT:
                  this.getModel().getPlayer().moveRight();
                  break;
              case LEFT:
                  this.getModel().getPlayer().moveLeft();
                  break;
              case UP:
                  this.getModel().getPlayer().moveUp();
                  break;
              case DOWN:
                  this.getModel().getPlayer().moveDown();
              case NOP:
              default:
                  this.getModel().getPlayer().doNothing();
                  break;
          }
          this.clearStackOrder();
          if (this.getModel().getPlayer().isAlive()) {
              this.getModel().getPlayer().moveDown();
          }
          this.getView().followPlayer();
      }
      this.getView().displayMessage("Game Over");
  }

  public final void orderPerform(final UserOrder userOrder) throws IOException {
      this.setStackOrder(userOrder);
  }

  //Get view
  private IBoulderdashView getView() {
      return this.view;
  }
  //Set View
  private void setView(final IBoulderdashView view) {
      this.view = view;
  }

  //Get model
  private IBoulderdashModel getModel(){
    return this.model;
  }
  //Set Model
  private void setModel(final IBoulderdashModel model) {
      this.model = model;
  }

  //Get the stackOrder
  private UserOrder getStackOrder() {
      return this.stackOrder;
  }
  //Set stackOrder
  private void setStackOrder(final UserOrder stackOrder) {
      this.stackOrder = stackOrder;
  }
  //Clear the order
  private void clearStackOrder() {
      this.stackOrder = UserOrder.NOP;
  }

  //get the orderperform by the player
  public IOrderPerformer getOrderPeformer() {
      return this;
  }

}
