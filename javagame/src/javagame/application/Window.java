package javagame.application;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class Window {

	private final int FPS = 60;
	
	private String title;
	
	private int width, height;

	public Window(String title, int width, int height) {
		this.title = title;
		this.width = width;
		this.height = height;
	}

	public void create() {
		try {
			Display.setTitle(title);
			Display.setDisplayMode(new DisplayMode(width, height));
			Display.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
		}
	}

	public boolean shouldClose() {
		return Display.isCloseRequested();
	}

	public void update() {
		Display.sync(FPS);
		Display.update();
	}

	public void destroy() {
		Display.destroy();
	}
	
}
