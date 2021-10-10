package javagame;

import javagame.application.ApplicationBuilder;
import javagame.application.ApplicationType;

public class Main {

	public static void main(String[] args) {		
		ApplicationBuilder builder = new ApplicationBuilder();
		ApplicationType game = builder.build();
		game.run();
	}
}
