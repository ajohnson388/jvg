package javagame.engine.renderer;

import java.util.List;

import javagame.model.Color;
import javagame.model.Vertex;

public interface Renderable {
	public List<Vertex> getVertices();
	public Color getColor();
}
