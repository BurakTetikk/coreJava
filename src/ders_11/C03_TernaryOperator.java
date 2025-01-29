package ders_11;

import java.util.Scanner;

public class C03_TernaryOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter note.");

        double d = scan.nextDouble();

        System.out.println(50 <= d ? "Passed" : "Try Again");

    }
}
