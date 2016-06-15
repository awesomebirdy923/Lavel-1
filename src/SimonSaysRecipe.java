import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.io.IOException;
public class SimonSaysRecipe extends KeyAdapter {
 
 // Complete steps 1 - 7 before you test
 // 1. Make a JFrame variable 
 
	JFrame frame2;
	JFrame frame = new JFrame();
 	HashMap<Integer,String> images = new HashMap<Integer, String>();
 	private int imageIndex;
 	private int tries = 0;
 	private int random;
 	private int simonSays = 0;
 	private int choice;
 	Date timeAtStart;
 	private  void makeAlbum() {
 // 2. add 4 images which match keyboard keys like this: images.put(new Integer(KeyEvent.VK_UP), "image.jpg");

 		images.put(new Integer(KeyEvent.VK_A), "A.png");
 		images.put(new Integer(KeyEvent.VK_P), "P.png");
 		images.put(new Integer(KeyEvent.VK_V), "V.png");
 		images.put(new Integer(KeyEvent.VK_T), "T.png");
 		
 // 3. Tell the user to "Press the matching key when 'Simon says' otherwise press a different key"
 
 		JOptionPane.showMessageDialog(null, "Press the matching key when 'Simon says' otherwise press a different key");
 		
 // 4. call the method to show an image

 		showImage();
 		
 	}
	public void keyPressed(KeyEvent e) {
    	int keyCode = e.getKeyCode();
    	// 16. make a points variable to track the score. tell the user their score at the end.
    	int points = 0;
    	//17. if the keyCode matches the imageIndex and "Simon says..."  increase their score
    	
    	System.out.println(keyCode);
    	
    	choice = new Random().nextInt(2);
    	if(keyCode == imageIndex && choice == 0){
    		
    		points+=1;
    		
    	}else if(keyCode != imageIndex && choice == 1){
    		
    		points+=1;
    		
    	}
    	
    	//18.   if the keyCode doesn't match the imageIndex and "Simon didn't say..."  increase their score	
    	//19. Use the speak method to tell the user if they were correct or not
    	
    	if(keyCode == imageIndex){
    		speak("DING DING DINGGGGGGGGGGGGGGGGGGGG... your right");
    	}
    	
    	//13. increment tries by 1
  	
    	tries++;
    	
    	//14. if tries is greater than 9 (or however many you want)
    	
    	if(tries > 7){
    		
    		System.exit(0);
    		
    	}
    	
    	//15.    	exit the program

    	//11. dispose of the frame
   	
    	frame2.dispose();
    	
    	//12. call the method to show an image

    	showImage();
    	
	}
	private void showImage() {
    	//5. initialize your frame to a new JFrame()
	 
		frame2 = new JFrame();
		
    	//6. set the frame to visible
	
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame2.setSize(new Dimension(1200, 600));
		
		frame2.setVisible(true);
		
		frame2.add(getNextRandomImage()); //7. rename to the name of your frame
    	
		frame2.setTitle("you found an easter egg! :D");
		
    	// 8. set the size of the frame 
     	
		
    	// 9. add a key listener to the frame
	
		frame2.addKeyListener(this);
		
   	 //10. Use the speak method to either say "Simon says press this key" or "Press this key"
		
		if(choice == 1){
		speak("Press this key");
		choice = new Random().nextInt(2);
		}else{
		speak("Simon says press this key");
		choice = new Random().nextInt(2);
		}
    	//Hint: use the simonSays int and a random number
	}
	private Component getNextRandomImage() {
    	this.imageIndex = new Random().nextInt(4) + 37;
    	random = new Random().nextInt(3);
    	if(random == 0){
    		this.imageIndex = 65;
    	}
    	if(random == 1){
    		this.imageIndex = 80;
    	}
    	if(random == 2){
    		this.imageIndex = 84;
    	}
    	if(random == 3){
    		this.imageIndex = 86;
    	}
    	return loadImage(images.get(imageIndex));
	}
	private JLabel loadImage(String fileName) {
    	URL imageURL = getClass().getResource(fileName);
    	Icon icon = new ImageIcon(imageURL);
    	return new JLabel(icon);
	}
  void speak(String words) {
  	  try {
  	   Runtime.getRuntime().exec("say " + words).waitFor();
  	  } catch (Exception e) {
  	   e.printStackTrace();
  	  }
   	}
	public static void main(String[] args) throws Exception {
	 new SimonSaysRecipe().makeAlbum();
	 Date timeAtStart = new Date();
	 Date timeAtEnd = new Date();
	 System.out.println((timeAtEnd.getTime()-timeAtStart.getTime())/1000);
	 System.exit(0);
	}
}

/* 
* 20. add a timer
* ~~~ where the code starts running ~~~
* timeAtStart = new Date();
*
* ~~~ where the code ends ~~~
* Date timeAtEnd = new Date();
* System.out.println((timeAtEnd.getTime()-timeAtStart.getTime())/1000);
* System.exit(0);
*/


