/**
 * @author Bruno
 * @version 1
 */
package Interface;

import java.io.IOException;

import Interface.UserOrder;

public interface IOrderPerformer {
	
	void orderPerform(UserOrder userOrder) throws IOException;

}
