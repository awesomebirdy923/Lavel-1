 // Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {
	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we){
			      System.exit(0);
			   } 
		});
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
		
		String troll = "http://vignette4.wikia.nocookie.net/clubpenguinpookie/images/c/cf/Trollface.jpg/revision/latest?cb=20140330134130";
		
		// 2. create a variable of type "Component" that will hold your image

		Component img;
		
		// 3. use the "createImage()" method below to initialize your Component

		img = createImage(troll);
		
		// 4. add the image to the quiz window

		quizWindow.add(img);
		
		// 5. call the pack() method on the quiz window

		quizWindow.pack();
		
		int q1 = JOptionPane.showConfirmDialog(null, "Is this meme a troll face?");

		
		// 6. ask a question that relates to the image
		

		// 7. print "CORRECT" if the user gave the right answer
		
		if(q1 == 0){
			JOptionPane.showMessageDialog(null, "CARREKT!!!@123345");
		}else{
			JOptionPane.showMessageDialog(null, "UR WRANG");
		}
		

		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)

		quizWindow.remove(img);
		
		// 10. find another image and create it (might take more than one line of code)

		Component img2 = createImage("https://pbs.twimg.com/profile_images/378800000822867536/3f5a00acf72df93528b6bb7cd0a4fd0c.jpeg");
		
		// 11. add the second image to the quiz window

		quizWindow.add(img2);
		
		// 12. pack the quiz window

		quizWindow.pack();
		
		// 13. ask another question

		int q2 = JOptionPane.showConfirmDialog(null, "is this meme an mlg?");
		
		// 14+ check answer, say if correct or incorrect, etc.

		if(q2 == 1){
			JOptionPane.showMessageDialog(null, "CARREKT!!!@123345");
		}else{
			JOptionPane.showMessageDialog(null, "UR WRANG");
		}
		
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





