package javaAssighnment;
public class TypeConversion {
    public static void main(String[] args) {
        byte b = 13;
        System.out.println("byte n : " + b);

        short s =  b;
        System.out.println("short s : " + s);

        int i =  s;
        System.out.println("int i : " + i);

        long l =  i;
        System.out.println("long : " + l);
        System.out.println("afet making long bigger :::::::::::");
        l = 9223372036854l;
        System.out.println("long : " + l) ;
        Math.abs(l);
        i = (int)l;
        System.out.println("int : "+ i ); /// it s get the value of l % (integer highest value);
        s = (short) i;
        System.out.println("short : " + s);
        b = (byte) s;
        System.out.println("byte : " + b );

        System.out.println("int to char conversion :::: ");
        i = 87;
        char c = (char) i;
        System.out.println("char value is : " + c);
        i = (char) c; 
        System.out.println("char to in : " + i);
        System.out.println("int to decimal conversion");
        float f =  i;
        System.out.println("int to float :"  + f);
        System.out.println();
    }
}
