/**
 * @author Alexandre
 * @version 1
 */
package model;

public abstract class MotionlessElementFactory  {

	public static MotionlessElement getFromFileSymbol(final char fileSymbol) {
			for (final MotionlessElement motionlessElement : motionlessElement) {
					if (motionlessElement.getSprite().getConsoleImage() == fileSymbol) {
							return motionlessElement;
					}
			}
	}
}
			

