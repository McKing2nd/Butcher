package nl.mecking.butcher.entity.mob;

import nl.mecking.butcher.input.Keyboard;

public class Player extends Mob {

	private Keyboard input;

	public Player(Keyboard input) {
		this.input = input;
	}

	public Player(int x, int y, Keyboard input) {
		this.x = x;
		this.y = y;
		this.input = input;
	}

	public void update() {
		int xDelta =0, yDelta = 0;
		if (input.up) yDelta--;
		if (input.down) yDelta++;
		if (input.left) xDelta--;
		if (input.right) xDelta++;

		if(xDelta != 0 || yDelta != 0) move(xDelta, yDelta);
	}

	public void render() {

	}
}
