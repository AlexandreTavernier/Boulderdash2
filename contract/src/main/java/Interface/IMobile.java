package Interface;

import java.awt.Point;

import fr.exia.showboard.IPawn;

public interface IMobile extends IPawn, IElement {

	void moveUp();

	void moveLeft();

	void moveDown();

	void moveRight();

	void doNothing();

	@Override
	int getX();

	void setX(int x);

	@Override
	int getY();

	void setY(int y);

	IMap getMap();

	boolean isAlive();

	boolean isDead();

	@Override
	Point getPosition();

	boolean asWon();

}
