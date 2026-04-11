package ds.stack_queue;

import java.util.NoSuchElementException;

public class Queue {
    private int[] data;
    private int front = 0;
    private int back = 0;
    private int size;
    private int capacity = 16;

    public Queue() {
        this.data = new int[capacity];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void resize() {
        int[] newArray = new int[capacity * 2];
        for (int i = 0; i < size; i++) {
            newArray[i] = data[(front + i) % capacity];
        }
        capacity *= 2;
        front = 0;
        back = size;
        data = newArray;
    }

    public void enqueue(int value) {
        if (size == capacity) {
            resize();
        }
        data[back] = value;
        back = (back + 1) % capacity;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) throw new NoSuchElementException("empty queue");
        int result = data[front];
        front = (front + 1) % capacity;
        size--;
        return result;
    }

    public int peek() {
        if (isEmpty()) throw new NoSuchElementException("empty queue");
        return data[front];
    }

    public void clear() {
        size = 0;
        front = 0;
        back = 0;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < size; i++) {
            if (i < size - 1) {
                result += data[(front + i) % capacity] + ", ";
            } else {
                result += data[(front + i) % capacity];
            }
        }
        return "[" + result + " <- back]";
    }
}