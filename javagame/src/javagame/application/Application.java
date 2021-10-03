package javagame.application;

import javagame.engine.KeyboardInput;
import javagame.engine.Renderer;
import javagame.engine.Window;

public abstract class Application {
	
	private Window display;
	private Renderer renderer;
	private KeyboardInput keyboard;

	public Application(Window display, 
					   Renderer renderer, 
					   KeyboardInput keyboard) {
		this.display = display;
		this.renderer = renderer;
		this.keyboard = keyboard;
	}
	
	public void doTheLoop() {
		start();
		
		while(!display.shouldClose()) {
			keyboard.detect();
			doLogic();
			renderer.clear();
			display.update();
		}
		
		stop();
	}
	
	abstract void doLogic();
	
	private void start() {
		display.create();
	}
	
	private void stop() {	
		display.destroy();
	}

	public Window getDisplay() {
		return display;
	}

	public Renderer getRenderer() {
		return renderer;
	}

	public KeyboardInput getKeyboard() {
		return keyboard;
	}
	
}
