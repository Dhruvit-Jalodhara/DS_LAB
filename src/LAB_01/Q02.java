package LAB_01;

public class Q02 {
    public static void main(String[] args) {

        // primitive datatypes

        int a = 100;
        System.out.println(a + " int datatype of size : " + Integer.BYTES);

        float b = 1.2f;
        System.out.println(b + " float datatype of size : " + Float.BYTES);

        double c = 3.14;
        System.out.println(c + " double datatype of size : " + Double.BYTES);

        byte d = 10;
        System.out.println(d + " byte datatype of size : " + Byte.BYTES);

        short e = 30;
        System.out.println(e + " short datatype of size : " + Short.BYTES);

        char f = 'a';
        System.out.println(f + " char datatype of size : " + Character.BYTES);


        // non primitive datatypes
        String str = "Hello ";
        System.out.println(str + " : String");

        int[] arr = {1, 2, 3};
        System.out.println("[" +arr[0]+","+arr[0]+","+arr[0]+"]"+ " : Array");
    }
}
