//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		for (; true;) {
		
	
		//1. Create a new Robot
		Robot rob=new Robot("mini");

		//3. Ask the user what color they would like the robot to draw
		String color = JOptionPane.showInputDialog("What color would you like the robot to draw in?");
		//5. Use an if/else statement to set the pen color that the user requested
		if (color.equals("red")) {
			rob.setPenColor(Color.red);
		} else if (color.equals("blue")) {
			rob.setPenColor(Color.blue);
		} else if (color.equals("black")) {
			rob.setPenColor(Color.black);
		} else if (color.equals("green")) {
			rob.setPenColor(Color.green);
		} else if (color.equals("white")) {
			rob.setPenColor(Color.white);
		}  else if (color.equals(" ")) {
			rob.setRandomPenColor();
		}
        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		rob.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		rob.setSpeed(25);
		rob.penDown();
		rob.move(50);
		rob.turn(90);
		rob.move(50);
		rob.turn(90);
		rob.move(50);
		rob.turn(90);
		rob.move(50);
	}
	}
}
