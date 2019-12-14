
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "January 219th";
		String dadsBirthday = "August 2500th";
		String myBirthday = "September 22nd";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String asked = JOptionPane.showInputDialog("Which birthday u want?");
		// 3. Print out what the user typed
		System.out.println(asked);
		if (asked.equals("mom")) {
			System.out.println(momsBirthday);
		} else if (asked.equals("dad")) {
			System.out.println(dadsBirthday);
		} else if (asked.equals("you")) {
			System.out.println(myBirthday);
		} else {
			JOptionPane.showMessageDialog(null, "Dont know that person");
		}
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
