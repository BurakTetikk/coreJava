package ders_21;

import java.io.FileInputStream;
import java.io.IOException;

public class C01_TXTRead {
    public static void main(String[] args) throws IOException {
        String path = "src/ders_21/lorem.txt";

        FileInputStream stream = new FileInputStream(path);

        //System.out.println((char) stream.read()); // -> ilk karakteri okur

        System.out.println("-----------");

        int count = 0;
        String str = "";

        while ((count = stream.read()) != -1){
            str += (char) count;
        }


        String[] arr = str.split("[)]");
        System.out.println("Title: " + (arr.length - 1));

        String[] arr1 = str.split("-");
        System.out.println("Stuff: " + (arr1.length - 1));

        /*System.out.println(str);

        System.out.println("-----------");

        char ch = ')';
        System.out.println(ch);

        System.out.println(')');

        System.out.println("HATA!");*/
    }
}
