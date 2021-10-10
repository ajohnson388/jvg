package javagame.game;

import javagame.engine.input.InputType;
import javagame.engine.renderer.Renderable;

public interface GameType {
	public Renderable update(InputType input);
}
