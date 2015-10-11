package nl.mecking.butcher.entity.mob;

import nl.mecking.butcher.graphics.Screen;
import nl.mecking.butcher.graphics.Sprite;
import nl.mecking.butcher.input.Keyboard;

public class Player extends Mob {

	private Keyboard input;
	private Sprite sprite;
	private int animate;
	private boolean moving;

	public Player(Keyboard input) {
		this.input = input;
		this.sprite = Sprite.player_south;
	}

	public Player(int x, int y, Keyboard input) {
		this.x = x;
		this.y = y;
		this.input = input;
		this.sprite = Sprite.player_south;
	}

	public void update() {
		int xDelta = 0, yDelta = 0;
		if (animate < 7500)	animate++;
		else animate = 0;
		if (input.up) yDelta--;
		if (input.down) yDelta++;
		if (input.left) xDelta--;
		if (input.right) xDelta++;

		if (xDelta != 0 || yDelta != 0) {
			move(xDelta, yDelta);
			moving = true;
		} else {
			moving = false;
		}
	}

	public void render(Screen screen) {
		if (direction == NORTH) {
			sprite = Sprite.player_north;
			if (moving) { 
				if( animate % 20 > 10) {
					sprite = Sprite.player_north_1;
				} else {
					sprite = Sprite.player_north_2;
				}
			}
		}
		
		if (direction == SOUTH) {
			sprite = Sprite.player_south;
			if (moving) {
				if( animate % 20 > 10) {
					sprite = Sprite.player_south_1;
				} else {
					sprite = Sprite.player_south_2;
				}
			}
		}
		if (direction == WEST){
			sprite = Sprite.player_west;
			if (moving) {
				if( animate % 20 > 10) {
					sprite = Sprite.player_west_1;
				} else {
					sprite = Sprite.player_west_2;
				}
			}
		}
		if (direction == EAST) {
			sprite = Sprite.player_east;
			if (moving) {
				if( animate % 20 > 10) {
					sprite = Sprite.player_east_1;
				} else {
					sprite = Sprite.player_east_2;
				}
			}
		}

		screen.renderPlayer(x, y, sprite);
	}
}
