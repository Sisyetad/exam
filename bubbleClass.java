package com.question1;
import java.util.Arrays;
public class bubbleClass {
            public static void bubbleSort(char[] arr) {
                int n = arr.length;
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr[j] > arr[j + 1]) {
                            // Swap arr[j] and arr[j+1]
                            char temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                }
            }
            public static void main(String[] args) {
                char[] alphabets = {'b', 'c', 'a', 'f', 'e', 'd'};
                System.out.println(STR."Original array: \{Arrays.toString(alphabets)}");
                bubbleSort(alphabets);
                System.out.println(STR."Sorted array: \{Arrays.toString(alphabets)}");
            }
}
