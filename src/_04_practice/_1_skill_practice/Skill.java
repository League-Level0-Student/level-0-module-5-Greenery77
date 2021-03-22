package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class Skill {

	public static void main(String[] args) {

		Skill skills = new Skill();
//		skills.skill1();
//		skills.skill2();
//		skills.skill3();
		skills.skill4();
		skills.skill5();

	}

//	void skill1() {
//
//		String dimeNum = JOptionPane.showInputDialog("How many dimes do you have?");
//
//
//		int centNum = Integer.parseInt(dimeNum);
//
//		JOptionPane.showMessageDialog(null, "You have " + centNum * 10 + " cents.");
//
//
//		String height = JOptionPane.showInputDialog("How tall are you in inches?");
//
//
//		int heightNum = Integer.parseInt(height);
//
//		if (heightNum <= 36) {
//
//			JOptionPane.showMessageDialog(null, "Drink milk get tall lol.");
//
//		}
//
//		else {
//			JOptionPane.showMessageDialog(null, "Good job you aren't short.");
//		}
//	}

//	void skill2() { 
//	
//
//		for (int i = 0; i < 31; i++) {
//			
//			if (i % 3 == 0) {
//				
//				System.out.println(i);
//				
//			}
//			
//		}
//		
//	}

//	void skill3() {
//
//		Random ran = new Random();
//		int num = ran.nextInt(20);
//		System.out.println(num);
//
//		Random ran2 = new Random();
//		int num2 = ran2.nextInt(10);
//		System.out.println(num2);
//
//		JOptionPane.showMessageDialog(null, "The difference between " + num + " and " + num2 + " is " + (num - num2));
//
//	}

	void skill4() { // In a pop-up, ask the user for the city they live in

		String city = JOptionPane.showInputDialog("What city do you live in?");
		
		// If they answered "San Diego", tell them they live in America's Finest City

		if (city.equalsIgnoreCase ("San Diego")) {
			
			JOptionPane.showMessageDialog(null,"You live in a pretty nice place.");
			
		}
		
		else {
			
			JOptionPane.showMessageDialog(null, "You should move to San Diego.");
			
		}
		
		// Otherwise, tell them to move to San Diego

		// Create a variable - cars - and initialize it to the number of cars your
		// family has. // If there are 0 cars, use a pop-up to display, "I bet you use
		// public transportation."
		
		String cars = JOptionPane.showInputDialog("How many cars does your family have?");

		// If there is 1 car, use a pop-up to display the make/model of the car
		
		int carNumber = Integer.parseInt(cars);
		
		if (carNumber == 0) {
			
			JOptionPane.showMessageDialog(null, "You probably use public transportation then.");
			
		}
		
		else if (carNumber == 1) {
			
			JOptionPane.showMessageDialog(null, ".");
			
		}
		// If there is more than 1 car, use a pop-up to display how many wheels the //
		// cars have between them.

	}

	void skill5() { // In a pop-up, ask the user for the name of their school

		// In another pop-up, tell the user, that their school is a fantastic school. //
		// You must include the name of the school in the message.

	}

}
