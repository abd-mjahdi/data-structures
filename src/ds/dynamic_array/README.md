# DynamicArray

A dynamic array is kinda like a regular array but it can grow or shrink in size when needed. It stores elements continously and lets you access them by index.

## Operations

| Operation   | Description                     | Time Complexity |
|------------|---------------------------------|----------------|
| add(value) | Adds element to end             | O(1) amortized |
| insert(i,v)| Insert at index i               | O(n)           |
| remove(i)  | Remove element at index i       | O(n)           |
| get(i)     | Get element at index i          | O(1)           |
| set(i,v)   | Set element at index i          | O(1)           |
| size()     | Get number of elements          | O(1)           |
| isEmpty()  | Checks if array is empty        | O(1)           |
| contains(v)| Check if value exists           | O(n)           |
| indexOf(v) | Returns index of value          | O(n)           |
| clear()    | Clears the array                | O(1)           |

You would use a dynamic array instead of a regular fixed array when you want the size to change during runtime and dont want to worry about allocating a bigger array yourself.