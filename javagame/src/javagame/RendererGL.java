package javagame;

import org.lwjgl.opengl.GL11;

public class RendererGL {
	
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

}