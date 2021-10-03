package javagame.engine;

import org.lwjgl.input.Keyboard;

public class KeyboardInput {
	
	private static final int MAX_KEYS = 210;

	public static final int KEY_LEFT = 203;
	public static final int KEY_RIGHT = 205;
	public static final int KEY_UP = 200;
	public static final int KEY_DOWN = 208;
	public static final int KEY_SPACE = 57;
	
	private boolean[] pressedKeys, downKeys, upKeys;
	
	public KeyboardInput() {
		pressedKeys = new boolean[MAX_KEYS];
		downKeys = new boolean[MAX_KEYS];
		upKeys = new boolean[MAX_KEYS];
	}
	
	public void detect() {
		for(int i = 0; i < MAX_KEYS; i++) {
			downKeys[i] = false;
			upKeys[i] = false;
		}
		
		while(isKeyEvent()) {
			int eventKey = getEventKey();
			if (getEventKeyDown()) {
				downKeys[eventKey] = true;
				pressedKeys[eventKey] = true;
			} else {
				upKeys[eventKey] = true;
				pressedKeys[eventKey] = false;
			}
		}
	}
	
	public boolean isKeyDown(int keyCode) {
		return downKeys[keyCode];
	}
	
	public boolean isKeyPressed(int keyCode) {
		return pressedKeys[keyCode];
	}
	
	public boolean isKeyUp(int keyCode) {
		return upKeys[keyCode];
	}
	
	private static boolean isKeyEvent() {
		
		return Keyboard.next();
		
	}
	
	private static boolean getEventKeyDown() {
		
		return Keyboard.getEventKeyState();
		
	}
	
	private static int getEventKey() {
		
		return Keyboard.getEventKey();
		
	}

}
