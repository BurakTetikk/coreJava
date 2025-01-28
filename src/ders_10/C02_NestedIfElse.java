package ders_10;

import java.util.Scanner;

public class C02_NestedIfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter gender");
        String gender = scan.nextLine();

        System.out.println("Please enter age");
        double age = scan.nextDouble();
        
        if (gender.equalsIgnoreCase("woman")){
            if (age < 0 || 90 < age){
                System.out.println("Invalid age");
            } else if (age < 60) {
                System.out.println("Work " + (60 - age) + " years.");
            }else {
                System.out.println("Retired");
            }
        } else if (gender.equalsIgnoreCase("man")) {
            if (age < 0 || 90 < age){
                System.out.println("Invalid age");
            } else if (age < 65) {
                System.out.println("Work " + (65 - age) + " years.");
            }else {
                System.out.println("Retired");
            }
        }else {
            System.out.println("Invalid gender");
        }
    }
}
