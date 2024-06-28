package org.example;

public class VariantB {
    public static void multiplicationTable() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(String.format("%d x %d = %2d  ", i, j, i * j));
            }
            System.out.println();
        }
    }

    public static void reverseArray(int arr[]) {
        for (int i = arr.length-1; i >= 0 ; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void oneNumbersToHundred(int num) {
        for (int i = 1; i <= num; i++) {
            if (i%3==0) {
                System.out.print(i + " ");
            }
        }
    }


}
