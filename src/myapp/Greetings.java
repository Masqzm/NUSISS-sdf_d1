package myapp;

import java.io.Console;

public class Greetings {

    public static void main(String[] args) {
        // Get console
        Console cons = System.console();

        // Prompt user name, assign to variable
        String input_name = cons.readLine("What is your name? ");
        int input_age = Integer.parseInt(cons.readLine("What is your age? "));

        // Print the input
        System.out.printf("Hello %s. You are %d years old.\n", input_name, input_age);
    }
}