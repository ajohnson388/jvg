package javagame.engine.collision;

import javagame.model.GameObject;

public class Collider {
	
	// Main method in here so you can see an example by running from this class
	
	public static void main(String[] args) {
		
		// EXAMPLE OF COLLISION DETECTION
		
		GameObject a = new GameObject();
		a.setX(1.5f);
		a.setWidth(1f);
		a.setHeight(1f);
		// Create object B
		GameObject b = new GameObject();
		b.setX(1f);
		b.setWidth(1f);
		b.setHeight(1f);
		
		// Check for collision
		if(isColliding(a, b)) {
			System.out.println("Collision!");
		}
	}
	
	
	public static boolean isColliding(GameObject a, GameObject b) {
		// Get object A and object B positions
		float aX = a.getX();
		float aY = a.getY();
		float bX = b.getX();
		float bY = b.getY();
		
		// Find the distance between A and B
		float dX = Math.abs(bX - aX);
		float dY = Math.abs(bY - aY);
		double distance = Math.sqrt(Math.pow(dX, 2) + Math.pow(dY, 2));
		
		// Find the radius of both A and B
		float radiusA = Math.abs(aX - (aX + a.getWidth() / 2f));
		float radiusB = Math.abs(bX - (bX + b.getWidth() / 2f));
		
		// Determine if colliding
		if(distance <= radiusA + radiusB) {
			return true;
		} else {
			return false;
		}
	}

}
