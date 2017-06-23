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
	private static final int SCOREMAX = 1;
	private Boolean win = false;
	
	private Point position;
	private Boolean alive = true;
	private IMap map;
	private IBoard board;
	
	
	Mobile(final ISprite sprite, final IMap map, final Permeability permeability){
		super(sprite, permeability);
		this.setMap(map);
		this.position = new Point();
	}
	
	Mobile(final int x, final int y, final ISprite sprite, final IMap map, final Permeability permeability){
		this(sprite, map, permeability);
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
	public void moveUp() {
		if(this.getY() == 1){
			this.setY(this.getY());
		}else{
			this.setY(this.getY() - 1);
		}
        this.setHasMoved();
    }
	
	/* (non-Javadoc)
	 * @see model.IMobile#moveLeft()
	 */
	@Override
	public void moveLeft() {
		if(this.getX() == 1){
			this.setX(this.getX());
		}else{
			this.setX(this.getX() - 1);
		}
        this.setHasMoved();
    }
	
	/* (non-Javadoc)
	 * @see model.IMobile#moveDown()
	 */
	@Override
	public void moveDown() {
		if(this.getY() == 8){
			this.setY(this.getY());
		}else{
			this.setY(this.getY() + 1);
		}
        this.setHasMoved();
    }
	
	/* (non-Javadoc)
	 * @see model.IMobile#moveRight()
	 */
	@Override
	public void moveRight() {
		if (this.getX() == 8){
			this.setX(this.getX());
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
        if (this.isDead()) {
        	System.out.println("Dead");
            //this.die();
        }
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
        if (this.isDead()) {
            this.die();
        }
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
    
    /* (non-Javadoc)
	 * @see model.IMobile#isDead()
	 */
    @Override
	public boolean isDead() {
        return this.getMap().getOnTheMapXY(this.getX(), this.getY()).getPermeability() == Permeability.BLOCKING;
    }
    
    public boolean asWon() {
    	if (Player.SCORE == SCOREMAX ){
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
}
