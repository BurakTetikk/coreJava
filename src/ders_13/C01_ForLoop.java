package ders_13;

public class C01_ForLoop {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i < 101; i++) {
            sum += i;
        }

        System.out.println(sum);

        System.out.println("----------------");

        int first = 10;
        int last = 20;

        for (int i = first; i < last + 1; i += 3){
            System.out.print(i + " ");
        }

        System.out.println("\n----------------");

        int firstNumber = 10;

        for (int i = firstNumber; 0 < i; i--) {
            if (i % 3 == 0) {
                System.out.printf("%d ", i);
            }
        }



    }
}
