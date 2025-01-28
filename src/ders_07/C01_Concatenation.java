package ders_07;

public class C01_Concatenation {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.printf("The sum of the entered %d and %d numbers: %d\n", a, b, (a + b)); //30
        System.out.println("The sum of the entered " + a + " and " + b + " numbers: " + (a + b)); //30
        System.out.println("The sum of the numbers: " + a + b); //1020
    }
}
