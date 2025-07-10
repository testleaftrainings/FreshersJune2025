package week1.day4;

import java.util.Scanner;

public class LearnScannerClass {

	public static void multiply(int num) {

		for (int i = 0; i < num; i++) {

			System.out.println(i * num);
		}

	}

	public static void main(String[] args) {


        // Create a Scanner object to take input from the console
        Scanner obj = new Scanner(System.in);

        // Read an integer input from the user and store it in the variable 'number'
        int number = obj.nextInt();

        // Start a for loop from 0 to one less than the given number
        for (int i = 0; i < number; i++) {

            // Print the current value of i
            System.out.println(i);
        }

        // Close the Scanner object to avoid resource leaks
        obj.close();
        
        // calling the static method  without creating object 
		LearnScannerClass.multiply(19);

	}

}
