package model;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Sprite {
	private Image image;
	private String imageName;
	private char consoleImage;
	private boolean imageLoaded;
		
		
	public Sprite(char character, String imageName){
		this.setConsoleImage(character);
		this.setImageName(imageName);
	}
}
