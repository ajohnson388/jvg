package javagame;

import org.lwjgl.input.Keyboard;

public class KeyboardGL {
	
	private static final int MAX_KEYS = 210;

	public static final int KEY_LEFT = 203;
	public static final int KEY_RIGHT = 205;
	public static final int KEY_UP = 200;
	public static final int KEY_DOWN = 208;
	public static final int KEY_SPACE = 57;
	
	private boolean[] currentKeys, downKeys, upKeys;
	
	public KeyboardGL() {
		currentKeys = new boolean[MAX_KEYS];
		downKeys = new boolean[MAX_KEYS];
		upKeys = new boolean[MAX_KEYS];
	}
	
	public void detect() {
		for(int i = 0; i < MAX_KEYS; i++) {
			downKeys[i] = false;
			upKeys[i] = false;
		}
		
		while(kbNext()) {
			if(getEventKeyDown() == true) {
				downKeys[getEventKey()] = true;
				currentKeys[getEventKey()] = true;
			} else {
				upKeys[getEventKey()] = true;
				currentKeys[getEventKey()] = false;
			}
		}
	}
	
	public boolean getCurrentKey(int keyCode) {
		return currentKeys[keyCode];
	}
	
	public boolean getDownKey(int keyCode) {
		return downKeys[keyCode];
	}
	
	public boolean getUpKey(int keyCode) {
		return upKeys[keyCode];
	}
	
	private static boolean kbNext() {
		
		return Keyboard.next();
		
	}
	
	private static boolean getEventKeyDown() {
		
		return Keyboard.getEventKeyState();
		
	}
	
	private static int getEventKey() {
		
		return Keyboard.getEventKey();
		
	}

}
