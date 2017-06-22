/**
 * @author Alexandre
 * @version 1
 */
package model;

public abstract class MotionlessElementFactory  {

	private static final MotionlessElement WALL = new Wall();
	
	private static MotionlessElement[] motionlessElements = {
		  WALL,
	};
	
	public static MotionlessElement createWall() {
	   return WALL;
	}

	public static MotionlessElement getFromFileSymbol(final char fileSymbol) {
			for (final MotionlessElement motionlessElement : motionlessElements) {
					if (motionlessElement.getSprite().getConsoleImage() == fileSymbol) {
							return motionlessElement;
					}
			}
			return WALL;
	}
}
			

