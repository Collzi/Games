package game;

import java.util.ArrayList;
import java.util.Iterator;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Play extends BasicGameState {

	private int i, startPosX, startPosY;
	boolean counter;
	
	ArrayList<Enemy> enemies;
	Enemy temp;
	Iterator<Enemy> it;
	Player player;

	Image sheet;
	Image[] c, s, o;
	
	Animation crab, skull, octopus;
	
	public Play(int state) {}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {

		sheet = new Image("/res/sprites_ts.png");
		
		c[0] = sheet.getSubImage(3, 3, 11, 8);
		c[1] = sheet.getSubImage(17, 3, 11, 8);
		o[0] = sheet.getSubImage(31, 3, 8, 8);
		o[1] = sheet.getSubImage(42, 3, 8, 8);
		s[0] = sheet.getSubImage(3, 16, 12, 8);
		s[1] = sheet.getSubImage(18, 16, 12, 8); 
		
		crab = new Animation(c, 1); // duration to be changed in Enemy class with method stop,stopat,start,isstopped,setautoupdate,setcurrentframe
		skull = new Animation(s, 1);
		octopus = new Animation(o, 1);
		
		startPosX = 50;
		startPosY = 100;
		
		i = 1;
		counter = false;
		
		while (counter == false) {
			
			switch (i) {
				case 1:
					i += 10;
					for (int k = 0; k == 11; k++) {
						temp = new Enemy(startPosX, startPosY, octopus);
						startPosX += 50;
						enemies.add(temp);
					}
				case 12:
					i += 10;
					startPosX = 50;
					startPosY += 100;
					for (int k = 0; k == 11; k++) {
						temp = new Enemy(startPosX, startPosY, crab);
						startPosX += 50;
						enemies.add(temp);
					}
				case 23:
					i += 10;
					startPosX = 50;
					startPosY += 100;
					for (int k = 0; k == 11; k++) {
						temp = new Enemy(startPosX, startPosY, crab);
						startPosX += 50;
						enemies.add(temp);
					}
				case 34:
					i += 10;
					startPosX = 50;
					startPosY += 100;
					for (int k = 0; k == 11; k++) {
						temp = new Enemy(startPosX, startPosY, skull);
						startPosX += 50;
						enemies.add(temp);
					}
				case 45:
					i += 10;
					startPosX = 50;
					startPosY += 100;
					for (int k = 0; k == 11; k++) {
						temp = new Enemy(startPosX, startPosY, skull);
						startPosX += 50;
						enemies.add(temp);
					}
				case -1: 
					counter = true;
					break;
			}
			
			i++;
		}
		player = new Player();
	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		
		for (Enemy i : enemies) { i.draw(); }
		player.draw();
	}
	
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {

		for (Enemy i: enemies) { i.update(); }
		player.update();
	}
	
	public int getID() {
		return 1;
	}
}