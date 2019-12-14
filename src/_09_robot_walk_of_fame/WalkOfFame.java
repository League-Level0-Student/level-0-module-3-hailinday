
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _09_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot("mini");
		// 1. Set the X position of the robot so that it starts on the left.
		// You also need to show the robot to see the result of this line.
		rob.setSpeed(25);
		rob.moveTo(100, 300);
		// 2. Make the robot draw a star shape. Hint: 144.

		rob.penDown();
		for (int xPosition = 150; xPosition < 600; xPosition+= 50) {

			for (int sides = 0; sides < 5; sides++) {
				rob.turn(144);
				rob.move(30);
			}
//			rob.penUp();
//			rob.turn(90);
//			rob.move(50);
//			rob.penDown();
			rob.moveTo(xPosition, 300);
		}
		rob.turn(360);
		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this: http://bit.ly/RobotWalk
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
