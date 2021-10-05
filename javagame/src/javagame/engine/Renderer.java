package javagame.engine;

import org.lwjgl.opengl.GL11;

import javagame.model.Color3f;
import javagame.model.GameObject;

public class Renderer {
	
	class Triangle {
		
		float x1, y1, x2, y2, x3, y3;
		
		Triangle(float x1, float y1, float x2, float y2, float x3, float y3) {
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
			this.x3 = x3;
			this.y3 = y3;
		}
	}
	
	public void clear() {
		GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
	}
	
	public void changeColor(float r, float g, float b) {
		GL11.glColor3f(r, g, b);
	}
	
	public void drawLine(float x1, float y1, 
						 float x2, float y2) {
		GL11.glBegin(GL11.GL_LINES);
		
		GL11.glVertex2f(x1, y1);
		GL11.glVertex2f(x2, y2);
		
		GL11.glEnd();
	}
	
	public void drawTriangle(float x1, float y1, 
							 float x2, float y2, 
							 float x3, float y3) {
		GL11.glBegin(GL11.GL_TRIANGLES);
		
		GL11.glVertex2f(x1, y1);
		GL11.glVertex2f(x2, y2);
		GL11.glVertex2f(x3, y3);
		
		GL11.glEnd();
	}
	
	public void drawQuad(float x1, float y1, 
						 float x2, float y2, 
						 float x3, float y3, 
						 float x4, float y4) {
		GL11.glBegin(GL11.GL_QUADS);
		
		GL11.glVertex2f(x1, y1);
		GL11.glVertex2f(x2, y2);
		GL11.glVertex2f(x3, y3);
		GL11.glVertex2f(x4, y4);
		
		GL11.glEnd();
	}
	
	public void drawRectangle(float x, float y, 
							  float width, float height) {
		float left = x - width / 2f;
		float right = x + width / 2f;
		float top = y + height / 2f;
		float bottom = y - height / 2f;
		
		drawQuad(left, top, 
				right, top, 
				right, bottom, 
				left, bottom);
		
		GL11.glBegin(GL11.GL_QUADS);
		
		GL11.glVertex2f(left, top);
		GL11.glVertex2f(right, top);
		GL11.glVertex2f(right, bottom);
		GL11.glVertex2f(left, bottom);
		
		GL11.glEnd();
	}
	
	public void drawCircle(float x, float y, 
						   float radius, 
						   int triangleCount) {
		float angleIncrement = 360f / Math.abs(triangleCount);
		
		for(float angle = 0f; angle < 360f; angle += angleIncrement) {
			float x1 = x;
			float y1 = y;
			
			float x2 = (float) (radius * Math.cos(Math.toRadians(angle))) + x;
			float y2 = (float) (radius * Math.sin(Math.toRadians(angle))) + y;
			
			float x3 = (float) (radius * Math.cos(Math.toRadians(angle + angleIncrement))) + x;;
			float y3 = (float) (radius * Math.sin(Math.toRadians(angle + angleIncrement))) + y;;
			
			drawTriangle(x1, y1, x2, y2, x3, y3);
		}
	}
	
	public void drawGameObj(GameObject obj) {
		Color3f color = obj.getColor();
		changeColor(color.getR(), color.getG(), color.getB());
		drawRectangle(obj.getX(), obj.getY(), 
				obj.getWidth(), obj.getHeight());
	}

}
