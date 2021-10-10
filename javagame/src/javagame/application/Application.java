package javagame.application;

import javagame.engine.GameEngineType;

public class Application implements ApplicationType {

	private Window window;
	private GameEngineType gameEngine;

	public Application(Window display, 
					   GameEngineType gameEngine) {
		this.window = display;
		this.gameEngine = gameEngine;
	}
	
	@Override
	public void run() {
		// 1. Create window
		// 2. Check if window is open, if so
		// 3. Capture keyboard state
		// 4. Prepare renderer for reuse of next frame
		// 5. Pass input to game engine
		// 6. Pass output from game engine to renderer
		// 7. Display the next frame
		// 8. Check if window should close, if so
		// 9. Close the window

		window.create();

		while(!window.shouldClose()) {
			gameEngine.update();
			window.update();
		}

		window.destroy();
	}
}
