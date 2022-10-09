package online.Tannenberg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Implement a program that asks the user for numbers (the program first prints "Write numbers:")
        //until the user gives the number -1. When the user writes -1, the program prints "Thx! Bye!" and ends.
        //Extend the program so that it prints the sum of the numbers (not including the -1) the user has written.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write numbers:");
        int input = 0;
        int numbers = 0;
        int sum = 0;

        while (input > -1 || input < -1) {
            input = Integer.valueOf(scanner.nextLine());
            numbers++;
            sum += input;
        }
        if (input == -1) {
            System.out.println("Thx! Bye!");

        }
        System.out.println("sum:" + (sum +1));
    }
}