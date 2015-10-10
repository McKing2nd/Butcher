package nl.mecking.butcher.entity.mob;

import nl.mecking.butcher.entity.Entity;
import nl.mecking.butcher.graphics.Sprite;

public abstract class Mob extends Entity {
	public static final int NORTH = 0;
	public static final int EAST = 1;
	public static final int SOUTH = 2;
	public static final int WEST = 3;

	protected Sprite sprite;
	protected int direction;
	protected boolean moving = false;

	public void move(int deltaX, int deltaY) {
		if (deltaX > 0) direction = EAST;
		if (deltaX < 0) direction = WEST;
		if (deltaY > 0) direction = SOUTH;
		if (deltaY < 0) direction = NORTH;
		
		if (!collision()) {
			x += deltaX;
			y += deltaY;
		}
	}

	public void update() {
	}

	private boolean collision() {
		return false;
	}
}
