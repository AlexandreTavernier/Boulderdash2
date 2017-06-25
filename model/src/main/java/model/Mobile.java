/**
 * @author Thomas
 * @version 1.1
 */
package model;

import java.awt.Point;

import Interface.IMap;
import Interface.IMobile;
import Interface.ISprite;
import Interface.Permeability;
import fr.exia.showboard.IBoard;

public class Mobile extends Element implements IMobile {
	private static final int SCOREMAX = 10;

	private Boolean win = false;
	private Boolean alive = true;

	private Point position;
	private IMap map;
	private IBoard board;




	Mobile(final ISprite sprite, final IMap map, final Permeability permeability, int x, int y){
		super(sprite, permeability,x,y);
		this.setMap(map);
		this.position = new Point();
	}

	Mobile(final int x, final int y, final ISprite sprite, final IMap map, final Permeability permeability){
		this(sprite, map, permeability, x, y);
		this.setX(x);
        this.setY(y);
	}

	private void setMap(final IMap map) {
        this.map = map;
    }

	/* (non-Javadoc)
	 * @see model.IMobile#moveUp()
	 */
	@Override
	//Operator use for move Up
	public void moveUp() {
		if(this.getMap().getOnTheMapXY(this.getX(), this.getY()-1).getPermeability() == Permeability.BLOCKING){
			this.setY(this.getY());
		}
		else if (this.getMap().getOnTheMapXY(this.getX(), this.getY()-1).getPermeability() == Permeability.TAKE){
			this.setY(this.getY() - 1);
			Player.SCORE = Player.SCORE + 1;
			System.out.println(Player.SCORE);
		}
		else if (this.getMap().getOnTheMapXY(this.getX(), this.getY()-1).getPermeability() == Permeability.ENEMY){
			this.setY(this.getY() - 1);
			this.die();
			System.out.println("hit");
		}
		else if (this.getY() == 0){
			this.setY(this.getY());
		}
		else{
			this.setY(this.getY() - 1);
		}
        this.setHasMoved();
    }

	/* (non-Javadoc)
	 * @see model.IMobile#moveLeft()
	 */
	@Override
	//Operator use for move Left
	public void moveLeft() {
		if(this.getMap().getOnTheMapXY(this.getX() - 1, this.getY()).getPermeability() == Permeability.BLOCKING){
			this.setX(this.getX());
		}
		else if (this.getMap().getOnTheMapXY(this.getX() - 1, this.getY()).getPermeability() == Permeability.TAKE){
			this.setX(this.getX() - 1);
			Player.SCORE = Player.SCORE + 1;
			System.out.println(Player.SCORE);
		}
		else{
			this.setX(this.getX() - 1);
		}
        this.setHasMoved();
    }

	/* (non-Javadoc)
	 * @see model.IMobile#moveDown()
	 */
	@Override
	//Operator use for move Down
	public void moveDown() {
		if (this.getMap().getOnTheMapXY(this.getX(), this.getY() + 1).getPermeability() == Permeability.BLOCKING){
			this.setY(this.getY());
		}
		else if (this.getMap().getOnTheMapXY(this.getX(), this.getY()+1).getPermeability() == Permeability.TAKE){
			this.setY(this.getY() + 1);
			Player.SCORE = Player.SCORE + 1;
			System.out.println(Player.SCORE);
		}
		else{
			this.setY(this.getY() + 1);
		}
        this.setHasMoved();
    }

	/* (non-Javadoc)
	 * @see model.IMobile#moveRight()
	 */
	@Override
	//Operator use for move Right
	public void moveRight() {
		if (this.getMap().getOnTheMapXY(this.getX() + 1, this.getY()).getPermeability() == Permeability.BLOCKING){
			this.setX(this.getX());
		}
		else if (this.getMap().getOnTheMapXY(this.getX() +1, this.getY()).getPermeability() == Permeability.TAKE){
			this.setX(this.getX() + 1);
			Player.SCORE = Player.SCORE + 1;
			System.out.println(Player.SCORE);
		}
		else {
			this.setX(this.getX() + 1);
		}
        this.setHasMoved();
    }

	/* (non-Javadoc)
	 * @see model.IMobile#doNothing()
	 */
	@Override
	public void doNothing() {
        this.setHasMoved();
    }

	private void setHasMoved() {
    this.getMap().setMobileHasChanged();

    }

	/* (non-Javadoc)
	 * @see model.IMobile#getX()
	 */
	@Override
	public final int getX() {
        return this.getPosition().x;
    }

	/* (non-Javadoc)
	 * @see model.IMobile#setX(int)
	 */
	public final void setX(final int x) {
        this.getPosition().x = x;
        if(this.asWon()){
        	System.out.println("Won");
        }
	}

    /* (non-Javadoc)
	 * @see model.IMobile#getY()
	 */
    @Override
	public final int getY() {
        return this.getPosition().y;
    }

    /* (non-Javadoc)
	 * @see model.IMobile#setY(int)
	 */
	public final void setY(final int y) {
        this.getPosition().y = (y + this.getMap().getHeight()) % this.getMap().getHeight();
        if(this.asWon()){
        	System.out.println("Won");
        }
    }
	

    /* (non-Javadoc)
	 * @see model.IMobile#getMap()
	 */
	public IMap getMap() {
        return this.map;
        }


    /* (non-Javadoc)
	 * @see model.IMobile#isAlive()
	 */
    @Override
	public boolean isAlive() {
        return this.alive;
    }

    protected void die() {
        this.alive = false;
        this.setHasMoved();
    }

    public boolean asWon() {
    	if (Player.SCORE >= SCOREMAX ){
    		return this.getMap().getOnTheMapXY(this.getX(), this.getY()).getPermeability() == Permeability.EXIT;
    	}
		return win;
    }

    protected void win(){
    	this.win = true;
    	this.setHasMoved();
    }

    /* (non-Javadoc)
	 * @see model.IMobile#getPosition()
	 */
    @Override
	public Point getPosition() {
        return this.position;
    }

    /* (non-Javadoc)
	 * @see model.IMobile#setPosition(java.awt.Point)
	 */
	public void setPosition(final Point position) {
        this.position = position;
    }

    protected IBoard getBoard() {
        return this.board;
    }

	@Override
	public boolean isDead() {
		return alive;
	}
}
