import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("When is your birthday?(mm/dd format)");
	if(answer.equals("03/03")) {JOptionPane.showMessageDialog(null, "Happy birthday!");
	}
	else {JOptionPane.showMessageDialog(null, "Happy UNbirthday!");}
	
}
}
