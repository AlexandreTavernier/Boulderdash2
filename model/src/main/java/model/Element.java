/**
 * @author Alexandre Bruno
 * @version 1.1
 */
package model;

import java.awt.Image;

import Interface.IElement;
import Interface.ISprite;
import Interface.Permeability;

public abstract class Element implements IElement {
	private ISprite sprite;
	private Permeability permeability;
	
	public Element(final ISprite sprite, final Permeability permeability, int spriteX, int spriteY){
		this.setSprite(sprite);
		this.setPermeability(permeability);	
		this.setSpriteX(spriteX);
		this.setSpriteY(spriteY);
	}
	
	public void setSpriteY(int spriteY) {
		// TODO Auto-generated method stub
		
	}

	public void setSpriteX(int spriteX) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see model.IElement#getSprite()
	 */
	public final ISprite getSprite(){
		return this.sprite;
	}
	
	protected final void setSprite(final ISprite sprite){
		this.sprite = sprite;
	}
	
	/* (non-Javadoc)
	 * @see model.IElement#getPermeability()
	 */
	@Override
	public final Permeability getPermeability(){
		return this.permeability;
	}
	
	protected void setPermeability(final Permeability permeability){
		this.permeability = permeability;
	}
	
	/* (non-Javadoc)
	 * @see model.IElement#getImage()
	 */
	@Override
	public final Image getImage(){
		return this.getSprite().getImage();
	}
}
