import javax.swing.JOptionPane;

public class TheRiddler {
public static void main(String[] args) {
	int score = 0;
	String answer = JOptionPane.showInputDialog("Who makes it, has no need of it.\n" + 
			"Who buys it, has no use for it. \n" + 
			"Who uses it can neither see nor feel it. \n" + 
			"What is it?");
	if (answer.equalsIgnoreCase("coffin")) {score++; System.out.println(score);}
	else {JOptionPane.showMessageDialog(null, "Wrong! the answer is coffin.");}
	String answer2 = JOptionPane.showInputDialog("What travels the world while staying in the corner?");
	if (answer2.equalsIgnoreCase("a stamp")) {score++; System.out.println(score);}
	else {JOptionPane.showMessageDialog(null, "Wrong! the answer is a stamp.");}
}
}