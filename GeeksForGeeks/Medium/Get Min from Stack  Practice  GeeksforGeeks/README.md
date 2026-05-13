# Get Min from Stack | Practice | GeeksforGeeks

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

---

## Topics

- Stack
- Data Structures

---

## Problem Link

https://www.geeksforgeeks.org/problems/get-minimum-element-from-stack/1

---

## Problem Statement

Implement a class SpecialStack that supports following operations:

push(x) – Insert an integer x into the stack.
pop() – Remove the top element from the stack.
peek() – Return the top element from the stack. If the stack is empty, return -1.
getMin() – Retrieve the minimum element from the stack in O(1) time. If the stack is empty, return -1.
isEmpty() –  Return true if stack is empty, else false

There will be a sequence of queries queries[][]. The queries are represented in numeric form:

1 x : Call push(x)
2:  Call pop()
3: Call peek()
4: Call getMin()
5: Call isEmpty()

The driver code will process the queries, call the corresponding functions, and print the outputs of peek(), getMin(), isEmpty() operations.
You only need to implement the above five functions.

Examples:

Input: q = 7, queries[][] = [[1, 2], [1, 3], [3], [2], [4], [1, 1], [4]]
Output: [3, 2, 1]
Explanation: 
push(2): Stack is [2]
push(3): Stack is [2, 3]
peek(): Top element is 3
pop(): Removes 3, stack is [2]
getMin(): Minimum element is 2
push(1): Stack is [2, 1]
getMin(): Minimum element is 1
Input: q = 4, queries[][] = [[1, 4], [1, 2], [4], [3], [5]]
Output: [2, 2, false]
Explanation: 
push(4): Stack is [4]
push(2): Stack is [4, 2]
getMin(): Minimum element is 2
peek(): Top element is 2
isEmpty(): false

Constraints:
1 ≤ q ≤ 105
0 ≤ values on the stack ≤ 109

---

## Language

java

---

Powered by SyncLeetX ⚡
