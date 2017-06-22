/**
 * @author Alexandre
 * @version 1.1
 */
package model;

import java.awt.Image;


public interface IElement {

	ISprite getSprite();

	Permeability getPermeability();

	Image getImage();

}