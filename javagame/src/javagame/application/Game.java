package javagame.application;

import javagame.engine.KeyboardInput;
import javagame.engine.Renderer;
import javagame.engine.Window;

public final class Game extends Application {

	public Game(Window display, Renderer renderer, KeyboardInput keyboard) {
		super(display, renderer, keyboard);
	}

	@Override
	void doLogic() {
		// some bs game logic 
		if (getKeyboard().isKeyDown(KeyboardInput.KEY_SPACE)) {
			System.out.println("Space has been pressed down");
		}
	}

}
