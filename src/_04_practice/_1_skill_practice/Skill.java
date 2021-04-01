package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class Skill {

	public static void main(String[] args) {

		Skill skills = new Skill();
		skills.skill1();
		skills.skill2();
		skills.skill3();
		skills.skill4();
		skills.skill5();

	}

	void skill1() {

		String dimeNum = JOptionPane.showInputDialog("How many dimes do you have?");


		int centNum = Integer.parseInt(dimeNum);

		JOptionPane.showMessageDialog(null, "You have " + centNum * 10 + " cents.");


		String height = JOptionPane.showInputDialog("How tall are you in inches?");


		int heightNum = Integer.parseInt(height);

		if (heightNum <= 36) {

			JOptionPane.showMessageDialog(null, "Drink milk get tall lol.");

		}
//
		else {
			JOptionPane.showMessageDialog(null, "Good job you aren't short.");
		}
	}

	void skill2() { 
	

		for (int i = 0; i < 31; i++) {
			
			if (i % 3 == 0) {
				
				System.out.println(i);
				
	
			}
			
		}
		
	}

	void skill3() {

		Random ran = new Random();
		int num = ran.nextInt(20);
		System.out.println(num);

		Random ran2 = new Random();
		int num2 = ran2.nextInt(10);
		System.out.println(num2);

		JOptionPane.showMessageDialog(null, "The difference between " + num + " and " + num2 + " is " + (num - num2));

	}

	void skill4() {

		String city = JOptionPane.showInputDialog("What city do you live in?");

		if (city.equalsIgnoreCase("San Diego")) {

			JOptionPane.showMessageDialog(null, "You live in a pretty nice place.");

		}

		else {

			JOptionPane.showMessageDialog(null, "You should move to San Diego.");

		}

		String cars = JOptionPane.showInputDialog("How many cars does your family have?");

		int carNumber = Integer.parseInt(cars);

		if (carNumber == 0) {

			JOptionPane.showMessageDialog(null, "You probably use public transportation then.");

		}

		else if (carNumber == 1) {

			JOptionPane.showMessageDialog(null, "???");

		}

		else if (carNumber > 1) {

			JOptionPane.showMessageDialog(null, "There are " + carNumber * 4 + " wheels of all your cars together.");

		}

	}

	void skill5() {

		String userSchool = JOptionPane.showInputDialog("What is the school you go to?");

		JOptionPane.showMessageDialog(null, userSchool + " is a fantastic school!");

	}

}
