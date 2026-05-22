# Pacific Atlantic Water Flow | Practice | GeeksforGeeks

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

---

## Topics

- Graph
- DFS
- BFS
- Algorithms

---

## Problem Link

https://www.geeksforgeeks.org/problems/pacific-atlantic-water-flow/1

---

## Problem Statement

You are given a matrix mat[][] of dimensions n x m, where mat[i][j] represents the height of a cell in a rectangular grid island. The Pacific Ocean touches the island's left and top borders, and the Atlantic Ocean touches the island's right and bottom borders. Rainwater can flow from a cell to its neighbouring cells in the directions North, South, East, and West, but only if the neighbouring cell has a height less than or equal to the current cell's height.

The task is to determine all coordinates (x, y) such that water can flow from the cell (x, y) to both the Pacific Ocean and the Atlantic Ocean. Water can flow from any adjacent cell directly into an ocean.

Examples:

Input: mat[][] = [[1, 2, 2, 3, 5],
                [3, 2, 3, 4, 4],
                [2, 4, 5, 3, 1],
                [6, 7, 1, 4, 5],
                [5, 1, 1, 2, 4]]
Output: 7
Explanation: In the given matrix, there are 7 coordinates through which the water can flow to both the Oceans. They are  (0, 4), (1, 3), (1, 4), (2, 2), (3, 0), (3, 1), and (4, 0).
Input: arr[][] = [[2, 2], 
               [2, 2]]
Output: 4
Explanation: In the following example, all cells allow water to flow to both the Oceans.

Constraints:
1 ≤ number of rows, number of columns ≤ 103
1 ≤ arr[i][j] ≤ 103

---

## Language

java

---

Powered by SyncLeetX ⚡
