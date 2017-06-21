/**
 * @author Bruno
 * @version 1
 */

package controller;

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


  public final void play() throws InterruptedException {
      while (this.getModel().getPlayer().isAlive()) {
          Thread.sleep(speed);
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
}
