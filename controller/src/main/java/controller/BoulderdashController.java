/**
 * @author Bruno & Thomas
 * @version 1
 */

package controller;

import java.io.IOException;

import Interface.IBoulderdashController;
import Interface.IBoulderdashModel;
import Interface.IBoulderdashView;
import Interface.IOrderPerformer;
import Interface.UserOrder;


public class BoulderdashController implements IBoulderdashController, IOrderPerformer {
  // The Constant speed.
  private static final int speed = 60;

  // The view
  private IBoulderdashView  view;

  //The model.
  private IBoulderdashModel model;

  // The stack order
  private UserOrder stackOrder;
  
  static boolean isPlayed = false;

  //Instantiates a new insane vehicles controller.
  public BoulderdashController(final IBoulderdashView view, final IBoulderdashModel model) {
      this.setView(view);
      this.setModel(model);
      this.clearStackOrder();
  }

  //play
  @Override
  public final void play() throws InterruptedException {
      //Check if the player is Alive or Check if the player as won
		  while (this.getModel().getPlayer().isAlive() || !this.getModel().getPlayer().asWon() ) {
	          Thread.sleep(speed);
	          isPlayed = true;
	          //move the player
	          switch (this.getStackOrder()) {
	              case RIGHT:
	                  this.getModel().getPlayer().moveRight();
	                  System.out.println("Right");
	                  break;
	              case LEFT:
	                  this.getModel().getPlayer().moveLeft();
	                  System.out.println("Left");
	                  break;
	              case UP:
	                  this.getModel().getPlayer().moveUp();
	                  System.out.println("UP");
	                  break;
	              case DOWN:
	                  this.getModel().getPlayer().moveDown();
	                  System.out.println("Down");
	              case NOP:
	              default:
	                  this.getModel().getPlayer().doNothing();
	                  break;
	          }
	          this.clearStackOrder();
	          //this.getView().followPlayer();
	          
	      	
	      	if (this.getModel().getPlayer().asWon()){ 
	      	//Check this player is alive and display won
	      		this.getView().displayMessage("You win!");
	      		break;
	      	}
	      	if (this.getModel().getPlayer().isDead() == false){
	      		//Check this player is dead and display game over
	      		this.getView().displayMessage("Game Over");
	      		break;
	      	}
	      
		 }
  }

  @Override
  //Get the order performe by the player to stackOrder
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
  @Override
  public IOrderPerformer getOrderPeformer() {
      return this;
  }

}
