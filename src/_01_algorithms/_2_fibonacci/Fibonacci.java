package _01_algorithms._2_fibonacci;

public class Fibonacci {

public static void main(String[] args) {
	
	
int number1 = 0;
int number2 = 1;

// 0 1 1 2 3 5 8 13 21  

System.out.print(number1 + " " + number2 + " ");
		

for (int i = 0; i < 10; i++) {
	
int sum = number1 + number2;

System.out.print(sum + " ");

number1 = number2;
number2 = sum;

}
	
}
}
