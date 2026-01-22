package com.hriday.pattern;

public class pattern7 {
        public static void pattern(int n) {
            for (int i = n; i >= 0; i--) {
                for (int j = 0; j<=i ; j++) {
                    System.out.print(j+1);
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            pattern(4);
        }
    }


