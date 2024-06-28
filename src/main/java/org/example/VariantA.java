package org.example;


import java.util.Arrays;

public class VariantA {

    private static int shortNumber = 1;
    private static int longNumber;
    private static int[] numbers;

    public static String shortNumberAndLongNumber(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (longNumber < arr[i]) {
                longNumber = arr[i];
            }
            if (shortNumber > arr[i]) {
                shortNumber = arr[i];
            }
        }

        return "short number " + shortNumber + "\nlong number " + longNumber;
    }

    public static void middleNumbers(int arr[]) {
        numbers = new int[arr.length];
        int temp = 0;
        int avg = arr.length / 2;
        for (int i = 0; i < arr.length + 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] >= arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[avg] == arr[i]) {
                continue;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n"+avg);
    }

    public static void palindromNumber(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int originalNumber = arr[i];
            int reversedNumber = 0;
            int temp = originalNumber;

            while (temp != 0) {
                int lastDigit = temp % 10;
                reversedNumber = reversedNumber * 10 + lastDigit;
                temp /= 10;
            }

            if (originalNumber == reversedNumber) {
                arr[i] = originalNumber;
            } else {
                arr[i] = 0;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


}
