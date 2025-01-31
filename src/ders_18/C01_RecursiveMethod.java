package ders_18;

public class C01_RecursiveMethod {
    public static void main(String[] args) {
        int i = 5;

        int result = summation(i);

        System.out.println(result);
    }

    private static int summation(int i) {


        if (i == 1){
            return  1;
        } else {
            return  i + summation(i - 1);
        }


    }
}
