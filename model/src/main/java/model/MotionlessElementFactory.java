package model;

public abstract class MotionlessElementFactory  {

	public static MotionlessElement getFromFileSymbol(final char fileSymbol) {
			for (final MotionlessElement motionlessElement : motionlessElements) {
					if (motionlessElement.getSprite().getConsoleImage() == fileSymbol) {
							return motionlessElement;
					}
			}

}
