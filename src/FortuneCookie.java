import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FortuneCookie extends JFrame {
	JPanel panel;
	JButton button;

	public FortuneCookie() {
		setSize(new Dimension(800, 800));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void showButton(JButton button, JPanel panel) {
		add(panel);
		panel.add(button);
	}

	public static void main(String[] args) {
		JButton button1 = new JButton("I Will Tell Your Fortune. (I really dont want to but i will get paid for it so...)");
		JPanel panel1 = new JPanel();
		FortuneCookie cookie = new FortuneCookie();
		cookie.showButton(button1, panel1);
	}
}
