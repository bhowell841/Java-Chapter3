import java.util.Scanner;

/*
 * Brendan Howell
 * CSC - 151
 * Speed of sound project
 *
 * This project measures the speed of sound through a medium
 */
public class SpeedOfSound {

	public static void main(String[] args) {
		// Declare variables
		String medium;
		Double distance;
		Double time = 0.00;

		// Instance of scanner
		Scanner input = new Scanner(System.in);

		// Get medium
		System.out.println("What medium are you using?  Please type "
				+ "Air, Water, or Steel.  ");
		medium = input.nextLine();
		// makes the medium variable lowercase
		String lower = medium.toLowerCase();

		// Get distance
		System.out.println("How many feet will the sound travel: ");
		distance = input.nextDouble();

		// Decision Structure
		if (lower.equals("air")){
			time = distance/1100;
			System.out.printf("It will take %.2f seconds for sound to travel "
					+ distance + " feet through " + lower + ".", time);
		}
			else
				if (lower.equals("water")){
					time = distance/4900;
					System.out.printf("It will take %.2f seconds for sound to travel "
							+ distance + " feet through " + lower + ".", time);
				}
					else
						if (lower.equals("steel")){
							time = distance/16400;
							System.out.printf("It will take %.2f seconds for sound to travel "
									+ distance + " feet through " + lower + ".", time);
						}
						else
						{
							System.out.println("That is not a validate selection.");
						} // end decision structure

	}  // End main

}  // End class
