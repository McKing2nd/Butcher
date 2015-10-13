package nl.mecking.butcher.graphics;

import nl.mecking.butcher.level.tile.Tile;

public class Screen {

	public final int width;
	public final int height;
	public int[] pixels;
	public final int MAP_SIZE = 64;
	public final int MAP_SIZE_MASK = MAP_SIZE - 1;

	private int xOffset, yOffset;

	public Screen(int width, int height) {
		this.width = width;
		this.height = height;
		// Array with every pixel on the game screen
		pixels = new int[width * height];

	}

	/*
	 * Clear makes all pixels in the array black
	 */
	public void clear() {
		for (int i = 0; i < pixels.length; i++) {
			pixels[i] = 0;
		}
	}

	/**
	 * Renders a tile on xTilePosition, yPosition
	 * 
	 * @param xTilePosition
	 * @param yTilePosition
	 * @param tile
	 */
	public void renderTile(int xTilePosition, int yTilePosition, Tile tile) {
		xTilePosition -= xOffset;
		yTilePosition -= yOffset;
		for (int y = 0; y < tile.sprite.SIZE; y++) {
			int yAbsolute = y + yTilePosition;
			for (int x = 0; x < tile.sprite.SIZE; x++) {
				int xAbsolute = x + xTilePosition;
				if (xAbsolute < 0 - tile.sprite.SIZE || xAbsolute >= width || yAbsolute < 0 || yAbsolute >= height)
					break;
				if (xAbsolute < 0) xAbsolute = 0;
				pixels[xAbsolute + yAbsolute * width] = tile.sprite.pixels[x + y * tile.sprite.SIZE];
			}
		}
	}

	public void renderPlayer(int xPlayerPosition, int yPlayerPosition, Sprite sprite) {
		xPlayerPosition -= xOffset;
		yPlayerPosition -= yOffset;
		for (int y = 0; y < 8; y++) {
			int yAbsolute = y + yPlayerPosition;
			for (int x = 0; x < 8; x++) {
				int xAbsolute = x + xPlayerPosition;
				if (xAbsolute < 0 - 32 || xAbsolute >= width || yAbsolute < 0 || yAbsolute >= height) break;
				if (xAbsolute < 0) xAbsolute = 0;
				int colour = sprite.pixels[x + y * 8];
				if (colour != 0x00000000) pixels[xAbsolute + yAbsolute * width] = colour;
			}
		}
	}

	public void setOffset(int xOffset, int yOffset) {
		this.xOffset = xOffset;
		this.yOffset = yOffset;
	}
}
