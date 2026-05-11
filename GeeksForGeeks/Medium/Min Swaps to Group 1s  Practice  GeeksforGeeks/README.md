# Min Swaps to Group 1s | Practice | GeeksforGeeks

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

---

## Topics

- Arrays
- Data Structures

---

## Problem Link

https://www.geeksforgeeks.org/problems/minimum-swaps-required-to-group-all-1s-together2451/0

---

## Problem Statement

You are given a binary array arr[] consisting only of 0s and 1s. Determine the minimum number of swaps required to group all the 1s together in a contiguous subarray.

A swap operation allows you to choose any two indices i and j and exchange their values (i.e., swap(arr[i], arr[j])).

If the array contains no 1s, return -1.

Examples:

Input: arr[] = [1, 0, 1, 0, 1]
Output: 1
Explanation: Only 1 swap is required to group all 1's together. Swapping index 1 and 4 will give arr[] = [1, 1, 1, 0, 0].

Input: arr[] = [1, 0, 1, 0, 1, 1] 
Output: 1
Explanation: Only 1 swap is required to group all 1's together. Swapping index 0 and 3 will give arr[] = [0, 0, 1, 1, 1, 1].
Input: arr[] = [0, 0, 0]
Output: -1
Explanation: No 1s are present in the array, so return -1.

Constraints:
1 ≤ arr.size() ≤ 106
0 ≤ arr[i] ≤ 1

---

## Language

java

---

Powered by SyncLeetX ⚡
