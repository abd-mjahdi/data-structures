package ds.linked_list;

import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        // add elements
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addFirst(5);
        System.out.println("After adding: " + list);

        // get elements
        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());
        System.out.println("Index 2: " + list.get(2));

        // insert at index
        list.add(2, 99);
        System.out.println("After insert 99 at index 2: " + list);

        // remove
        list.removeFirst();
        System.out.println("After removeFirst: " + list);
        list.removeLast();
        System.out.println("After removeLast: " + list);
        list.remove(1);
        System.out.println("After remove index 1: " + list);

        // contains and indexOf
        System.out.println("Contains 20: " + list.contains(20));
        System.out.println("indexOf 30: " + list.indexOf(30));

        // reverse
        list.reverse();
        System.out.println("After reverse: " + list);

        // edge cases
        System.out.println("\n-- Edge Cases --");

        // removeFirst on empty
        LinkedList empty = new LinkedList();
        try {
            empty.removeFirst();
        } catch (NoSuchElementException e) {
            System.out.println("removeFirst on empty: " + e.getMessage());
        }

        // get out of bounds
        try {
            list.get(999);
        } catch (IllegalArgumentException e) {
            System.out.println("get out of bounds: " + e.getMessage());
        }

        // single element then removeLast
        LinkedList single = new LinkedList();
        single.addFirst(42);
        single.removeLast();
        System.out.println("After removeLast on single element list, isEmpty: " + single.isEmpty());

        // reverse single element
        LinkedList one = new LinkedList();
        one.addFirst(1);
        one.reverse();
        System.out.println("Reverse single element: " + one);
    }
}