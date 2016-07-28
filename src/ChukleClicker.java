import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChukleClicker extends JFrame implements MouseListener{

	JButton chukle;
public ChukleClicker(){
	JPanel panel = new JPanel();
	chukle = new JButton("joke");
	chukle.setPreferredSize(new Dimension(100, 100));
	chukle.addMouseListener(this);
	panel.add(chukle);
	add(panel);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	setResizable(false);
	pack();
}	

public static void main(String[] args){
	new  ChukleClicker();
}

@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	JButton arg1 = (JButton) e.getSource();
	if(arg1 == chukle){
		JOptionPane.showMessageDialog(null, "What happens to a frog's car when it breaks down?");
		JOptionPane.showMessageDialog(null, "It gets toad away.");
		speak("LOLOLOLOLOLOLOLOLOLOL");
		speak("HAHAHAHAHAHAHAHA");
	}
}

@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
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

private void playSound(String fileName) {
	AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	sound.play();
}

private void speak(String words) {
	try {
		Runtime.getRuntime().exec("say " + words).waitFor();
	} catch (Exception e) {
		e.printStackTrace();
	}
}

}
