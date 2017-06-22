/**
 * @author Alexandre
 * @version 1.1
 */
package model;

import java.awt.Image;

import Interface.ISprite;
import Interface.Permeability;

public interface IElement {

	ISprite getSprite();

	Permeability getPermeability();

	Image getImage();

}