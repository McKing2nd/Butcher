package nl.mecking.butcher.level.tile;

import nl.mecking.butcher.graphics.Screen;
import nl.mecking.butcher.graphics.Sprite;

public class Tile {

	protected int x, y;
	public final Sprite sprite;
	
	public static Tile grass = new GrassTile(Sprite.grass);
	
	public Tile(Sprite sprite) {
		this.sprite = sprite;
	}
	
	public void render(int x, int y, Screen screen) {
		screen.renderTile(x, y, this);
	}
	
	public boolean solid() {
		return false;
	}
}
