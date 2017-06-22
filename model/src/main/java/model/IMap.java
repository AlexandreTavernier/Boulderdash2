/**
 * @author Alexandre
 * @version 1.1
 */
package model;

import java.util.Observable;

public interface IMap {

	int getWidth();

	int getHeight();

	IElement getOnTheMapXY(int x, int y);

	void setOnTheMapXY(IElement element, int x, int y);

	void setMobileHasChanged();

	Observable getObservable();

}