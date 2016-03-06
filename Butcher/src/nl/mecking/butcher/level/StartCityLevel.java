package nl.mecking.butcher.level;

public class StartCityLevel extends Level{
	
	private static int[][] levelLayout = new int[][]{
		  { 1 ,1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },	
		  { 1 ,0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
		  { 1 ,0, 2, 0, 0, 0, 0, 0, 0, 2, 0, 1 },
		  { 1 ,0, 2, 0, 0, 0, 0, 0, 0, 2, 0, 1 },
		  { 1 ,0, 0, 0, 0, 3, 3, 0, 0, 0, 0, 1 },
		  { 1 ,0, 2, 0, 0, 0, 0, 0, 0, 2, 0, 1 },
		  { 1 ,0, 2, 0, 0, 0, 0, 0, 0, 2, 0, 1 },
		  { 1 ,0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
		  { 1 ,1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
		};
	
	public StartCityLevel() {
		super(levelLayout[0].length, levelLayout.length);
		generateLevel();
	}

	public void generateLevel() {
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				tiles[x + y * width] = levelLayout[y][x];
			}
		}
	}
}
