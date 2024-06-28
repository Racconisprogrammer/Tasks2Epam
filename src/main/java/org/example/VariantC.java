package org.example;

import java.util.Random;

public class VariantC {

    public static int[][] generateRandomNumber() {
        Random random = new Random();
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(50);
            }
        }
        return arr;
    }

    public static int[][] shiftRight(int[][] matrix, int key) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        key = key % cols;
        for (int i = 0; i < rows; i++) {
            int[] tempRow = new int[cols];
            for (int j = 0; j < cols; j++) {
                tempRow[(j + key) % cols] = matrix[i][j];
            }
            matrix[i] = tempRow;
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }


}
