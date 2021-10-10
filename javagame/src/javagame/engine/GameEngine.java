package javagame.engine;

import javagame.engine.input.InputType;
import javagame.engine.renderer.Renderable;
import javagame.engine.renderer.RendererType;
import javagame.game.Game;

public class GameEngine implements GameEngineType {
	
	private Game game;
	private InputType input;
	private RendererType renderer;

	public GameEngine(Game game,
					  InputType keyboard,
					  RendererType renderer) {
		this.game = game;
		this.input = keyboard;
		this.renderer = renderer;
	}

	@Override
	public void update() {		
		Renderable renderable = game.update(input);
		renderer.render(renderable);
	}
}
