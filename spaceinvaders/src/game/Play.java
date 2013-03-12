package game;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Play extends BasicGameState {
	
	Player player;
	Enemy[] enemies;
	int enemy;

	
	public Play(int state) {}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		
		player = new Player();
		enemies = new Enemy[56];
	}
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		player.draw();
		enemies[enemy].draw();
	}
	
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		player.update();
		enemies[enemy].update();
		enemy++;
	}
	
	public int getID() {
		return 1;
	}

}