package ders_07;

public class C02_Operators {
    public static void main(String[] args) {
        int a = 20;

        a = a + 10; //30

        int b = 20;

        System.out.println(a == b); //false

        System.out.println(a == b + 10); // true

        boolean c = 20 == b;

        System.out.println(c); //true

//        && vs &
//        && -> gördüğü ilk false ifadeden sonra sonucun false olacağını bilir
//        & -> tüm işlemleri yapar ve sonucu verir

    }
}
