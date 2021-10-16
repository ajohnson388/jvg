package javagame.engine.renderer;

import org.lwjgl.opengl.GL11;

import javagame.model.Color;
import javagame.model.Vertex;

public class Renderer implements RendererType {

	@Override
	public void render(Renderable renderable) {
		GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
		draw(renderable);
	}

	private void draw(Renderable renderable) {
		// Set the color
		Color color = renderable.getColor();
		GL11.glColor3f(color.red, color.green, color.blue);

		// Draw the vertices
		GL11.glBegin(GL11.GL_POLYGON);
		for (Vertex vertex : renderable.getVertices()) {
			GL11.glVertex2f(vertex.x, vertex.y);
		}
		GL11.glEnd();
	}
}
