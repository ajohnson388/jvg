package javagame.application;

import javagame.engine.KeyboardInput;
import javagame.engine.Renderer;
import javagame.engine.Window;

public class ApplicationBuilder {

	public Game buildGame() {
		Window display = new Window("Java Game", 500, 500);
		Renderer renderer = new Renderer();
		KeyboardInput keyboard = new KeyboardInput();
		return new Game(display, renderer, keyboard);
	}
	
}
