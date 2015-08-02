package com.diamond;

public class IsoscelesTriangle {
    public void drawIsoscelesTriangle(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 3; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                for(int j = 0; j < k ; j++)
                System.out.print("*");
            }
            System.out.println();
        }
    }
}