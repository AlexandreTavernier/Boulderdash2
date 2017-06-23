/**
 * @author Alexandre Bruno
 * @version 1
 */
package model;

public abstract class MotionlessElementFactory  {
	private static final MotionlessElement WALL = new Wall();
	
	private static final MotionlessElement AIR = new Air();
	
	private static final MotionlessElement DOOR = new Door();
	
	private static final MotionlessElement DIAMOND = new Diamond();

	private static final MotionlessElement DIRT = new Dirt();

	private static MotionlessElement[] motionlessElements = {
		  WALL,
		  AIR,
		  DOOR,
<<<<<<< HEAD
		  DIAMOND,
=======
		  DIRT,
>>>>>>> a90d4a508339a675c71cc58d88d3b0279e6d5fe5
	};
	
	public static MotionlessElement createWall() {
	   return WALL;
	}
	
	public static MotionlessElement createAir(){
		return AIR;
	}
	
	public static MotionlessElement createDoor(){
		return DOOR;
	}
	
<<<<<<< HEAD
	public static MotionlessElement createDiamond(){
		return DIAMOND;
	}
=======
	public static MotionlessElement createDirt(){
		return DIRT;
	}
	
>>>>>>> a90d4a508339a675c71cc58d88d3b0279e6d5fe5
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
			

