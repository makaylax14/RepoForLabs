/*
 * Assignment: Lab1 - Task 2
 * Programmer: Makayla Lee
 * Due Date: 9/29/2025
 * Course: CMSC203
 * This program asks the user questions about a movie at a particular theater.
 * It prints the information the user entered and asks them if they want to do it again.
 * It keeps going until the user enters 'n' for no. Then, it says bye.
 */
import java.util.Scanner;

public class MovieDriver_Task2 {

	public static void main(String[] args) {
		// Declares char variable named answer to hold the user's decision about whether they want to continue
		char answer;
		// Creates a Scanner object to read input
		Scanner keyboard = new Scanner(System.in);
		// Creates a Movie object
		Movie movie1 = new Movie();
		// Repeatedly prompts the user about a movie until they enter 'n'
		do {
			System.out.println("Enter the name of a movie");
			movie1.setTitle(keyboard.nextLine());
			System.out.println("Enter the rating of the movie");
			movie1.setRating(keyboard.nextLine());
			System.out.println("Enter the number of tickets sold for this movie");
			movie1.setSoldTickets(keyboard.nextInt());
			keyboard.nextLine();
			// Prints the data the user entered
			System.out.println(movie1);
			System.out.println("Do you want to enter another? (y or n)");
			answer=keyboard.nextLine().charAt(0);
		} while (answer == 'Y' || answer == 'y');
		// Says bye to the user
		System.out.print("Goodbye");
		// Closes the Scanner object
		keyboard.close();
	}

}
