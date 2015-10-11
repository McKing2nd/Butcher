package nl.mecking.butcher.graphics;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SpriteSheet {

	public final int SIZE;
	private String path;
	
	public int[] pixels;
	
	public static SpriteSheet tiles = new SpriteSheet("/sprites/tiles.png", 256);
	public static SpriteSheet tiles1 = new SpriteSheet("/sprites/Tiles1.png",960);

	// TODO Is size needed here? Or can we extract that from the image itself?
	public SpriteSheet(String path, int size) {
		this.path = path;
		this.SIZE = size;
		pixels = new int[SIZE * SIZE];
		load();
	}

	private void load() {
		try {
			BufferedImage image = ImageIO.read(SpriteSheet.class.getResource(path));
			int w = image.getWidth();
			int h = image.getHeight();
			image.getRGB(0, 0, w, h, pixels, 0, w);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
