package _04_are_you_happy;

import javax.swing.JOptionPane;

public class HAPPY {
public static void main(String[] args) {
String happy = JOptionPane.showInputDialog("Are you happy?");
String question ="";
if (happy.equals("Yes")) {
	JOptionPane.showMessageDialog(null, "Keep doin whatever you're doing.");
} else if (happy.contentEquals("No")) {
	 question = JOptionPane.showInputDialog("Do you want to be happy?");
} if (question.equals("Yes")) {
	JOptionPane.showMessageDialog(null, "Change something.");
} else if (question.contentEquals("No")) {
	JOptionPane.showMessageDialog(null, "Keep doin whatever you're doing.");
}



}
}
