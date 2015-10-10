package nl.mecking.butcher.level;

import java.util.Random;

public class RandomLevel extends Level {

	private final static Random random = new Random();

	public RandomLevel(int width, int height) {
		super(width, height);
		generateLevel();
	}

	public void generateLevel() {
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				tiles[x + y * width] = random.nextInt(4);
			}
		}
	}
}
