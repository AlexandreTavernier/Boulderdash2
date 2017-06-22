/**
 * @author Alexandre
 * @version 1.1
 */
package model;

import java.awt.Image;

public abstract class Element implements IElement {
	private ISprite sprite;
	private Permeability permeability;
	
	public Element(final ISprite sprite, final Permeability permeability){
		this.setSprite(sprite);
		this.setPermeability(permeability);	
	}
	
	/* (non-Javadoc)
	 * @see model.IElement#getSprite()
	 */
	@Override
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
	
	protected final void setPermeability(final Permeability permeabiliy){
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
