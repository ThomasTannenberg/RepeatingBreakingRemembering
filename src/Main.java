package online.Tannenberg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Implement a program that asks the user for numbers (the program first prints "Write numbers:")
        //until the user gives the number -1. When the user writes -1, the program prints "Thx! Bye!" and ends.
        //Extend the program so that it prints the sum of the numbers (not including the -1) the user has written.
        //Extend the program so that it also prints the number of numbers (not including the -1) the user has written.
        //Extend the program so that it prints the mean of the numbers (not including the -1) the user has written.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write numbers:");
        int input = 0;
        int numbers = 0;
        int sum = 0;
        double average = 0;

        while (input > -1 || input < -1) {
            input = Integer.valueOf(scanner.nextLine());
            numbers++;
            sum += input;
        }
        if (input == -1) {
            System.out.println("Thx! Bye!");
            sum = sum +1;
            numbers = numbers -1;
            average = 1.0 * sum / numbers;


        }
        System.out.println("Sum:" + sum);
        System.out.println("Numbers: " + numbers);
        System.out.println("Average:" + average);
    }
}