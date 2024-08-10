public class Main {
    public static void main(String[] args) {
        // (a) While Loop to Print Odd Numbers from 1 to 50
        System.out.println("Odd numbers from 1 to 50:");
        int number = 1;
        while (number <= 50) {
            System.out.println(number);
            number += 2; // Move to the next odd number
        }
        
        System.out.println(); // New line for readability
        
        // (b) Do-While Loop to Print the Pattern from 1 to 20
        System.out.println("Pattern from 1 to 20:");
        number = 1;
        do {
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println(number + " - FizzBuzz");
            } else if (number % 3 == 0) {
                System.out.println(number + " - Fizz");
            } else if (number % 5 == 0) {
                System.out.println(number + " - Buzz");
            } else {
                System.out.println(number + " - Pop");
            }
            number++;
        } while (number <= 20);
        
        System.out.println(); // New line for readability
        
        // (c) Enhanced For-Loop to Compute the Average of an Array
        System.out.println("Average of the given array:");
        int[] numbers = {10, 20, 30, 40, 50}; // Example array
        int sum = 0;
        int count = 0;

        for (int num : numbers) {
            sum += num;
            count++;
        }

        double average = (double) sum / count;
        System.out.println("Average: " + average);
    }
}