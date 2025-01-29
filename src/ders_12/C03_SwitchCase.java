package ders_12;

import java.util.Scanner;

public class C03_SwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number of day.");

        int numberOfDay = scan.nextInt();

        switch (numberOfDay) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Mid-week");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("ERROR!");

        }
    }
}
