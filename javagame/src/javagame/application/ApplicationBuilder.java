package javagame.application;

import javagame.engine.GameEngine;
import javagame.engine.GameEngineType;
import javagame.engine.input.Input;
import javagame.engine.renderer.Renderer;
import javagame.game.Game;

public class ApplicationBuilder {

	public ApplicationType build() {
		Game game = new Game();
		Window display = new Window("Java Game", 500, 500);
		Input keyboard = new Input();
		Renderer renderer = new Renderer();
		GameEngineType gameEngine = new GameEngine(game, keyboard, renderer);
		return new Application(display, gameEngine);
	}
}
