package nl.mecking.butcher.level.tile;

import nl.mecking.butcher.graphics.Screen;
import nl.mecking.butcher.graphics.Sprite;

public class VoidTile extends Tile {

	public VoidTile(Sprite sprite) {
		super(sprite);
	}
	
	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << 5, y << 5, this);
	}
}
