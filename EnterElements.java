package com.question1;
public class EnterElements {
    private static int[] arr;
    public static void main(String[] args) {
        int capacity = 5;
        arrayDeclaration(capacity);
        EnterElements enterElements = new EnterElements();
        enterElements.add(10, 0);
        enterElements.add(30, 1);
        enterElements.add(30, 2);
        enterElements.add(40, 3);
        enterElements.add(50, 4);
        int searchResult = enterElements.search(30);
        System.out.println("30 is found " + searchResult + " times.");
    }
    public static void arrayDeclaration(int capacity) {
        arr = new int[capacity];
    }
    public void add(int value, int index) {
        if (index >= 0 && index < arr.length) {
            arr[index] = value;
        } else {
            System.out.println("Index out of bounds.");
        }
    }
    public int search(int target) {
        int count = 0;
        for (int j : arr) {
            if (j == target) {
                count++;
            }
        }
        return count;
    }
}

