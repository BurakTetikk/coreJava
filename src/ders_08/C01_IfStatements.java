package ders_08;

import java.util.Scanner;

public class C01_IfStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a positive number:");

        int i = scan.nextInt();

        boolean b = i % 5 == 0;

        if (b) {
            System.out.println("Given number is a multiple of 5");
        }
    }
}
