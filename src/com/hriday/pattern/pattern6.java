// all done by myself
package com.hriday.pattern;

public class pattern6 {
    public static void pattern(int n) {
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j<=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(4);
    }
}
