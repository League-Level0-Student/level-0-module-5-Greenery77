package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObediantServant {

	static Robot rob = new Robot();

	public static void main(String[] args) {

		rob.show();
		rob.setSpeed(8);
		rob.penDown();

		String color = JOptionPane.showInputDialog("Which color do you want? (red, green, blue)");

		if (color.equalsIgnoreCase("red")) {

			rob.setPenColor(255, 0, 0);

		}

		if (color.equalsIgnoreCase("green")) {

			rob.setPenColor(0, 255, 0);

		}

		if (color.equalsIgnoreCase("blue")) {

			rob.setPenColor(0, 0, 255);

		}

		String shape = JOptionPane.showInputDialog("Which shape do you want? (circle, triangle, square)");

		if (shape.equalsIgnoreCase("Circle")) {

			drawCircle();

		}

		if (shape.equalsIgnoreCase("triangle")) {

			drawTriangle();

		}

		if (shape.equalsIgnoreCase("square")) {

			drawSquare();

		}

	}

	public static void drawSquare() {

		for (int i = 0; i < 4; i++) {

			rob.move(100);
			rob.turn(360 / 4);

		}

	}

	public static void drawTriangle() {

		for (int i = 0; i < 3; i++) {

			rob.move(100);
			rob.turn(360 / 3);
		}

	}

	public static void drawCircle() {

		for (int i = 0; i < 360; i++) {

			rob.move(1);
			rob.turn(360 / 360);
		}

	}

}
