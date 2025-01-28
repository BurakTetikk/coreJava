package ders_10;

import java.util.Scanner;

public class C01_NestedIfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter gender");
        String gender = scan.nextLine();

        System.out.println("Please enter age");
        double age = scan.nextDouble();

        if (age < 0 || 99 < age) {
            System.out.println("Invalid age");
        } else if (!(gender.equalsIgnoreCase("Woman") ||
                gender.equalsIgnoreCase("Man"))) {
            System.out.println("Invalid gender");
        } else if (gender.equalsIgnoreCase("woman") && (60 < age)) {
            System.out.println("Retired");
        } else if (gender.equalsIgnoreCase("woman") && age < 60) {
            System.out.println("Work " + (60 - age) + " years.");
        } else if (gender.equalsIgnoreCase("man") && (65 < age)) {
            System.out.println("Retired");
        } else if (gender.equalsIgnoreCase("man") && age < 65) {
            System.out.println("Work " + (65 - age) + " years.");
        }
    }
}
