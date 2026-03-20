Here is your Linked List implementation task list:

---

1. Create a private inner class `Node` inside `LinkedList.java` with two fields: an int called `data` and a `Node` called `next`, and a constructor that takes an int and sets data to it and next to null.

2. Create the `LinkedList` class with a private `Node` called `head` pointing to the first node, and a private int called `size`, both initialized to their zero equivalents.

3. Write a `size()` method that returns size, and an `isEmpty()` method that returns true if size is zero.

4. Write an `addFirst(int value)` method that creates a new node, points its next to the current head, then sets head to the new node, and increments size.

5. Write an `addLast(int value)` method that creates a new node, traverses the list to find the last node, points that node's next to the new node, and increments size — handle the case where the list is empty separately.

6. Write an `add(int index, int value)` method that inserts a node at a given index by traversing to the node just before that position, rewiring the next pointers, and throwing an `IndexOutOfBoundsException` for invalid index — reuse `addFirst` if index is zero.

7. Write a `getFirst()` method that returns the data of the head node, and a `getLast()` method that traverses to the last node and returns its data — both should throw `NoSuchElementException` if the list is empty.

8. Write a `get(int index)` method that traverses the list to the given index and returns the data, throwing `IndexOutOfBoundsException` for invalid index.

9. Write a `removeFirst()` method that removes the head node by moving head to head.next, decrements size, and throws `NoSuchElementException` if the list is empty.

10. Write a `removeLast()` method that traverses to the second to last node, sets its next to null, decrements size, and throws `NoSuchElementException` if the list is empty — handle the single element case separately.

11. Write a `remove(int index)` method that removes the node at the given index by traversing to the node just before it and rewiring next pointers, throwing `IndexOutOfBoundsException` for invalid index — reuse `removeFirst` if index is zero.

12. Write a `contains(int value)` method that traverses the full list and returns true if any node holds that value, false otherwise.

13. Write an `indexOf(int value)` method that traverses the list and returns the index of the first node with that value, or -1 if not found.

14. Write a `reverse()` method that reverses the list in place by rewiring the next pointers of every node without creating any new nodes, updating head to point to what was the last node.

15. Write a `clear()` method that sets head to null and size to zero, releasing all nodes.

16. Write a `toString()` method that traverses the list and returns a readable string like `[1 -> 2 -> 3 -> null]`.

17. Open `Main.java` and write a main method that creates a `LinkedList`, uses addFirst and addLast to add elements, prints the list, gets elements by index, inserts at a specific index, removes first, last, and by index, checks contains and indexOf, calls reverse and prints again — run it and verify every output is correct.

18. Go back and test edge cases in `Main.java`: call `removeFirst` on an empty list and verify the exception, call `get` with an out of bounds index, add one element then call `removeLast` and verify the list is empty after, reverse a single element list and verify nothing breaks.

19. Write the `README.md` inside the `linked_list` folder with: two sentences on what a linked list is, a table of all operations with their time complexity, and one sentence on when you would use this over a dynamic array.

20. Commit everything with the message `add linked list implementation`.