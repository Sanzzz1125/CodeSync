# Smallest window containing all characters | Practice | GeeksforGeeks

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

---

## Topics

- sliding-window
- Hash
- Strings
- Dynamic Programming
- Binary Search

---

## Problem Link

https://www.geeksforgeeks.org/problems/smallest-window-in-a-string-containing-all-the-characters-of-another-string-1587115621/1

---

## Problem Statement

Given two strings s and p. Find the smallest substring in s consisting of all the characters (including duplicates) of the string p. Return empty string in case no such substring is present.
If there are multiple such substring of the same length found, return the one with the least starting index.

Examples:

Input: s = "timetopractice", p = "toc"
Output: "toprac"
Explanation: "toprac" is the smallest substring in which "toc" can be found.

Input: s = "zoomlazapzo", p = "oza"
Output: "apzo"
Explanation: "apzo" is the smallest substring in which "oza" can be found.

Input: s = "zoom", p = "zooe"
Output: ""
Explanation: No substring is present containing all characters of p.

Constraints: 
1 ≤ s.length(), p.length() ≤ 106
s, p consists of lowercase english letters

---

## Language

java

---

Powered by SyncLeetX ⚡
