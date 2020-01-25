package _04_are_you_happy;

import javax.swing.JOptionPane;

public class Happy {
public static void main(String[] args) {
String happy = JOptionPane.showInputDialog("Are you happy?");
String question ="";
if (happy.equalsIgnoreCase("Yes")) {
	JOptionPane.showMessageDialog(null, "Keep doin whatever you're doing.");
} else if (happy.equalsIgnoreCase("No")) {
	 question = JOptionPane.showInputDialog("Do you want to be happy?");
} if (question.equalsIgnoreCase("Yes")) {
	JOptionPane.showMessageDialog(null, "Change something.");
} else if (question.equalsIgnoreCase("No")) {
	JOptionPane.showMessageDialog(null, "Keep doin whatever you're doing.");
}



}
}
