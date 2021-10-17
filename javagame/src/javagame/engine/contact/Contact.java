package javagame.engine.contact;

import javagame.engine.transform.Transformable;

public class Contact {
	
	public static boolean isContacting(Transformable a, Transformable b) {
		// Get object A and object B positions and radius
		float aX = a.getPosition().x;
		float aY = a.getPosition().y;
		float radiusA = a.getRadius();
		
		float bX = b.getPosition().x;
		float bY = b.getPosition().y;
		float radiusB = b.getRadius();
		
		// Find the distance between A and B
		float dX = Math.abs(bX - aX);
		float dY = Math.abs(bY - aY);
		double distance = Math.sqrt(Math.pow(dX, 2) + Math.pow(dY, 2));
		
		// Determine if colliding
		if(distance <= radiusA + radiusB) {
			return true;
		} else {
			return false;
		}
	}

}
