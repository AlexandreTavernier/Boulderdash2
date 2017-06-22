/**
 * @author Alexandre
 * @version 1
 */
package model;

public abstract class MotionlessElementFactory  {

<<<<<<< HEAD

	public static MotionlessElement getFromFileSymbol(final char fileSymbol) 
	{
		for (final MotionlessElement motionlessElement : motionlessElement) {
			if (motionlessElement.getSprite().getConsoleImage() == fileSymbol) {
				return motionlessElement;
			}
		}

=======
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
>>>>>>> dfa6a997728571dad3dab557f82ee1cefb088ae8
	}
}
			

