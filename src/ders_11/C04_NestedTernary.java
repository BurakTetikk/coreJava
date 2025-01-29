package ders_11;

import java.util.Scanner;

public class C04_NestedTernary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter an integer number");
        int number = scan.nextInt();

        System.out.println(
                0 < number ?
                        number % 2 == 0 ? "Even number." : "Odd number."
                        :
                        -1000 < number && number < -99 ? "Three digits." : "Not three digits.");
    }
}
