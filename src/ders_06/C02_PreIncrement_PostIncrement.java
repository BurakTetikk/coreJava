package ders_06;

public class C02_PreIncrement_PostIncrement {
    public static void main(String[] args) {
        int number = 10;

        int b = number;
        number++;

        System.out.println(b); //10
        System.out.println(number); //11

        System.out.println("**** Post Increment ****");

        int c = number++;
        System.out.println(c);//11
        System.out.println(number);//12

        System.out.println("**** Pre Increment ****");

        number = 11;
        c = ++number;
        System.out.println(c);
        System.out.println(number);


    }
}
