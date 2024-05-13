package com.question1;

public class Stack {
    public static void main(String[] args) throws IllegalAccessException {
        new Stack(6);
        Stack stack=new Stack(6);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(9);
        System.out.println(stack.pop());
    }
    static int top=-1;
    static int[]arr;
    static int data;
    public Stack(int capacity){
        arr=new int[capacity];
    }
    public static boolean isFull(){
        return top==arr.length-1;
    }
    public static boolean isEmpty(){
        return top==-1;
    }
    public static void push(int value) throws IllegalAccessException {
        if(!isFull())
            arr[++top]=value;
        else
            throw new IllegalAccessException("array is full.");
    }
    public static int pop(){
        if (!isEmpty())
            data=arr[top--];
        return data;

    }
    public static int peek() {
        if (!isEmpty())
            data = arr[top];
        return data;
    }
}
