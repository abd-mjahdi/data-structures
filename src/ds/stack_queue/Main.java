package ds.stack_queue;

import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {

        // --- STACK TESTS ---
        System.out.println("=== Stack ===");
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("After pushing 10 20 30 40 50: " + stack);

        System.out.println("Peek: " + stack.peek());

        stack.pop();
        stack.pop();
        System.out.println("After 2 pops: " + stack);

        System.out.println("Size: " + stack.size());

        // pop until empty then trigger exception
        try {
            while (true) stack.pop();
        } catch (NoSuchElementException e) {
            System.out.println("Pop on empty stack: " + e.getMessage());
        }

        // peek on empty
        try {
            stack.peek();
        } catch (NoSuchElementException e) {
            System.out.println("Peek on empty stack: " + e.getMessage());
        }

        // push then immediately pop
        stack.push(99);
        System.out.println("Push 99 then pop: " + stack.pop());
        System.out.println("Stack is empty: " + stack.isEmpty());

        // --- QUEUE TESTS ---
        System.out.println("\n=== Queue ===");
        Queue queue = new Queue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println("After enqueuing 1 2 3 4 5: " + queue);

        System.out.println("Peek: " + queue.peek());

        queue.dequeue();
        queue.dequeue();
        System.out.println("After 2 dequeues: " + queue);

        System.out.println("Size: " + queue.size());

        // dequeue until empty then trigger exception
        try {
            while (true) queue.dequeue();
        } catch (NoSuchElementException e) {
            System.out.println("Dequeue on empty queue: " + e.getMessage());
        }

        // peek on empty
        try {
            queue.peek();
        } catch (NoSuchElementException e) {
            System.out.println("Peek on empty queue: " + e.getMessage());
        }

        // enqueue then immediately dequeue
        queue.enqueue(42);
        System.out.println("Enqueue 42 then dequeue: " + queue.dequeue());
        System.out.println("Queue is empty: " + queue.isEmpty());

        // trigger resize
        Queue bigQueue = new Queue();
        for (int i = 0; i < 20; i++) bigQueue.enqueue(i);
        System.out.println("\nAfter enqueuing 20 elements (triggers resize): " + bigQueue);
        System.out.println("Size: " + bigQueue.size());
    }
}