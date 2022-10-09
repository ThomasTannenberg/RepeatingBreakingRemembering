package online.Tannenberg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Implement a program that asks the user for numbers (the program first prints "Write numbers: ")
        // until the user gives the number -1. When the user writes -1, the program prints "Thx! Bye!" and ends.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write numbers: ");
        int number = 0;

        while (number > -1 || number < -1) {
            number = Integer.valueOf(scanner.nextLine());
        }
        if (number == -1) {
            System.out.println("Thx! Bye!");
        }
    }
}