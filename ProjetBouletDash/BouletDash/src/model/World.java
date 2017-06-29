package model;

import java.awt.Graphics;

import model.entity.Boulder;
import model.entity.Diamond;
import model.entity.Dirt;
import model.entity.Enemy;
import model.entity.EntityManager;
import model.entity.Exit;
import model.entity.Player;
import model.tiles.Tile;

public class World {
	
	private Handler handler;
	
	private int width, height;
	private static int spawnX;
	private static int spawnY;
	
	private int [][] tiles ;
	
	private EntityManager entityManager;
	 
	
	public World(Handler handler, String path){
		this.setHandler(handler);
		entityManager = new EntityManager(handler, new Player(handler, 0,0));
		entityManager.addEntity(new Enemy(handler, 10 * Tile.TILEWIDTH,2 * Tile.TILEHEIGHT));
		entityManager.addEntity(new Exit(handler, 15 * Tile.TILEWIDTH,18 * Tile.TILEHEIGHT));
		
		entityManager.addEntity(new Diamond(handler, 10 * Tile.TILEWIDTH,10 * Tile.TILEHEIGHT));
		entityManager.addEntity(new Diamond(handler, 9 * Tile.TILEWIDTH,16 * Tile.TILEHEIGHT));
		entityManager.addEntity(new Diamond(handler, 5 * Tile.TILEWIDTH,1 * Tile.TILEHEIGHT));
		entityManager.addEntity(new Diamond(handler, 12 * Tile.TILEWIDTH,3 * Tile.TILEHEIGHT));
		entityManager.addEntity(new Diamond(handler, 2 * Tile.TILEWIDTH,18 * Tile.TILEHEIGHT));
		entityManager.addEntity(new Diamond(handler, 2 * Tile.TILEWIDTH,13 * Tile.TILEHEIGHT));
		
		entityManager.addEntity(new Dirt(handler, 4 * Tile.TILEWIDTH,1 * Tile.TILEHEIGHT));
		entityManager.addEntity(new Dirt(handler, 4 * Tile.TILEWIDTH,2 * Tile.TILEHEIGHT));
		entityManager.addEntity(new Dirt(handler, 3 * Tile.TILEWIDTH,1 * Tile.TILEHEIGHT));
		entityManager.addEntity(new Dirt(handler, 9 * Tile.TILEWIDTH,10 * Tile.TILEHEIGHT));
		entityManager.addEntity(new Dirt(handler, 10 * Tile.TILEWIDTH,9 * Tile.TILEHEIGHT));
		entityManager.addEntity(new Dirt(handler, 1 * Tile.TILEWIDTH,13 * Tile.TILEHEIGHT));
		entityManager.addEntity(new Dirt(handler, 1 * Tile.TILEWIDTH,12 * Tile.TILEHEIGHT));
		
		entityManager.addEntity(new Boulder(handler, 5 * Tile.TILEWIDTH,18 * Tile.TILEHEIGHT));
		
		loadWorld(path);
		
		entityManager.getPlayer().setX(spawnX * Tile.TILEWIDTH);
		entityManager.getPlayer().setY(spawnY * Tile.TILEHEIGHT);
	}
	
	public void tick(){
		entityManager.tick();
	}
	
	public void render(Graphics g){
		int xStart = (int) Math.max(0, handler.getGameCamera().getxOffset() / Tile.TILEWIDTH);
		int xEnd = (int) Math.min(width, (handler.getGameCamera().getxOffset() + handler.getWidth()) / Tile.TILEWIDTH + 1);
		int yStart = (int) Math.max(0, handler.getGameCamera().getyOffset() / Tile.TILEHEIGHT);
		int yEnd = (int) Math.min(height, (handler.getGameCamera().getyOffset() + handler.getHeight()) / Tile.TILEHEIGHT + 1);
		
		for(int y = yStart;y < yEnd;y++){
			for(int x = xStart;x < xEnd;x++){
				getTile(x, y).render(g, (int) (x * Tile.TILEWIDTH - handler.getGameCamera().getxOffset()),
						(int) (y * Tile.TILEHEIGHT - handler.getGameCamera().getyOffset()));
			}
		}
		//Entities
		entityManager.render(g);
	}
	
	public Tile getTile(int x, int y){
		if( x < 0 || y < 0 || x >= width || y >= height)
			return Tile.dirtTile;
		
		Tile t = Tile.tiles[tiles[x][y]];
		if (t == null) 
			return Tile.dirtTile;
		return t;
	}
	
	private void loadWorld(String path){
		String file = Utils.loadFileAsString(path);
		String[] tokens = file.split("\\s+");
		
		width = Utils.parseInt(tokens[0]);
		height = Utils.parseInt(tokens[1]);
		
		spawnX = Utils.parseInt(tokens[2]);
		spawnY = Utils.parseInt(tokens[3]);
		
		tiles = new int[width] [height];
		for(int y = 0;y < height; y++){
			for(int x = 0; x < width; x++){
				tiles[x][y] = Utils.parseInt(tokens[(x + y * width) + 4]);
			}
		}
	
	}
	

	public static int getSpawnX() {
		return spawnX;
	}

	public static int getSpawnY() {
		return spawnY;
	}

	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}
	
	public EntityManager getEntityManager(){
		return entityManager;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int[][] getTiles() {
		return tiles;
	}

	public void setTiles(int[][] tiles) {
		this.tiles = tiles;
	}

}
