package com.diamond;

public class DiamondTriangle {
    public void drawDiamondCenteredTriangle(int heightOfTriangle) {
        int rows = heightOfTriangle;
        int topStarCount = 1;
        int topSpaceCount = rows - 1;
        for (int rowsCount = 1; rowsCount <= rows; rowsCount++) {
            for (int space = 0; space < topSpaceCount; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star < topStarCount; star++) {
                System.out.print("*");
            }
            System.out.println();
            topStarCount += 2;
            topSpaceCount--;
        }

        int bottomStarCount = 2 * (rows - 2) + 1;
        int bottomSpaceCount = 1;
        for (int rowCount = 1; rowCount <= rows; rowCount++) {
            for (int space = 0; space < bottomSpaceCount; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star < bottomStarCount; star++) {
                System.out.print("*");
            }
            bottomStarCount -= 2;
            bottomSpaceCount++;
            System.out.println();

        }
    }
}