/*
 * Class: CMSC203 
 * Instructor:
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

        // List of color names
        String[] colors = {"Red", "Green", "Blue", "Orange", "Yellow"};

        // Variables to keep track of correct guesses
        int correctGuesses = 0;
        int totalGuesses = 0;

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Describe yourself: ");
        String description = scanner.nextLine();

        System.out.print("Due Date: ");
        String dueDate = scanner.nextLine();

        System.out.println("CMSC203 Assignment1: Test your ESP skills!\n\n");
        
        //Round of Game
        int round = 1;


        // Run the test 11 times
        for (int i = 0; i < 10; i++) 
        {
            int randomIndex = random.nextInt(colors.length); 
            String selectedColor = colors[randomIndex]; 
            
            System.out.println("\nRound " + round++ );


            System.out.println("\nI am thinking of a color.\nIs it Red, Green, Blue, Orange, or Yellow?\n"
            		+ "Enter your guess: ");
            
            String userGuess = scanner.nextLine();

            if (userGuess.equalsIgnoreCase(selectedColor)) 
            {
                System.out.println("I was thinking of " + selectedColor);
                correctGuesses++;
            }
            else 
            {
            	System.out.println("I was thinking of " + selectedColor);
            }
            	

         }

            totalGuesses++;
     
        
        System.out.println("\nGame Over");
        System.out.println("\nYou guessed correctly " + correctGuesses + " out of " + totalGuesses + " colors correctly.");
        System.out.println("\nUser Name: " + name);
        System.out.println("\nUser Description: " + description);
        System.out.println("\nDue Date: " + dueDate);
        
        scanner.close();
    }
  }
