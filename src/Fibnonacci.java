import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Fibnonacci implements ActionListener{

	static FibnonacciButton button = new FibnonacciButton(1);
	FibnonacciPanel panel = new FibnonacciPanel(0);
	private static Fibnonacci fibb;
	private static final int WIDTH = 800;
	private static final int HEIGHT = 800;
//	static FibnonacciLabel label = new FibnonacciLabel(2);
	JLabel label = new JLabel();
	private static boolean isPressed = false;

	public Fibnonacci() {
		JFrame frame = new JFrame();
		frame.setSize(new Dimension(WIDTH, HEIGHT));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button.addActionListener(this);
		panel.add(button);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
	}

	public static void main(String[] args) {
		fibb = new Fibnonacci();
	}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
				System.out.println("Button " + button.getID() + " is pressed");
				try {
					label = createLabelImage("Fibo_somthing.png");
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				panel.add(label);
				int A = 0;
				int B = 1;
				int resalt = A + B;
				JLabel label3 = new JLabel("0 1");
				panel.add(label3);
				for(int i = 0; i < 12; i++){
					JLabel label2 = new JLabel("" + resalt);
					panel.add(label2);
					System.out.println(resalt);
					A = B;
					B = resalt;
					resalt = A + B;
				}
			}
		
		public JLabel createLabelImage(String fileName) throws MalformedURLException {
			URL imageURL = getClass().getResource(fileName);
			if (imageURL == null) {
				System.err.println("Could not find image " + fileName);
				return new JLabel();
			}
			Icon icon = new ImageIcon(imageURL);
			JLabel imageLabel = new JLabel(icon);
			return imageLabel;
		}
}
