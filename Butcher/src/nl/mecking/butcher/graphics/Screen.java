package nl.mecking.butcher.graphics;

import java.util.Random;

public class Screen {

	private int width, height;
	public int[] pixels;
	
	public int[] tiles = new int[64*64];
	
	private Random random = new Random();
	
	public Screen(int width, int height) {
		this.width = width;
		this.height = height;
		// Array with every pixel on the game screen
		pixels = new int[width*height];
		
		/*
		 * Set up colors for the tiles
		 */
		for (int i=0; i< 64 * 64; i++) {
			tiles[i] = random.nextInt(0xffffff);
		}
	}
	
	/*
	 * Clear makes all pixels in the array black
	 */
	public void clear() {
		for(int i=0; i < pixels.length; i++) {
			pixels[i] = 0;
		}
	}
	
	public void render() {
		for(int y=0; y < height; y++) {
			if(y < 0 || y >= height) break;
			for(int x=0; x<width; x++) {
				if(x < 0 || x >= width) break;
				int tileIndex = (x >> 4) + (y >> 4) * 64; // >> 4 is the same as /16
				pixels[x + y * width] = tiles[tileIndex];
			}
		}
	}
	
}
