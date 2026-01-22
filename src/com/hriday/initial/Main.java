package com.hriday.initial;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("hello !!! welcome to the calculator");
        Scanner hr = new Scanner(System.in);
        System.out.println("enter your required operation:- 1.ADD 2.SUB 3.MUL 4.DIV");
        int op = hr.nextInt();

        if (op == 1){
        System.out.println("type your two integers:");
        float po1 = hr.nextFloat();
        float po2 = hr.nextFloat();
        float res = (po1+po2);
        System.out.println(res);
        }
        if (op == 2){
            System.out.println("type your two integers:");
            float po1 = hr.nextFloat();
            float po2 = hr.nextFloat();
            float res = (po1-po2);
            System.out.println(res);
        }
        if (op == 3){
            System.out.println("type your two integers:");
            float po1 = hr.nextFloat();
            float po2 = hr.nextFloat();
            float res = (po1*po2);
            System.out.println(res);
        }
        if (op == 4){
            System.out.println("type your two integers:");
            float po1 = hr.nextFloat();
            float po2 = hr.nextFloat();
            float res = po1/po2;
            System.out.println(res);
        }
        else {
            System.out.println("look for something else");
        }



    }
}
