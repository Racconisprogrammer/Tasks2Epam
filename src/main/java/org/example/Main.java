package org.example;


public class Main {
    public static void main(String[] args) {
        int[][] arr = VariantC.generateRandomNumber();
//        System.out.println(VariantA.shortNumberAndLongNumber(arr));
//        VariantA.middleNumbers(arr);
//        VariantA.palindromNumber(arr);
//        VariantB.multiplicationTable();
//        VariantB.reverseArray(arr);
//        VariantB.oneNumbersToHundred(100);
//        VariantC.generateRandomNumber();
        System.out.println("Исходная матрица:");
        VariantC.printMatrix(arr);

        VariantC.shiftRight(arr, 2);
        System.out.println("\nМатрица после сдвига вправо на 2 позиции:");
        VariantC.printMatrix(arr);

    }
}