import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class FibnonacciButton extends JButton{

	private int ID;
	public boolean isPressed = false;
	
	public FibnonacciButton(int ID){
		this.ID = ID;
		System.out.println("Button " + ID + " is initialized");
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	
}
