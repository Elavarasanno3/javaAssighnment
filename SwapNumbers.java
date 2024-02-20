package javaAssighnment;

import java.util.Arrays;

public class SwapNumbers {

    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        System.out.println(Arrays.toString(swap1(a,b)));
        System.out.println(Arrays.toString(swap2(a,b)));
    }
    static int [] swap1(int a,int b){
        a = a + b;
        b = a - b;
        a = a - b;
        return new int[] {a,b};
    }
    static int [] swap2(int a,int b){
        return new int[]{b,a};
    }
    
}

