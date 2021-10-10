package javagame.engine.input;

import org.lwjgl.input.Keyboard;

public class Input implements InputType {
	
	private static final int MAX_KEYS = 210;

	public static final int KEY_LEFT = 203;
	public static final int KEY_RIGHT = 205;
	public static final int KEY_UP = 200;
	public static final int KEY_DOWN = 208;
	public static final int KEY_SPACE = 57;
	
	private boolean[] pressedKeys, downKeys, upKeys;
	
	public Input() {
		pressedKeys = new boolean[MAX_KEYS];
		downKeys = new boolean[MAX_KEYS];
		upKeys = new boolean[MAX_KEYS];
	}
	
	private void detect() {
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
	
	@Override
	public boolean isKeyDown(int keyCode) {
		return foo(keyCode, downKeys);
	}
	
	@Override
	public boolean isKeyPressed(int keyCode) {
		return foo(keyCode, pressedKeys);
	}
	
	@Override
	public boolean isKeyUp(int keyCode) {
		return foo(keyCode, upKeys);
	}

	private boolean foo(int keyCode, boolean[] list) {
		detect();
		return list[keyCode];
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
