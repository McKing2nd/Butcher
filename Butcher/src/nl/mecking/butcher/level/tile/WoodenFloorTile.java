package nl.mecking.butcher.level.tile;

import nl.mecking.butcher.graphics.Screen;
import nl.mecking.butcher.graphics.Sprite;

public class WoodenFloorTile extends Tile {

	public WoodenFloorTile(Sprite sprite) {
		super(sprite);
	}

	@Override
	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << 5, y << 5, this);
	}
}
