import javax.swing.JOptionPane;

public class SecretMessageBox {
public static void main(String[] args) {
	String passcode = "Gubdifuciub";
	String message = JOptionPane.showInputDialog("Enter a secret message");
	String guess = JOptionPane.showInputDialog("Guess the passcode to get the secret message!");
	if (guess.equals(passcode)) {JOptionPane.showMessageDialog(null, message);}
	else {JOptionPane.showMessageDialog(null, "INTRUDER!");}
}
}
