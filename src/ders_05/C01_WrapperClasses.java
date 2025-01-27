package ders_05;

public class C01_WrapperClasses {
    public static void main(String[] args) {
        String str = "Java";

        System.out.println(str.toUpperCase()); //JAVA

        int numP = 20;
        // primitive data türlerinin hazır metodları yoktur, sadece değer içerirler

        //Wrapper Class'lar primitive data türleri ile aynı değerleri barındırırken değerlerin yanında hazır methodları da kullanmamıza imkan veren classlardır.


        Integer numW = 30;

        numP = numW;
        System.out.println("numW -> numP : " + numP);

        System.out.println(Integer.MAX_VALUE); //2147483647
        System.out.println(Integer.MIN_VALUE);// -2147483648

        char chP = 'a';
        Character chW = 'b';

        System.out.println(Character.isDigit(chP)); //false
        System.out.println(Character.isLowerCase(chP)); //true


        String str1 = "1234";
        String str2 = "1000";

        System.out.println(str1 + str2); //12341000
        System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2)); //2234
    }
}
