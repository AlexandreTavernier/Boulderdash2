package model;

import Interface.IMap;
import Interface.IMobile;

/**
 * @author Bruno
 * @version 1
 */

public interface IBoulderdashModel {
	
	IMap getMap();
	
	IMobile getPlayer();
}