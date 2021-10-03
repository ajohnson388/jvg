package javagame;

import javagame.application.Application;
import javagame.application.ApplicationBuilder;

public class JavaGame {

	public static void main(String[] args) {
		ApplicationBuilder builder = new ApplicationBuilder();
		Application game = builder.buildGame();
		game.doTheLoop();
	}
}
