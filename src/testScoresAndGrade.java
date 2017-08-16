import java.util.Scanner;

/*
 * Brendan Howell
 * CSC-151
 * 9/1/2015
 * 
 * Class project that assigns a letter grade to the average 
 * scores
 */
public class testScoresAndGrade {

	public static void main(String[] args) {
		// declare variables
		double test1 = 0.0,
				test2 = 0.0,
				test3 = 0.0;
		double average;
		
		// instance of scanner
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the numeric score"
				+ " for your first test: ");
		test1 = input.nextDouble();
		
		System.out.println("Please enter the numeric score"
				+ " for your second test: ");
		test2 = input.nextDouble();
		
		System.out.println("Please enter the numeric score"
				+ " for your third test: ");
		test3 = input.nextDouble();
		
		// calculate average
		average = (test1 + test2 + test3)/3;
		// display average
		System.out.printf("Your average is %.2f \n", average);
		
		// decision statements
		if (average < 60){
			System.out.println("Your grade is a F.");
		}
		
		else
			if (average < 70){
				System.out.println("Your grade is a D.");
			}
			
			else
				if (average < 80){
				System.out.println("Your grade is a C.");
				}
				
				else
					if (average < 90){
						System.out.println("Your grade is a B.");
					}
						else{
							System.out.println("Your grade is a A.");
							}

	}  // end main

}  // end class
