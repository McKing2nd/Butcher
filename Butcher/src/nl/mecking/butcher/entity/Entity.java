package nl.mecking.butcher.entity;

import java.util.Random;

import nl.mecking.butcher.graphics.Screen;
import nl.mecking.butcher.level.Level;

public abstract class Entity {

	public int x, y;
	private boolean removed;
	protected Level level;
	protected final Random random = new Random();
	
	public void update() {
	}
	
	public void render(Screen screen) {
	}
	
	public void remove() {
		removed = true;
	}
	
	public boolean isRemoved() {
		return removed;
	}
}
