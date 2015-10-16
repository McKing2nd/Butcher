package nl.mecking.butcher.graphics;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SpriteSheet {

	private int height;
	private int width;
	private String path;

	public int[] pixels;

	public static SpriteSheet tiles = new SpriteSheet("/sprites/tiles.png");
	public static SpriteSheet tiles1 = new SpriteSheet("/sprites/Tiles1.png");
	public static SpriteSheet newTiles = new SpriteSheet("/sprites/Objects/Floor.png");
	public static SpriteSheet warrior = new SpriteSheet("/sprites/Commissions/Warrior.png");

	// TODO Is size needed here? Or can we extract that from the image itself?
	public SpriteSheet(String path) {
		this.path = path;

		load();
	}

	private void load() {
		try {
			BufferedImage image = ImageIO.read(SpriteSheet.class.getResource(path));
			width = image.getWidth();
			height = image.getHeight();
			pixels = new int[width * height];
			image.getRGB(0, 0, width, height, pixels, 0, width);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
		return width;
	}
}
