import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class CoordinateConversion extends JFrame implements MouseMotionListener{

	int mouseX;
	int mouseY;
	
	public CoordinateConversion(int width, int height){
		setSize(new Dimension(width, height));
		setBackground(Color.white);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		addMouseMotionListener(this);
//		pack();
	}
	
	public static void main(String[] args) {
		new CoordinateConversion(800, 800);
	}
	
	public void paint(Graphics g){
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(Color.white);
		g2d.fillRect(0, 0, 800, 800);
		g2d.setColor(Color.black);
		g2d.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 50));
		g2d.drawString(mouseX-400+" "+(-mouseY+400), 800/2, 800/2);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		mouseX = e.getX();
		mouseY = e.getY();
		repaint();
	}
}
