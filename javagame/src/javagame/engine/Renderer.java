package javagame.engine;

import org.lwjgl.opengl.GL11;

import javagame.model.Color3f;
import javagame.model.GameObject;

public class Renderer {
	
	public void clear() {
		GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
	}
	
	public void changeColor(float r, float g, float b) {
		GL11.glColor3f(r, g, b);
	}
	
	public void drawQuad(float left, float right, float top, float bottom) {
		GL11.glBegin(GL11.GL_QUADS);
		
		GL11.glVertex2f(left, top);
		GL11.glVertex2f(right, top);
		GL11.glVertex2f(right, bottom);
		GL11.glVertex2f(left, bottom);
		
		GL11.glEnd();
	}
	
	public void drawGameObj(GameObject obj) {
		Color3f color = obj.getColor();
		float leftBound = obj.getX() - obj.getWidth() / 2f;
		float rightBound = obj.getX() + obj.getWidth() / 2f;
		float topBound = obj.getY() + obj.getHeight() / 2f;
		float bottomBound = obj.getY() - obj.getHeight() / 2f;
		changeColor(color.getR(), color.getG(), color.getB());
		drawQuad(leftBound, rightBound, 
				topBound, bottomBound);
	}

}
