package ds.linked_list;

import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;
    private int size = 0;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            size++;
            return;
        }
        node.next = head;
        head = node;
        size++;
    }

    public void addLast(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            size++;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        size++;
    }

    public void add(int index, int value) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("index out of bound");
        }
        if (index == 0) {
            addFirst(value);
            return;
        }
        Node node = new Node(value);
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    public int getFirst() {
        if (size == 0) throw new NoSuchElementException("list is empty");
        return head.data;
    }

    public int getLast() {
        if (size == 0) throw new NoSuchElementException("list is empty");
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp.data;
    }

    public int get(int index) {
        if (index < 0 || index > size - 1) {
            throw new IllegalArgumentException("index out of bound");
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public void removeFirst() {
        if (size == 0) throw new NoSuchElementException("the list is empty");
        head = head.next;
        size--;
    }

    public void removeLast() {
        if (size == 0) throw new NoSuchElementException("the list is empty");
        if (size == 1) {
            removeFirst();
            return;
        }
        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
        temp.next = null;
        size--;
    }

    public void remove(int index) {
        if (index < 0 || index > size - 1) {
            throw new IllegalArgumentException("index out of bound");
        }
        if (size == 0) throw new NoSuchElementException("the list is empty");
        if (index == 0) {
            removeFirst();
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }

    public boolean contains(int value) {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.data == value) return true;
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(int value) {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.data == value) return i;
            temp = temp.next;
        }
        return -1;
    }

    public void reverse() {
        if (size == 0 || size == 1) return;
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node temp = head;
        while (temp != null) {
            sb.append(temp.data);
            if (temp.next != null) sb.append(" -> ");
            temp = temp.next;
        }
        sb.append(" -> null]");
        return sb.toString();
    }
}