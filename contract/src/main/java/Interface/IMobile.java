package Interface;

import java.awt.Point;

import fr.exia.showboard.IPawn;

public interface IMobile extends IPawn, IElement {

	void moveUp();

	void moveLeft();

	void moveDown();

	void moveRight();

	void doNothing();

	int getX();

	void setX(int x);

	int getY();

	void setY(int y);

	IMap getMap();

	Boolean isAlive();

	Boolean isDead();

	Point getPosition();

	void setPosition(Point position);

}
