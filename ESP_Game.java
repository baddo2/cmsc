/*
 * Class: CMSC203 
 * Instructor: Khandan Vahabzadeh Monshi
 * Description: (Give a brief description for each Class)
 * Due: 09/11/2023
 * Platform/compiler:
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: _Brian Addo_________
*/

import java.util.Random;
import java.util.Scanner;

public class ESP_Game 
{
	public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Prompt for user information
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Describe yourself: ");
        String description = scanner.nextLine();
        
        System.out.print("Due Date: ");
        String dueDate = scanner.nextLine();
        
        System.out.println("CMSC203 Assignment1: Test your ESP skills!");


        // Initialize variables for tracking correct guesses and rounds
        int correctGuesses = 0;
        int totalGuesses = 0;

        // Define the list of colors
        String color1 = "Red";
        String color2 = "Green";
        String color3 = "Blue";
        String color4 = "Orange";
        String color5 = "Yellow";

        // Main loop 
        for (int round = 1; round <= 10; round++) {
            int randomIndex = random.nextInt(5); 
            String selectedColor = "";
            
            System.out.println("\nRound " + round);

            // Assign a color based on the random index
            switch (randomIndex) {
                case 0:
                    selectedColor = color1;
                    break;
                case 1:
                    selectedColor = color2;
                    break;
                case 2:
                    selectedColor = color3;
                    break;
                case 3:
                    selectedColor = color4;
                    break;
                case 4:
                    selectedColor = color5;
                    break;
            }

            // Prompt the user to guess the color
            System.out.println("\nI am thinking of a color.\nIs it Red, Green, Blue, Orange, or Yellow?\nEnter your guess: ");
            String userGuess = scanner.nextLine();
            
            // Check if users guess is in list.
            while (!userGuess.equalsIgnoreCase(color1) && !userGuess.equalsIgnoreCase(color2) &&
                   !userGuess.equalsIgnoreCase(color3) && !userGuess.equalsIgnoreCase(color4) &&
                   !userGuess.equalsIgnoreCase(color5)) 
            {
                System.out.println("You entered an incorrect color. Is it Red, Green, Blue, Orange, or Yellow?");
                System.out.println("Enter your guess again: ");
                userGuess = scanner.nextLine();
            }

            // Check if the user's guess matches the selected color 
            if (userGuess.equalsIgnoreCase(selectedColor)) {
                System.out.println("I was thinking of " + selectedColor);
                correctGuesses++;
            } else {
                System.out.println("I was thinking of " + selectedColor);
            }

            totalGuesses++;
        }

        System.out.println("\nGame Over");
        System.out.println("\nYou guessed correctly " + correctGuesses + " out of " + totalGuesses + " colors correctly.");
        System.out.println("User Name: " + name);
        System.out.println("User Description: " + description);
        System.out.println("Due Date: " + dueDate);
        
        scanner.close();
    }
  }
