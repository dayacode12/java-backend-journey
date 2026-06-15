# 🧠 Backend Developer DSA Roadmap

> **Strategy:** Build strong fundamentals before diving into complex problems. Every LeetCode problem connects to a real backend engineering scenario.

---

## 📋 Phase 1: Logic Foundations (Weeks 1-2)

### **1.1 Strings & Arrays** (Backend Connection: Data Validation & API Payloads)

| Problem | Difficulty | Link | Backend Connection |
|---------|-----------|------|-------------------|
| Reverse String | Easy | https://leetcode.com/problems/reverse-string/ | String manipulation in API responses |
| Valid Palindrome | Easy | https://leetcode.com/problems/valid-palindrome/ | Input validation for user data |
| Two Sum | Easy | https://leetcode.com/problems/two-sum/ | Detecting complementary data pairs (caching patterns) |
| Contains Duplicate | Easy | https://leetcode.com/problems/contains-duplicate/ | Data deduplication in databases |
| Best Time to Buy and Sell Stock | Easy | https://leetcode.com/problems/best-time-to-buy-and-sell-stock/ | Time-series data analysis |
| Remove Duplicates from Sorted Array | Easy | https://leetcode.com/problems/remove-duplicates-from-sorted-array/ | Array cleanup in ETL pipelines |
| Majority Element | Easy | https://leetcode.com/problems/majority-element/ | Finding dominant records in analytics |

### **1.2 HashMap Thinking ⭐ (Backend Connection: Caching & Session Management)**

| Problem | Difficulty | Link | Backend Connection |
|---------|-----------|------|-------------------|
| Valid Anagram | Easy | https://leetcode.com/problems/valid-anagram/ | Token/string frequency in authentication |
| First Unique Character in a String | Easy | https://leetcode.com/problems/first-unique-character-in-a-string/ | Event deduplication in event systems |
| Group Anagrams | Medium | https://leetcode.com/problems/group-anagrams/ | Grouping API results & clustering |
| Top K Frequent Elements | Medium | https://leetcode.com/problems/top-k-frequent-elements/ | Ranking trending content, cache hit analysis |
| Majority Element II | Medium | https://leetcode.com/problems/majority-element-ii/ | Identifying high-frequency data |

### **1.3 Stack & Queue** (Backend Connection: Async Processing & Job Queues)

| Problem | Difficulty | Link | Backend Connection |
|---------|-----------|------|-------------------|
| Valid Parentheses | Easy | https://leetcode.com/problems/valid-parentheses/ | JSON/XML parsing in APIs |
| Min Stack | Easy | https://leetcode.com/problems/min-stack/ | Cache eviction policies (LRU, LFU) |
| Implement Queue using Stacks | Easy | https://leetcode.com/problems/implement-queue-using-stacks/ | Task queue design & job processing |
| Daily Temperatures | Medium | https://leetcode.com/problems/daily-temperatures/ | Time-based event correlation |

### **1.4 Sliding Window** (Backend Connection: Rate Limiting & Metrics)

| Problem | Difficulty | Link | Backend Connection |
|---------|-----------|------|-------------------|
| Longest Substring Without Repeating Characters | Medium | https://leetcode.com/problems/longest-substring-without-repeating-characters/ | Session token uniqueness |
| Maximum Average Subarray I | Easy | https://leetcode.com/problems/maximum-average-subarray-i/ | Metric aggregation (SLA calculations) |
| Sliding Window Maximum | Hard | https://leetcode.com/problems/sliding-window-maximum/ | Real-time data windowing |

---

## 📋 Phase 2: Data Structures Mastery (Weeks 3-6)

### **2.1 Linked Lists** (Backend Connection: Event Streams & Memory Efficiency)

| Problem | Difficulty | Link | Backend Connection |
|---------|-----------|------|-------------------|
| Merge Two Sorted Lists | Easy | https://leetcode.com/problems/merge-two-sorted-lists/ | Merging API result streams |
| Reverse Linked List | Easy | https://leetcode.com/problems/reverse-linked-list/ | Reversing transaction history |
| Linked List Cycle | Easy | https://leetcode.com/problems/linked-list-cycle/ | Detecting circular dependencies |
| Add Two Numbers | Medium | https://leetcode.com/problems/add-two-numbers/ | Complex data aggregation |
| Remove Nth Node From End of List | Medium | https://leetcode.com/problems/remove-nth-node-from-end-of-list/ | Pagination & record removal |

### **2.2 Trees & Graphs** (Backend Connection: Hierarchies & Relationships)

| Problem | Difficulty | Link | Backend Connection |
|---------|-----------|------|-------------------|
| Binary Tree Inorder Traversal | Easy | https://leetcode.com/problems/binary-tree-inorder-traversal/ | Permission hierarchy navigation |
| Maximum Depth of Binary Tree | Easy | https://leetcode.com/problems/maximum-depth-of-binary-tree/ | Organizational structure depth |
| Same Tree | Easy | https://leetcode.com/problems/same-tree/ | Configuration validation |
| Lowest Common Ancestor of a BST | Medium | https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/ | Finding common access points |
| Number of Islands | Medium | https://leetcode.com/problems/number-of-islands/ | Clustering connected components |
| Course Schedule | Medium | https://leetcode.com/problems/course-schedule/ | Dependency resolution & DAG validation |
| Word Ladder | Medium | https://leetcode.com/problems/word-ladder/ | Recommendation engine paths |

### **2.3 Dynamic Programming** (Backend Connection: Optimization & Caching)

| Problem | Difficulty | Link | Backend Connection |
|---------|-----------|------|-------------------|
| Climbing Stairs | Easy | https://leetcode.com/problems/climbing-stairs/ | Memoization basics |
| House Robber | Medium | https://leetcode.com/problems/house-robber/ | Optimal selection logic |
| Coin Change | Medium | https://leetcode.com/problems/coin-change/ | Resource allocation algorithms |
| Edit Distance | Medium | https://leetcode.com/problems/edit-distance/ | String similarity & autocorrect |
| Longest Increasing Subsequence | Medium | https://leetcode.com/problems/longest-increasing-subsequence/ | Time-series trend analysis |

---

## 📋 Phase 3: Backend-Specific Patterns (Weeks 7-8)

| Problem | Difficulty | Link | Backend Connection |
|---------|-----------|------|-------------------|
| LRU Cache | Medium | https://leetcode.com/problems/lru-cache/ | ⭐ **Critical**: Cache implementation for session storage |
| Implement Trie (Prefix Tree) | Medium | https://leetcode.com/problems/implement-trie-prefix-tree/ | Autocomplete & typeahead APIs |
| Merge k Sorted Lists | Hard | https://leetcode.com/problems/merge-k-sorted-lists/ | Data aggregation from multiple sources |
| Trapping Rain Water | Hard | https://leetcode.com/problems/trapping-rain-water/ | Complex spatial data algorithms |
| Serialize and Deserialize Binary Tree | Hard | https://leetcode.com/problems/serialize-and-deserialize-binary-tree/ | JSON serialization in REST APIs |

---

## 🎯 How to Use This Roadmap

### Daily Target
```
2 Easy Problems   → Build confidence, understand patterns
1 Medium Problem  → Strengthen algorithmic thinking
0 Hard Problems   → Move to hard only after mastering medium
```

### Philosophy: Connect to Backend
Every problem should connect to a real backend scenario:

```
HashMap      → User login systems, session caches
Queue        → Job processing, email notifications
Sliding Window → API rate limiting, metrics aggregation
Stack        → Parser design, undo/redo functionality
Trees        → Permission hierarchies, organizational structures
Graphs       → Recommendation engines, social networks
```

---

## ✅ Progress Tracking

Use the checkboxes below to mark your progress:

### Phase 1: Logic Foundations
- [ ] Reverse String
- [ ] Valid Palindrome
- [ ] Two Sum
- [ ] Contains Duplicate
- [ ] Best Time to Buy and Sell Stock
- [ ] Remove Duplicates from Sorted Array
- [ ] Majority Element
- [ ] Valid Anagram
- [ ] First Unique Character in a String
- [ ] Group Anagrams
- [ ] Top K Frequent Elements
- [ ] Majority Element II
- [ ] Valid Parentheses
- [ ] Min Stack
- [ ] Implement Queue using Stacks
- [ ] Daily Temperatures
- [ ] Longest Substring Without Repeating Characters
- [ ] Maximum Average Subarray I
- [ ] Sliding Window Maximum

### Phase 2: Data Structures Mastery
- [ ] Merge Two Sorted Lists
- [ ] Reverse Linked List
- [ ] Linked List Cycle
- [ ] Add Two Numbers
- [ ] Remove Nth Node From End of List
- [ ] Binary Tree Inorder Traversal
- [ ] Maximum Depth of Binary Tree
- [ ] Same Tree
- [ ] Lowest Common Ancestor of a BST
- [ ] Number of Islands
- [ ] Course Schedule
- [ ] Word Ladder
- [ ] Climbing Stairs
- [ ] House Robber
- [ ] Coin Change
- [ ] Edit Distance
- [ ] Longest Increasing Subsequence

### Phase 3: Backend-Specific Patterns
- [ ] LRU Cache
- [ ] Implement Trie (Prefix Tree)
- [ ] Merge k Sorted Lists
- [ ] Trapping Rain Water
- [ ] Serialize and Deserialize Binary Tree

---

## 📁 Repository Structure for DSA Solutions

```
leetcode-solutions/
├── phase1-logic-foundations/
│   ├── strings-arrays/
│   │   ├── ReverseString.java
│   │   ├── ValidPalindrome.java
│   │   ├── TwoSum.java
│   │   └── ContainsDuplicate.java
│   ├── hashmap-thinking/
│   │   ├── ValidAnagram.java
│   │   ├── GroupAnagrams.java
│   │   └── TopKFrequentElements.java
│   ├── stack-queue/
│   │   ├── ValidParentheses.java
│   │   ├── MinStack.java
│   │   └── ImplementQueueUsingStacks.java
│   └── sliding-window/
│       ├── LongestSubstringWithoutRepeatingCharacters.java
│       └── MaximumAverageSubarray.java
├── phase2-data-structures/
│   ├── linked-lists/
│   ├── trees-graphs/
│   └── dynamic-programming/
├── phase3-backend-patterns/
│   ├── LRUCache.java
│   ├── ImplementTrie.java
│   ├── MergeKSortedLists.java
│   └── SerializeDeserializeBinaryTree.java
└── README.md
```

---

## 🔗 Resources

- **Visualize Execution:** [Java Visualizer](https://pythontutor.com/java.html)
- **Algorithm Animation:** [See Algorithms](https://see-algorithms.com/)
- **System Design:** [Excalidraw](https://excalidraw.com/)
- **LeetCode:** [Official Link](https://leetcode.com/)
