/**
 * @author Alexandre Bruno
 * @version 1
 */
package model;

public abstract class MotionlessElementFactory  {
	private static final MotionlessElement WALL = new Wall();
	
	private static final MotionlessElement AIR = new Air();
	
	private static final MotionlessElement DIRT = new Dirt();
	
	private static final MotionlessElement DOOR = new Door();

	private static MotionlessElement[] motionlessElements = {
		  WALL,
		  AIR,
		  DIRT,
		  DOOR,
	};
	
	public static MotionlessElement createWall() {
	   return WALL;
	}
	
	public static MotionlessElement createAir(){
		return AIR;
	}
	
	public static MotionlessElement createDirt(){
		return DIRT;
	}
	
	public static MotionlessElement createDoor(){
		return DOOR;
	}
	
	public static MotionlessElement getFromFileSymbol(final char fileSymbol) 
	{
		for (final MotionlessElement motionlessElement : motionlessElements) {
			if (motionlessElement.getSprite().getConsoleImage() == fileSymbol) {
				return motionlessElement;
			}
		
		}
		return AIR;
		
	}
}
			

