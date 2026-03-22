# Linked List

A linked list is a linear data structure where each element is a node that holds a value and a pointer to the next node. Unlike arrays, elements are not stored in contiguous memory — each node lives independently and is connected through references.

## Operations

| Operation     | Time Complexity |
|---------------|-----------------|
| addFirst      | O(1)            |
| addLast       | O(n)            |
| add(index)    | O(n)            |
| getFirst      | O(1)            |
| getLast       | O(n)            |
| get(index)    | O(n)            |
| removeFirst   | O(1)            |
| removeLast    | O(n)            |
| remove(index) | O(n)            |
| contains      | O(n)            |
| indexOf       | O(n)            |
| reverse       | O(n)            |
| clear         | O(1)            |

## Why addFirst and removeFirst are O(1)

`addFirst` and `removeFirst` always operate directly on the head node — no traversal needed, just pointer updates. The size of the list does not matter, it is always one step.

All other adds and removes have to walk through the list first to find the right position, so the time grows with the size of the list, making them O(n).

## When to use

Use a linked list over a dynamic array when you need frequent insertions and deletions at the front or middle of the list, and do not need random access by index.