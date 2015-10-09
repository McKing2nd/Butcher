package nl.mecking.butcher.level;

import nl.mecking.butcher.graphics.Screen;

public class Level {

	protected int width, height;
	protected int[] tiles;
	
	public Level(int width, int height) {
		this.height = height;
		this.width = width;
		tiles = new int[width * height];
		generateLevel();
	}
	
	public Level(String path) {
		loadLevel(path);
	}
	
	private void generateLevel() {
		
	}
	
	private void loadLevel(String Path) {
		
	}
	
	public void update() {
		
	}
	
	private void time() {
		
	}
	
	public void render(int xScroll, int yScroll, Screen screen) {
		
	}
}
