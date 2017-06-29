package model;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import controller.BoulderdashController;
import view.Assets;
import view.BoulderdashView;
import view.GameCamera;

public class BoulderdashModel implements Runnable {
	
	private boolean running = false;
	private Thread thread;
	
	private BoulderdashView display;
	
	private int width, height;
	public String title;
	
	private BufferStrategy bs;
	private Graphics g;
	
	//Input
	private BoulderdashController keyManager;
	
	//Handler
	private Handler handler;
	
	//States
	private State gameState;
	
	//Camera
	private GameCamera gameCamera;
		
	public BoulderdashModel(String title, int width, int height){
		this.width = width;
		this.height = height;
		this.title = title;
		keyManager = new BoulderdashController();
	}

	public void run() {
		
		init();
		
		int fps = 30;
		//1s = 1 billion nanosecond
		double timePerTick = 1000000000 / fps;
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();
		
		while(running){
			now = System.nanoTime();
			delta += (now - lastTime) / timePerTick;
			lastTime = now;
			
			if (delta >= 1){
				tick();
				render();
				delta --;
			}
		
		}
		
		stop();
		
	}
	
	private void init() {
		display = new BoulderdashView(title, width, height);
		display.getFrame().addKeyListener(keyManager);
		Assets.init();
		
		handler = new Handler(this);
		gameCamera = new GameCamera(handler, 0, 0);
		
		gameState = new GameState(handler);
		State.setState(gameState);
	}
	
	private void tick(){
		keyManager.tick();
		
		if (State.getState() != null) State.getState().tick();
	}
	
	private void render(){
		//Buffer
		bs = display.getCanvas().getBufferStrategy();
		if(bs == null){
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		//Paint
		g = bs.getDrawGraphics();
		//Clear Screen
		g.clearRect(0, 0, width, height);
		
		//Draw
		if (State.getState() != null) State.getState().render(g);
		
		//End
		bs.show();
		g.dispose();
	}
	
	public BoulderdashController getKeyManager(){
		return keyManager;
	}
	
	
	
	//Start the game
	public synchronized void start(){
		if(running) return;
		running = true;
		
		thread = new Thread(this);
		thread.start();
	}
	
	//Stop the game
	public synchronized void stop(){
		if(!running) return;
		running = false;
		
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	
	public GameCamera getGameCamera(){
		return gameCamera;
	}
}
