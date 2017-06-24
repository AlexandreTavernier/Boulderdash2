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
	
<<<<<<< HEAD
=======
	private static final MotionlessElement ENEMY1 = new Enemy1();

>>>>>>> ee8c5abfc615c895a4c97baebb2081313a2c4d01
	private static MotionlessElement[] motionlessElements = {
		  WALL,
		  AIR,
		  DOOR,
		  DIAMOND,
		  DIRT,
		  ENEMY1,
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

	public static MotionlessElement createDiamond(){
		return DIAMOND;
	}

	public static MotionlessElement createDirt(){
		return DIRT;
	}
	
	public static MotionlessElement createEnemy1(){
		return ENEMY1;
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
			

