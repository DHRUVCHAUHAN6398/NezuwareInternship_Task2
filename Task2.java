import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // for the input from user

		System.out.print("Enter the first number :  ");
		double operand1 = scanner.nextInt(); // take first number as an input
		System.out.print("Enter the second number :  ");
		double operand2 = scanner.nextInt(); // take second number as an input

		System.out.println("\nSelect from the following choices-");
		System.out.println("1 for Addition");
		System.out.println("2 for Subtraction");
		System.out.println("3 for Multiplication");
		System.out.println("4 for Division");
		System.out.println("5 for Power");
		System.out.println("6 for Modulo");
		System.out.println("0 for EXIT\n");
		System.out.print("Enter your choice :  ");

		int choice = scanner.nextInt(); // take the choice as an input from user

		if (choice >= 1 && choice <= 6) {
			double output = 0; // initialise an output variable

			switch (choice) { // switch statement for the operator check
				case 1:
					output = operand1 + operand2;
					break;

				case 2:
					output = operand1 - operand2;
					break;

				case 3:
					output = operand1 * operand2;
					break;

				case 4:
					output = operand1 / operand2;
					break;

				case 5:
					output = Math.pow(operand1, operand2);
					break;

				case 6:
					output = operand1 % operand2;
					break;

			}

			System.out.println("Output result =  " + output);
		} else {
			if (choice == 0) {
				System.out.println("EXIT\n");
				System.exit(0); // exit the program if entered 0
			} else {
				System.out.println("\nYou have entered wrong choice \n");
			}
		}

	}
}