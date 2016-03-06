package nl.mecking.butcher.graphics;

public class Sprite {

	public static final int SIZE = 16;
	private int x, y;
	public int[] pixels;
	private SpriteSheet sheet;

	public static Sprite grass = new Sprite(8, 7, SpriteSheet.floorTiles);
	public static Sprite wall = new Sprite(1, 4, SpriteSheet.floorTiles);
	public static Sprite woodenFloor = new Sprite(8, 19, SpriteSheet.floorTiles);
	public static Sprite voidSprite = new Sprite(16, 0x0000ff);
	
	// TODO: move player sprites to player class?
	// PlayerSprites
	public static Sprite player_south = new Sprite(0, 0, SpriteSheet.warrior);
	public static Sprite player_south_1 = new Sprite(1, 0, SpriteSheet.warrior);
	public static Sprite player_south_2 = new Sprite(3, 0, SpriteSheet.warrior);
	
	public static Sprite player_west = new Sprite(0, 1, SpriteSheet.warrior);
	public static Sprite player_west_1 = new Sprite(1, 1, SpriteSheet.warrior);
	public static Sprite player_west_2 = new Sprite(3, 1, SpriteSheet.warrior);
	
	// TODO : Flip this from west
	public static Sprite player_east = new Sprite(0, 2, SpriteSheet.warrior);
	public static Sprite player_east_1 = new Sprite(1, 2, SpriteSheet.warrior);
	public static Sprite player_east_2 = new Sprite(3, 2, SpriteSheet.warrior);
	
	public static Sprite player_north = new Sprite(0, 3, SpriteSheet.warrior);
	public static Sprite player_north_1 = new Sprite(1, 3, SpriteSheet.warrior);
	public static Sprite player_north_2 = new Sprite(3, 3, SpriteSheet.warrior);

	public Sprite(int x, int y, SpriteSheet sheet) {
		this.pixels = new int[SIZE * SIZE];
		this.x = x * SIZE;
		this.y = y * SIZE;
		this.sheet = sheet;
		load();
	}
	
	public Sprite(int size, int colour) {
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
				pixels[x + y * SIZE] = sheet.pixels[(x + this.x) + (y + this.y) * sheet.getWidth()];
			}
		}
	}
}
