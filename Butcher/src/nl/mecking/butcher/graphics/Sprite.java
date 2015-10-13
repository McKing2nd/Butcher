package nl.mecking.butcher.graphics;

public class Sprite {

	public final int SIZE;
	private int x, y;
	public int[] pixels;
	private SpriteSheet sheet;

	public static Sprite grass = new Sprite(8, 1, 1, SpriteSheet.newTiles);
	public static Sprite wall = new Sprite(8, 4, 1, SpriteSheet.newTiles);
	public static Sprite woodenFloor = new Sprite(8, 7, 1, SpriteSheet.newTiles);
	public static Sprite voidSprite = new Sprite(8, 0x0000ff);
	
	// TODO: move player sprites to player class?
	// PlayerSprites
	public static Sprite player_south = new Sprite(32, 0, 4, SpriteSheet.tiles);
	public static Sprite player_south_1 = new Sprite(32, 1, 4, SpriteSheet.tiles);
	public static Sprite player_south_2 = new Sprite(32, 2, 4, SpriteSheet.tiles);
	
	public static Sprite player_west = new Sprite(32, 0, 5, SpriteSheet.tiles);
	public static Sprite player_west_1 = new Sprite(32, 1, 5, SpriteSheet.tiles);
	public static Sprite player_west_2 = new Sprite(32, 2, 5, SpriteSheet.tiles);
	
	// TODO : Flip this from west
	public static Sprite player_east = new Sprite(32, 0, 6, SpriteSheet.tiles);
	public static Sprite player_east_1 = new Sprite(32, 1, 6, SpriteSheet.tiles);
	public static Sprite player_east_2 = new Sprite(32, 2, 6, SpriteSheet.tiles);
	
	public static Sprite player_north = new Sprite(32, 0, 7, SpriteSheet.tiles);
	public static Sprite player_north_1 = new Sprite(32, 1, 7, SpriteSheet.tiles);
	public static Sprite player_north_2 = new Sprite(32, 2, 7, SpriteSheet.tiles);

	public Sprite(int size, int x, int y, SpriteSheet sheet) {
		this.SIZE = size;
		this.pixels = new int[SIZE * SIZE];
		this.x = x * SIZE;
		this.y = y * SIZE;
		this.sheet = sheet;
		load();
	}
	
	public Sprite(int size, int colour) {
		SIZE = size;
		pixels = new int[SIZE*SIZE];
		setColour(colour);
	}
	
	private void setColour(int colour) {
		for (int i=0; i < SIZE*SIZE;i++)
			pixels[i] = colour;
	}

	private void load() {
		for (int y = 0; y < SIZE; y++) {
			for (int x = 0; x < SIZE; x++) {
				pixels[x + y * SIZE] = sheet.pixels[(x + this.x) + (y + this.y) * sheet.getHeight()];
			}
		}
	}
}
