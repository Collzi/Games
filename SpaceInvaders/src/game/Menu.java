package game;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.SpriteSheetFont;

public class Menu extends BasicGameState {
	
	// do all variables/objects get declared here?
	
	Image fontImage, scaledFontImage, menuImage, ss, selector;

	SpriteSheet ssf;
	SpriteSheet spritesheet;
	SpriteSheetFont myFont;
	
	int scale, windowHeightCenter, windowWidthCenter, gomWidth, gomHeight;
	String gameOverMessage;
	
	public Menu(int state) {}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		
		// menu images, probably should be less images, less images = more fps/less memory
		fontImage = new Image("/res/icons.png");
		menuImage = new Image("/res/menu.jpg");
		//ss = new Image("/res/sprites.png");
		
		// actual spritesheet
		//spritesheet = new SpriteSheet(ss, 128, 128);
		//selector = spritesheet.getSubImage(62, 30);
		
		// font stuff
		scale = 2;
		scaledFontImage = fontImage.getScaledCopy(scale);
		ssf = new SpriteSheet(scaledFontImage, (8 * scale), (8 * scale), (1 * scale), (1 * scale));
		myFont = new SpriteSheetFont(ssf, ' ');
		
		// centering text/images on the window
		windowWidthCenter = gc.getWidth() / 2;
		windowHeightCenter = gc.getHeight() / 2 ;
		gameOverMessage = "game over!";
		gomWidth = myFont.getWidth(gameOverMessage) / 2;
		gomHeight = myFont.getHeight(gameOverMessage) / 2;
		
	}
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		
		//ssf.drawString(windowWidthCenter - gomWidth, windowHeightCenter - gomHeight, "game over!".toUpperCase());
		menuImage.draw((windowWidthCenter - gomWidth) / 5, 50);
		myFont.drawString(windowWidthCenter - gomWidth + 62, (windowHeightCenter - gomHeight) + 75, "play".toUpperCase());
		myFont.drawString(windowWidthCenter - gomWidth + 62, (windowHeightCenter - gomHeight) + 110, "exit".toUpperCase());
		//selector.draw(300,300);
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
