package ders_11;

import java.util.Scanner;

public class C01_TernaryOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a positive integer.");
        int number = scan.nextInt();

        System.out.println(number % 5 == 0 ? "The number is multiple of 5" : "The number isn't multiple of 5");


    }
}
