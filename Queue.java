package com.question1;
class Queue {
    Stack stack1;
    Stack stack2;
        public Queue(int capacity) {
            stack1 = new Stack(capacity);
            stack2 = new Stack(capacity);
        }
        public void enqueue(int value) throws IllegalAccessException {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            stack1.push(value);
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
        }
        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty. Cannot dequeue");
                return -1;
            }
            return stack1.pop();
        }
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty. Cannot peek");
                return -1;
            }
            return stack1.peek();
        }
        public boolean isEmpty() {
            return stack1.isEmpty();
        }
        public static void main(String[] args) throws IllegalAccessException {
            Queue queue = new Queue(5);
            queue.enqueue(1);
            queue.enqueue(2);
            queue.enqueue(3);
            System.out.println("Peek: " + queue.peek()); // Output: 1
            System.out.println("Dequeue: " + queue.dequeue()); // Output: 1
            System.out.println("Peek: " + queue.peek()); // Output: 2
        }
    }


