package com.srm.cjava.wk01.day06;

import java.util.ArrayList;

class queueclass<T> {

    int front = -1;
    int rear = -1;
    ArrayList<T> arr = new ArrayList<>();

    T front() {

        if (front == -1)
            return null;
        return arr.get(front);
    }

    T rear() {

        if (rear == -1)
            return null;
        return arr.get(rear);
    }

    void enqueue(T X) {

        if (this.empty()) {
            front = 0;
            rear = 0;
            arr.add(X);
        } else {
            front++;
            if (arr.size() > front) {
                arr.set(front, X);
            } else
                arr.add(X);
        }
    }

    void dequeue() {

        if (this.empty())
            System.out.println("Queue is empty");
        else if (front == rear) {
            front = rear = -1;
        } else {
            rear++;
        }
    }

    boolean empty() {

        if (front == -1 && rear == -1)
            return true;
        return false;
    }

    public String toString() {

        if (this.empty())
            return "";
        String res = "";
        for (int i = rear; i < front; i++) {
            res += String.valueOf(arr.get(i)) + ",";
        }
        res += String.valueOf(arr.get(front));
        return res;
    }
}

public class MyQueue {
    public static void main(String[] args) {
        queueclass<Integer> queue1 = new queueclass<>();
        queue1.enqueue(6);
        queue1.enqueue(97);
        queue1.enqueue(14);
        System.out.println("After enqueue of 6, 97 and 14 elements:\n" + queue1);
        queue1.dequeue();
        System.out.println("After dequeue :\n" + queue1);

        queueclass<String> queue2 = new queueclass<>();
        queue2.enqueue("Akash");
        queue2.enqueue("Latha");
        queue2.enqueue("mellows");
        System.out.println("\nAfter enqueue of 3 string elements:\n" + queue2);
        System.out.println("Front = " + queue2.front() + ", rear = " + queue2.rear());

        queueclass<Float> queue3 = new queueclass<>();
        System.out.println("\nCreated new Float type queue ...");
        System.out.println("Checking if queue is empty or not :\n" + queue3.empty());
    }
}
