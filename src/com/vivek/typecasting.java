package com.vivek;

import java.util.Scanner;

public class typecasting {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        // type casting
        // int num =(int) 67.66766f;
        // System.out.println(num);

        //automatic type promotion in expression
        // int a = 257;
        // byte b = (byte) a;
        // System.out.println(b); // 257%256 = 1 //max byte can store is 256

        // byte a= 40;
        // byte b = 50;
        // byte c = 100;
        // int d = a*b/c;
        // System.out.println(d); // output come as 20, because automatic type promotion happens, i.e byte will be converted to int and stored while performing the operation
        
        int nu ='a';
        System.out.println(nu); // 97 its the ascii value
    }
}
