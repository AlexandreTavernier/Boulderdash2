/**
 * @author Alexandre
 * @version 1.1
 */
package model;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import Interface.ISprite;

public class Sprite implements ISprite {
	private Image image;
	private String imageName;
	private char consoleImage;
	private boolean imageLoaded;
		
		
	public Sprite(char character, String imageName){
		this.setConsoleImage(character);
		this.setImageName(imageName);
	}
	
	public Sprite(final char character){
		this(character, "noimage.jpg");
	}
	
	/* (non-Javadoc)
	 * @see model.ISprite#getImage()
	 */

	public final Image getImage(){
		return this.image;
	}
		
	/* (non-Javadoc)
	 * @see model.ISprite#loadImage()
	 */
	//find sprite, for loading
	public final void loadImage() throws IOException{
		this.setImage(ImageIO.read(new File("C:/Users/taver/git/Boulderdash2/Sprites/" + this.getImageName())));
	}
	
	/* (non-Javadoc)
	 * @see model.ISprite#getConsoleImage()
	 */
	public final char getConsoleImage(){
		return this.consoleImage;
	}
	
	private void setImage(final Image image){
		this.image = image;
	}
	
	private void setConsoleImage(final char consoleImage){
		this.consoleImage = consoleImage;
	}
	
	/* (non-Javadoc)
	 * @see model.ISprite#getImageName()
	 */
	public final String getImageName(){
		return this.imageName;
	}
	
	private void setImageName(final String imageName){
		this.imageName = imageName;
	}
	
	/* (non-Javadoc)
	 * @see model.ISprite#isImageLoaded()
	 */
	public final boolean isImageLoaded(){
		return this.imageLoaded;
	}
	
	/* (non-Javadoc)
	 * @see model.ISprite#setImageLoaded(boolean)
	 */
	public final void setImageLoaded(final boolean isImageLoaded){
		this.imageLoaded = isImageLoaded;
	}
}
