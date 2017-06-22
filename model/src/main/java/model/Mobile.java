package model;

import java.awt.Point;

public class Mobile extends Element {
	private Point position;
	private Boolean alive = true;
	private IMap map;
	
	
	Mobile(final Sprite sprite, final IMap map, final Permeability permeability){
		super(sprite, permeability);
		this.setMap(map);
		this.position = new Point();
	}
	
	Mobile(final int x, final int y, final Sprite sprite, final IMap map, final Permeability permeability){
		this(sprite, map, permeability);
		
	}
	
	private void setMap(final IMap map) {
        this.map = map;
    }
	
	
	
	

}
