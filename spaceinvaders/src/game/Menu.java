package game;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.SpriteSheetFont;

public class Menu extends BasicGameState {
	
	// do all variables/objects get declared here?
	
	Image fontImage;
	Image scaledFontImage;
	SpriteSheet spritesheet;
	SpriteSheetFont ssf;
	int scale, windowHeightCenter, windowWidthCenter, gomWidth, gomHeight;
	String gameOverMessage;
	
	public Menu(int state) {}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		
		scale = 2;
		fontImage = new Image("/res/icons.png");
		scaledFontImage = fontImage.getScaledCopy(scale);
		spritesheet = new SpriteSheet(scaledFontImage, (8 * scale), (8 * scale), (1 * scale), (1 * scale));
		ssf = new SpriteSheetFont(spritesheet, ' ');
		
		windowWidthCenter = gc.getWidth() / 2;
		windowHeightCenter = gc.getHeight() / 2 ;
		gameOverMessage = "game over!";
		gomWidth = ssf.getWidth(gameOverMessage) / 2;
		gomHeight = ssf.getHeight(gameOverMessage) / 2;
		
	}
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		
		ssf.drawString(windowWidthCenter - gomWidth, windowHeightCenter - gomHeight, "game over!".toUpperCase());
	}
	
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		
		
		
//		int posX = Mouse.getX();
//		int posY = Mouse.getY();
//		
//		if ((posX > 100 && posX < 311) && (posY > 209 && posY < 260)) {
//			if (Mouse.isButtonDown(0)) {
//				sbg.enterState(1);
//			}
//		}
//		
//		if ((posX > 100 && posX < 311) && (posY > 109 && posY < 160)) {
//			if (Mouse.isButtonDown(0)) {
//				System.exit(0);
//			}
//		}
	}
	
	public int getID() {
		return 0;
	}

}
