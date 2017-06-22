package model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Observable;

public class Map extends Oservable implements IMap {
	private int width;
	private int height;
	private IElement[][] onTheMap;
	
	Map(final String fileName) throws IOException{
		super();
		this.loadFile(fileName);
	}
	
	private void loadFile(final String fileName) throws IOException{
		final BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
		String line;
		int y = 0;
		line = buffer.readLine();
		this.setWidth(Integer.parseInt(line));
		this.onTheMap = new IElement[this.getWidth()][this.getHeight()];
		line = buffer.readLine();
		while (line != null){
			for (int x = 0; x < line.toCharArray().length; x++){
				this.setOnTheMapXY(MotionlessElementsFactory.getFromFileSymbol(line.toCharArray()[x]), x, y);
			}
			line = buffer.readLine();
			y++;
		}
		buffer.close();
	}

	/* (non-Javadoc)
	 * @see model.IMap#getWidth()
	 */
	@Override
	public int getWidth() {
		return width;
	}

	/* (non-Javadoc)
	 * @see model.IMap#getHeight()
	 */
	@Override
	public int getHeight() {
		return height;
	}

	private void setWidth(int width) {
		this.width = width;
	}

	private void setHeight(int height) {
		this.height = height;
	}
	
	/* (non-Javadoc)
	 * @see model.IMap#getOnTheMapXY(int, int)
	 */
	@Override
	public final IElement getOnTheMapXY(final int x, final int y){
		return this.onTheMap[x][y];
	}
	
	/* (non-Javadoc)
	 * @see model.IMap#setOnTheMapXY(model.IElement, int, int)
	 */
	@Override
	public void setOnTheMapXY(final IElement element, final int x, final int y){
		this.onTheMap[x][y] = element;
	}
	
	/* (non-Javadoc)
	 * @see model.IMap#setMobileHasChanged()
	 */
	@Override
	public final void setMobileHasChanged(){
		this.setChanged();
		this.notifyObservers();
	}
	
	/* (non-Javadoc)
	 * @see model.IMap#getObservable()
	 */
	@Override
	public Observable getObservable(){
		return this;
	}
	
}
