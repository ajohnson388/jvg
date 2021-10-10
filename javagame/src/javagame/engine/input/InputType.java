package javagame.engine.input;

public interface InputType {
	public boolean isKeyDown(int keyCode);
	public boolean isKeyPressed(int keyCode);
	public boolean isKeyUp(int keyCode);
}
