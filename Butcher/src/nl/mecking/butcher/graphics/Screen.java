package nl.mecking.butcher.graphics;

public class Screen {

	private int width, height;
	public int[] pixels;
	public final int MAP_SIZE = 64;
	public final int MAP_SIZE_MASK = MAP_SIZE - 1;

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

	public void render(int xOffset, int yOffset) {
		for (int y = 0; y < height; y++) {
			if (y < 0 || y >= height)
				break;
			for (int x = 0; x < width; x++) {
				if (x < 0 || x >= width)
					break;
				pixels[x + y * width] = Sprite.grass.pixels[(x & 15) + (y & 15) * Sprite.grass.SIZE];
			}
		}
	}
}
