package javagame.model;

public class Color3f {
	
	private float r, g, b;
	
	public Color3f() {
		r = 0f;
		g = 0f;
		b = 0f;
	}
	
	public Color3f(float r, float g, float b) {
		this.r = r;
		this.b = b;
		this.g = g;
	}

	public float getR() {
		return r;
	}

	public void setR(float r) {
		this.r = r;
	}

	public float getG() {
		return g;
	}

	public void setG(float g) {
		this.g = g;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}

}
