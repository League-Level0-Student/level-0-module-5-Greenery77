package _03_method_writing._2_happy_pet;

import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet

	static int happinessLevel = 0;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable

		JOptionPane.showInputDialog("What pet do you want to buy? (Dog, Cat, Bird)");
		
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			for (int i = 0; i < 20; i++) {
			
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What would you like to do to make your pet happy?",
					"Options", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Pet", "Feed", "Take on Walk" }, null);

			// 5. Use user input to call the appropriate method created in step 4.

			if (task == 0) {
				
				petPet();
				
			}
			
			if (task == 1) {
				
				feedPet();
				
			}
			
			if (task == 2) {
				
				walkPet();
				
			}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			
			if (happinessLevel == 100) {
			
			JOptionPane.showMessageDialog(null, "Your pet loves you!");
			
			break;
			
			}
			
			}
	}

	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.

	public static void petPet() {

		JOptionPane.showMessageDialog(null, "Your pet smiles at you, somehow.");

		happinessLevel += 10;

	}

	public static void feedPet() {

		JOptionPane.showMessageDialog(null, "Your pet shows excitement as you pour food into it's bowl.");

		happinessLevel += 5;
	}

	public static void walkPet() {

		JOptionPane.showMessageDialog(null, "Your pet gets distracted a lot but still has fun.");

		happinessLevel += 20;
	}
}