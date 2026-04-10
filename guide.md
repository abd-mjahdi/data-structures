Here is your Stack and Queue implementation task list:

---

1. Create the `Stack` class in `Stack.java` with a private `LinkedList` or raw array as the underlying storage — use an int array called `data`, a private int called `top` initialized to -1, and a private int called `capacity` initialized to 16.

2. Write a constructor that initializes `data` as a new int array of size `capacity`.

3. Write a `size()` method that returns `top + 1`, and an `isEmpty()` method that returns true if `top` is -1.

4. Write a private `resize()` method that doubles the capacity and copies all elements over, same pattern as dynamic array.

5. Write a `push(int value)` method that adds a value to the top of the stack, calling `resize()` if needed, then incrementing `top` and placing the value at `data[top]`.

6. Write a `pop()` method that removes and returns the top element by returning `data[top]` and decrementing `top`, throwing `NoSuchElementException` if the stack is empty.

7. Write a `peek()` method that returns the top element without removing it, throwing `NoSuchElementException` if empty.

8. Write a `clear()` method that resets `top` to -1.

9. Write a `toString()` method that prints elements from bottom to top like `[1, 2, 3 <- top]`.

---

10. Create the `Queue` class in `Queue.java` with a private int array called `data`, a private int `front` initialized to 0, a private int `back` initialized to 0, a private int `size`, and a private int `capacity` initialized to 16.

11. Write a constructor that initializes `data` as a new int array of size `capacity`.

12. Write a `size()` method that returns `size`, and an `isEmpty()` method that returns true if size is zero.

13. Write a private `resize()` method that doubles capacity, copies elements in correct order starting from `front`, and resets `front` to 0 and `back` to `size` — this is the tricky part, think carefully about the order you copy.

14. Write an `enqueue(int value)` method that adds a value to the back, calling `resize()` if needed, placing the value at `data[back]`, then updating `back` as `(back + 1) % capacity` to wrap around, and incrementing size.

15. Write a `dequeue()` method that removes and returns the front element, advancing `front` as `(front + 1) % capacity` to wrap around, decrementing size, and throwing `NoSuchElementException` if empty.

16. Write a `peek()` method that returns the front element without removing it, throwing `NoSuchElementException` if empty.

17. Write a `clear()` method that resets `front`, `back`, and `size` all to zero.

18. Write a `toString()` method that prints elements from front to back like `[1, 2, 3 <- back]`.

---

19. Open `Main.java` and test Stack first: push 5 elements, print the stack, peek, pop twice, print again, pop until empty and verify exception is thrown.

20. Then test Queue in the same main: enqueue 5 elements, print the queue, peek, dequeue twice, print again, dequeue until empty and verify exception is thrown.

21. Test edge cases: push and immediately pop, enqueue and immediately dequeue, peek on empty stack and empty queue, enqueue enough elements to trigger a resize and verify order is preserved after.

22. Write the `README.md` inside the `stack_queue` folder with: two sentences on what a stack is and two on what a queue is, a table of operations and complexity for both, and one sentence each on when you would use a stack versus a queue.

23. Commit everything with the message `add stack and queue implementation`.