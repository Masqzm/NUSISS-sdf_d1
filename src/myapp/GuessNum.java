package myapp;

import java.io.Console;
import java.security.SecureRandom;
import java.util.Random;

public abstract class GuessNum {
    public static void main(String[] args) {
        // Create random num generator
        Random rand = new SecureRandom();
        
        // Generate num btwn 1-10
        int toGuess = rand.nextInt(10) + 1;
        System.out.printf("To guess: %d\n", toGuess);

        // Get input from user
        Console cons = System.console();

        int tries = 0;
        // boolean hasWon = false;

        while(tries < 3)
        {
            String input = cons.readLine("Guess a number between 1-10. ");
            int myGuess = Integer.parseInt(input);

            if(myGuess > toGuess)
                System.out.println("Too high");
            else if(myGuess < toGuess)
                System.out.println("Too low");
            else {
                System.out.println("YOU WIN!");
                //break;
                // Exit program
                System.exit(0); 
            }
                
            ++tries;
        }

        System.out.println("YOU LOSE!");
        // if(hasWon)
        //     System.out.println("YOU WIN!");
        // else
        //     System.out.println("YOU LOSE!");
    }
}
