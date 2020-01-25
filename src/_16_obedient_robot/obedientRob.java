package _16_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedientRob {
	static Robot rob = new Robot("mini");

	public static void main(String[] args) {
		rob.penDown();
		rob.setSpeed(100);

		String color = JOptionPane.showInputDialog("What color would you like the robot to draw in red,blue,green,black, or white?");

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
		} else if (color.equals(" ")) {
			rob.setRandomPenColor();
		}

		String shape = JOptionPane.showInputDialog("What shape would you like the robot to draw?");

		if (shape.equals("square")) {
			drawSquare();
		} else if (shape.equals("triangle")) {
			drawTriangle();
		} else if (shape.equals("circle")) {
			drawCircle();
		}
		}
	



	private static void drawSquare() {
		rob.move(50);
		rob.turn(90);
		rob.move(50);
		rob.turn(90);
		rob.move(50);
		rob.turn(90);
		rob.move(50);

	}

	private static void drawTriangle() {
		rob.turn(120);
		rob.move(50);
		rob.turn(120);
		rob.move(50);
		rob.turn(120);
		rob.move(50);
	}

	private static void drawCircle() {
		for (int i = 0; i < 360; i++) {
			rob.turn(1);
			rob.move(1);
		}
	}
}
