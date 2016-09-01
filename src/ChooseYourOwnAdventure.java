import javax.swing.JOptionPane;

public class ChooseYourOwnAdventure {
public static void main(String[] args){
	int questionOne = JOptionPane.showConfirmDialog(null, "You turn on your phone and you open Pokemon Go. Do you walk to a Seceret Government Station?");
	if(questionOne == 1){
		JOptionPane.showMessageDialog(null, "You walk through a park and you find a Spearow, it crawls out your phone and it kills you. your dead");
	} else{
		JOptionPane.showMessageDialog(null, "You walk in and the guards let you in (you work there)"+"\n"+"you find a ratata, do you catch it?");
	}
	
}
}
