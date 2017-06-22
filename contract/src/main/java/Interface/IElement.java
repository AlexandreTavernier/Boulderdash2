/**
 * @author Alexandre
 * @version 1.1
 */
package Interface;

import java.awt.Image;

import fr.exia.showboard.ISquare;


public interface IElement extends ISquare {

	ISprite getSprite();

	Permeability getPermeability();
	
	@Override
	Image getImage();

}