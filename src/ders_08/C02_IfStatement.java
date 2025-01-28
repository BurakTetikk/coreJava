package ders_08;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a character");
        char ch = scan.next().charAt(0);

        if (ch == 'j' || ch == 'J'){
            System.out.println("January");
        }

        if (ch == 'f' || ch == 'F'){
            System.out.println("February");
        }

        if (ch == 'm' || ch == 'M'){
            System.out.println("March");
        }

        if (ch == 'a' || ch == 'A'){
            System.out.println("April");
        }

        if (ch == 'm' || ch == 'M'){
            System.out.println("May");
        }

        if (ch == 'j' || ch == 'J'){
            System.out.println("June");
        }

        if (ch == 'j' || ch == 'J'){
            System.out.println("July");
        }

        if (ch == 'a' || ch == 'A'){
            System.out.println("August");
        }

        if (ch == 's' || ch == 'S'){
            System.out.println("September");
        }

        if (ch == 'o' || ch == 'O'){
            System.out.println("October");
        }

        if (ch == 'n' || ch == 'N'){
            System.out.println("November");
        }

        if (ch == 'd' || ch == 'D'){
            System.out.println("December");
        }
    }
}
