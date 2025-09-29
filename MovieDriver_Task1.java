/*
 * Assignment: Lab1 - Task 1
 * Programmer: Makayla Lee
 * Due Date: 9/29/2025
 * Course: CMSC203
 * This program asks the user
 * questions about a movie at
 * a particular theater. Then,
 * it prints the information the user
 * entered and says bye.
 */
import java.util.Scanner;

public class MovieDriver_Task1 {

	public static void main(String[] args) {
		// Creates a Scanner object to read input
		Scanner keyboard = new Scanner(System.in);
		// Creates a Movie object
		Movie movie1 = new Movie();
		// Prompts the user about the movie
		System.out.println("Enter the name of a movie");
		movie1.setTitle(keyboard.nextLine());
		System.out.println("Enter the rating of the movie");
		movie1.setRating(keyboard.nextLine());
		System.out.println("Enter the number of tickets sold for this movie");
		movie1.setSoldTickets(keyboard.nextInt());
		// Displays the data the user entered
		System.out.println(movie1);
		// Says bye to the user
		System.out.print("Goodbye");
		// Closes the Scanner object
		keyboard.close();
	}

}
