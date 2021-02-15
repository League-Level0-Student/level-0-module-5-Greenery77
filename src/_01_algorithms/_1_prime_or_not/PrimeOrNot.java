package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {

public static void main(String[] args) {
	
	
	String number = JOptionPane.showInputDialog("Enter any number.");
	
	
	int intNumber = Integer.parseInt(number);
	
	
	for (int i = 2; i < intNumber; i++) {
		
	if (intNumber % i == 0)	{
		
    JOptionPane.showMessageDialog(null, "The number is composite.");
	
	System.exit(0);
	
	}
	}
	
	
	JOptionPane.showMessageDialog(null, "The number is prime.");
	
	
	
	
	
	
	
}

}
