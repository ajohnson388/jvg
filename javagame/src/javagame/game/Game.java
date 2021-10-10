package javagame.game;

import javagame.engine.input.InputType;
import javagame.engine.renderer.Renderable;
import javagame.model.GameObject;

public final class Game implements GameType {

	public Renderable update(InputType input) {
		return new GameObject();
	}

}
