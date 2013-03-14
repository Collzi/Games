package game;

// test for updated file, git

import org.newdawn.slick.Image;
import org.newdawn.slick.Animation;
import org.newdawn.slick.SlickException;

// duration to be changed in Enemy class with
// method stop, stopat, start, isstopped, setautoupdate, setcurrentframe

public class Enemy {

	private int startPosX, startPosY;
	Animation enemyType;
	
	public Enemy(int x, int y, Animation e) {
		this.startPosX = x;
		this.startPosY = y;
		this.enemyType = e;
	}
	
	public void draw() throws SlickException {
		enemyType.draw(startPosX, startPosY);
	}
	
	public void update() {}
}
