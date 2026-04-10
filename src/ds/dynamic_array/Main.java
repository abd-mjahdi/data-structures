package ds.dynamic_array;

import ds.dynamic_array.DynamicArray;

public class Main {
    public static void main(String[] args) {
        DynamicArray arr = new DynamicArray();

        // Add 5 elements
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        System.out.println("Initial array: " + arr);

        // Get element at index 2
        System.out.println("Element at index 2: " + arr.get(2));

        // Set element at index 1
        arr.set(1, 25);
        System.out.println("After set index 1 to 25: " + arr);

        // Insert element at index 3
        arr.insert(3, 35);
        System.out.println("After insert 35 at index 3: " + arr);

        // Remove element at index 4
        arr.remove(4);
        System.out.println("After remove element at index 4: " + arr);

        // Check contains and indexOf
        System.out.println("Contains 30? " + arr.contains(30));
        System.out.println("Index of 40: " + arr.indexOf(40));

        // Clear and verify empty
        arr.clear();
        System.out.println("After clear: " + arr);

        // Edge case: get negative index
        try {
            arr.get(-1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception caught for get(-1): " + e);
        }

        // Edge case: remove from empty array
        try {
            arr.remove(0);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception caught for remove(0) on empty array: " + e);
        }

        // Test resize
        DynamicArray big = new DynamicArray(3);
        for (int i = 1; i <= 10; i++) {
            big.add(i * 10);
        }
        System.out.println("After adding 10 elements (resize triggered): " + big);
    }
}