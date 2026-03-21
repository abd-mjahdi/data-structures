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

## When to use

Use a linked list over a dynamic array when you need frequent insertions and deletions at the front or middle of the list, and do not need random access by index.