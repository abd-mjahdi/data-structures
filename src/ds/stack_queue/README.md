# Stack and Queue

## Stack

A stack is a linear data structure that follows LIFO — Last In First Out. The last element you put in is the first one you get out, like a stack of plates.

| Operation | Time Complexity |
|-----------|-----------------|
| push      | O(1)            |
| pop       | O(1)            |
| peek      | O(1)            |
| clear     | O(1)            |

## Queue

A queue is a linear data structure that follows FIFO — First In First Out. The first element you put in is the first one you get out, like a line of people waiting.

| Operation | Time Complexity |
|-----------|-----------------|
| enqueue   | O(1)            |
| dequeue   | O(1)            |
| peek      | O(1)            |
| clear     | O(1)            |

## When to use which

Use a **stack** when the order of processing needs to be reversed or when you need to backtrack:
- Undo/redo functionality in a text editor
- Navigating back in a browser history
- Parsing expressions or checking balanced parentheses
- Depth-first search in a graph

Use a **queue** when things need to be processed in the order they arrived:
- Task scheduling or job queues
- Handling requests in a web server
- Breadth-first search in a graph
- Printing jobs sent to a printer

## The key question

Ask yourself: does the most recently added thing need to be handled first, or the oldest? Most recent first → stack. Oldest first → queue.