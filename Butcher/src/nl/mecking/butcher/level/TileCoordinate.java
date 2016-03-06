package nl.mecking.butcher.level;

import nl.mecking.butcher.graphics.Sprite;

public class TileCoordinate {
	private int x, y;
	
	public TileCoordinate(int x, int y) {
		this.x = x * Sprite.SIZE;
		this.y = y * Sprite.SIZE;
	}
	
	public int getY() {
		return y;
	}
	
	public int getX() {
		return x;
	}
	
}
