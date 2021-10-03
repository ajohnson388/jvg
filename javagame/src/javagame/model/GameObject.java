package javagame.model;

public class GameObject {
	
	private String name;
	
	private float x, y;
	private float width, height;
	
	private Color3f color;
	
	public GameObject() {
		name = null;
		x = 0;
		y = 0;
		width = 0;
		height = 0;
		color = new Color3f(0f, 0f, 0f);
	}
	
	public GameObject(String name, float x, float y, float width, float height, Color3f color) {
		this.name = name;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}
	
	public void addX(float value) {
		this.x = x + value;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	public void addY(float value) {
		this.y = y + value;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}
	
	public void addWidth(float value) {
		this.width = width + value;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	
	public void addHeight(float value) {
		this.height = height + value;
	}

	public Color3f getColor() {
		return color;
	}

	public void setColor(Color3f color) {
		this.color = color;
	}
	
}
