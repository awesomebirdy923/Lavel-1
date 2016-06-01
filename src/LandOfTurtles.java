import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle;

public class LandOfTurtles extends JFrame {
	private static final int WIDTH = 1200;
	private static final int HEIGHT = 600;
	MultiTurtlePanel panel = new MultiTurtlePanel();
	static ArrayList<Turtle> turtles = new ArrayList<Turtle>();
	String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";
	public void spawnTurtles(){
		for (int i = 0; i < 50; i++) {
			turtles.add(new Turtle());
		}
	}
	public static void main(String[] args) {

		// 1. Create a frame & make it visible
		
		LandOfTurtles land = new LandOfTurtles("Land of Turtle", WIDTH, HEIGHT, Color.green);

		// 2. Add the panel to the frame
		
		
		// 3. Set the background image of the panel to the Galapagos Islands

		// 4. Instantiate a Turtle

		// 5. Add the turtle to the panel

		// 6. Put 50 Turtles on the beach

	}

	public LandOfTurtles(String title, int width, int height, Color color) {
		setTitle(title);
		panel.setBackgroundImage(galapagosIslands);
		spawnTurtles();
		for (Turtle t : turtles) {
			panel.addTurtle(t);
		}
		add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBackground(color);
		setSize(width, height);
		setVisible(true);
	}
}
