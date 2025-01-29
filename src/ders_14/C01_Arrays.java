package ders_14;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {
        /*
            Aynı dara türündeki birden fazla değer veya objeyi barındırabilen Java objeleridir.
            Arrayler de objedir

        */
        int[] arr1 = {7, 8, 9};

        int[] arr2 = new int[7];

        System.out.println(arr1);// [I@19dfb72a
        System.out.println(Arrays.toString(arr1));// [7, 8, 9]
        System.out.println(arr1[0]); //7

        System.out.println("-------------");

        String str = "Java çok güzel";
        String[] strArray1 = str.split(" ");
        System.out.println(Arrays.toString(strArray1));// [Java, çok, güzel]

        String[] strArray2 = str.split("a");
        System.out.println(Arrays.toString(strArray2));//[J, v,  çok güzel]

        String[] strArray3 = str.split("çok");
        System.out.println(Arrays.toString(strArray3));//[Java ,  güzel]

        String[] strArray4 = str.split("");
        System.out.println(Arrays.toString(strArray4)); //[J, a, v, a,  , ç, o, k,  , g, ü, z, e, l]
    }
}
