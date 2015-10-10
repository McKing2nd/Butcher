package nl.mecking.butcher.level;

import nl.mecking.butcher.graphics.Screen;
import nl.mecking.butcher.level.tile.Tile;

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
		screen.setOffset(xScroll, yScroll);
		int x0 = xScroll >> 5;
		int x1 = (xScroll + screen.width + 32) >> 5;
		int y0 = yScroll >> 5;
		int y1 = (yScroll + screen.height + 32) >> 5;

		for (int y = y0; y < y1; y++) {
			for (int x = x0; x < x1; x++) {
				getTile(x, y).render(x, y, screen);
			}
		}
	}

	public Tile getTile(int x, int y) {
		if(x <0 || y<0 || x>= width || y>=height) return Tile.voidTile;
		if (tiles[x + y * width] == 0)
			return Tile.grass;
		return Tile.voidTile;
	}
}
