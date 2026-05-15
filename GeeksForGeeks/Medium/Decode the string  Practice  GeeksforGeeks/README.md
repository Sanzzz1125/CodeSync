# Decode the string | Practice | GeeksforGeeks

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

---

## Topics

- Recursion
- Stack
- Backtracking
- Data Structures
- Algorithms

---

## Problem Link

https://www.geeksforgeeks.org/problems/decode-the-string2444/1

---

## Problem Statement

Given an encoded string s, decode it by expanding the pattern k[substring], where the substring inside brackets is written k times. k is guaranteed to be a positive integer, and encodedString contains only lowercase english alphabets. Return the final decoded string.

Note: The test cases are generated so that the length of the output string will never exceed 105 .

Examples:

Input: s = "3[b2[ca]]"
Output: "bcacabcacabcaca"
Explanation:
Inner substring “2[ca]” breakdown into “caca”.
Now, new string becomes “3[bcaca]”
Similarly “3[bcaca]” becomes “bcacabcacabcaca” which is final result.

Input: s = "3[ab]"
Output: "ababab"
Explanation: The substring "ab" is repeated 3 times giving "ababab".

Constraints:
1 ≤ |s| ≤ 105 
1 ≤ k ≤ 100

---

## Language

java

---

Powered by SyncLeetX ⚡
