package com.vivek;

import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("pls enter temp in c: ");
        float tempc = i.nextFloat();
        float tempf = (tempc *9/5)+32;
        System.out.println("temp in f is: "+tempf);
    }
}
