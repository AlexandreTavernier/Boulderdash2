package model;

import java.awt.Point;

public class Mobile extends Element {
	private Point position;
	private Boolean alive = true;
	private IMap map;
	
	
	Mobile(final Sprite sprite, final IMap map, final Permeability permeability){
		super(sprite, permeability);
		this.setMap(map);
		this.position = new Point
	}
	
	Mobile(final int x, final int y, final Sprite sprite, final IMap map, final Permeability permeability){
		this(sprite, map, permeability);
		this.setX(x);
        this.setY(y);
	}
	
	private void setMap(final IMap map) {
        this.map = map;
    }
	
	public void moveUp() {
        this.setY(this.getY() - 1);
        this.setHasMoved();
    }
	
	public void moveLeft() {
        this.setX(this.getX() - 1);
        this.setHasMoved();
    }
	
	public void moveDown() {
        this.setY(this.getY() + 1);
        this.setHasMoved();
    }
	
	public void moveRight() {
        this.setX(this.getX() + 1);
        this.setHasMoved();
    }
	
	public void doNothing() {
        this.setHasMoved();
    }

	private void setHasMoved() {
    this.getMap().setMobileHasChanged();
    }
	
	public final int getX() {
        return this.getPosition().x;
    }
	
	public final void setX(final int x) {
        this.getPosition().x = x;
        if (this.isDead()) {
            this.die();
        }
	}    
	
    public final int getY() {
        return this.getPosition().y;
    }
    
    public final void setY(final int y) {
        this.getPosition().y = (y + this.getMap().getHeight()) % this.getMap().getHeight();
        if (this.isDead()) {
            this.die();
        }
    }    
        
    public IMap getMap() {
        return this.map;
        }    
    
    private void setRoad(final IMap road) {
        this.map = road;
    }

    public Boolean isAlive() {
        return this.alive;
    }
    
    protected void die() {
        this.alive = false;
        this.setHasMoved();
    }
    
    public Boolean isDead() {
        return this.getMap().getOnTheMapXY(this.getX(), this.getY()).getPermeability() == Permeability.BLOCKING;
    }
    
    public Point getPosition() {
        return this.position;
    }
        
    public void setPosition(final Point position) {
        this.position = position;
    }

    protected IMap getBoard() {
        return this.map;
    }    
}
