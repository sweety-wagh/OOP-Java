package Assignmentarray;

import java.util.Arrays;
import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] originalArray = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            originalArray[i] = scanner.nextInt();
        }

        int[] copiedArray = new int[size];
        for (int i = 0; i < size; i++) {
            copiedArray[i] = originalArray[i];
        }

        System.out.println("Copied array: " + Arrays.toString(copiedArray));
        scanner.close();
    }
}


