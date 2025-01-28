package ders_09;

import java.util.Scanner;

public class C01_IfStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter length of triangle edge");

        double d1 = scan.nextDouble();
        double d2 = scan.nextDouble();
        double d3 = scan.nextDouble();

        if (d1 == d2 && d2 == d3) {
            System.out.println("Equilateral triangle");
        } else {
            System.out.println("Not equilateral triangle");
        }
    }
}
