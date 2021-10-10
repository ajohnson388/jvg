package javagame.model;

import java.util.ArrayList;
import java.util.List;

import javagame.engine.renderer.Renderable;

public class GameObject implements Renderable {

	@Override
	public List<Renderable> getRenderables() {
		return new ArrayList<Renderable>();
	}

	@Override
	public List<Vertex> getVertices() {
		List<Vertex> vertices = new ArrayList<Vertex>();
		vertices.add(new Vertex(0, 0));
		vertices.add(new Vertex(0.5f, 0f));
		vertices.add(new Vertex(0.5f, 0.5f));
		vertices.add(new Vertex(0f, 0.8f));
		vertices.add(new Vertex(-0.5f, 0.5f));
		vertices.add(new Vertex(-0.5f, -0.5f));
		return vertices;
	}

	@Override
	public Color getColor() {
		return new Color(0.5f, 0.5f, 0.5f);
	}
}
