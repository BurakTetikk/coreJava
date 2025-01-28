package ders_06;

public class C03_PreIncrement_PostIncrement {
    public static void main(String[] args) {

        /*
            Post / Pre increment aynı satırda olursa farklı bir durum var
            Farklı satırda olursa değer değişir

        */

        int number = 10;

        number++;
        System.out.println(number); //11

        ++number;
        System.out.println(number); //12

        System.out.println("**** Post Increment ****");

        System.out.println(number++); //12
        System.out.println(number); //13

        System.out.println("**** Pre Increment ****");

        System.out.println(++number); //14
        System.out.println(number); //14
    }
}
