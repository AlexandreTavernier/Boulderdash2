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
	public static MotionlessElement getFromFileSymbol(final char fileSymbol) {
			for (final MotionlessElement motionlessElement : motionlessElement) {
					if (motionlessElement.getSprite().getConsoleImage() == fileSymbol) {
							return motionlessElement;
					}
			}
>>>>>>> 41bab14f9055f4bb76bad5d9e43cd05e641612ff
	}
}
			

