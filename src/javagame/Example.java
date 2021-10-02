package javagame;

public class Example {
	
	public static void main(String[] args) {
		// Initialize
		DisplayGL display = new DisplayGL("LWJGL Project", 500, 500);
		RendererGL renderer = new RendererGL();
		KeyboardGL keyboard = new KeyboardGL();
		
		// Create
		display.create();
		
		// Loop
		while(!display.shouldClose()) {
			renderer.clear();
			keyboard.detect();
			
			// Print "Sup" when space key down
			if(keyboard.getDownKey(KeyboardGL.KEY_SPACE)) {
				System.out.println("Sup");
			}
			
			// Draw a red quadrilateral
			renderer.changeColor(1f, 0f, 0f);
			renderer.drawQuad(-0.2f, 0.2f, 0.2f, -0.2f);
			
			display.update();
		}
		
		// Destroy
		display.destroy();
	}

}
