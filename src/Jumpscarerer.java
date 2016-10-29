import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Jumpscarerer implements MouseListener{

	private JFrame frame;
	private JPanel panel;
	private JButton button1, button2, button3;
	private JLabel image;
		
	public Jumpscarerer(){
		frame = new JFrame();
		panel = new JPanel();
		button1 = new JButton("?????!");
		button2 = new JButton("?????");
		button3 = new JButton("?????!!");
		image = new JLabel();
		panel.add(button1);
		button1.addMouseListener(this);
		panel.add(button2);
		button2.addMouseListener(this);
		panel.add(button3);
		button3.addMouseListener(this);
		frame.add(panel);
		frame.setSize(new Dimension(1200, 720));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public static void main(String[] args){
		new Jumpscarerer();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();	
		if(buttonPressed == button1){
			panel.remove(image);
			image = loadImage("YEE.png");
			panel.add(image);
			panel.revalidate();
			panel.repaint();
		} else if(buttonPressed == button2){
			panel.remove(image);
			image = loadImage("BIRB.jpg");
			panel.add(image);
			panel.revalidate();
			panel.repaint();
		} else if(buttonPressed == button3){
			panel.remove(image);
			image = loadImage("GET SHREKED.jpeg");
			panel.add(image);
			panel.revalidate();
			panel.repaint();
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	private JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}
	
}
