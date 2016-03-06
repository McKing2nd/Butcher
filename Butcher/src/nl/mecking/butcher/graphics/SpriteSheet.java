package nl.mecking.butcher.graphics;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SpriteSheet {

	private int height;
	private int width;
	private String path;

	public int[] pixels;

	public static SpriteSheet floorTiles = new SpriteSheet("/sprites/Objects/Floor.png");
	public static SpriteSheet warrior = new SpriteSheet("/sprites/Commissions/Warrior.png");

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
			// TODO Add log4j logging
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
