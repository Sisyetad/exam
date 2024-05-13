package com.question1;

public class Array {

    public static int[] deleteElement(int[]array,int index){
        int[]newArray=new int[array.length-1];
        if(index>=0&&index<=array.length-1){
            for (int i = 0; i < index; i++) {
                newArray[i] = array[i];
            }
            for (int i = index; i < array.length; i++) {
                newArray[i]=array[i+1];
            }
            return newArray;


        }
        return array;
    }

    public static void main(String[] args) {
        int[]array= {3, 7, 1, 9, 4};
        //deleteElement(array,2);
        System.out.println(deleteElement(array,2));
    }
}
