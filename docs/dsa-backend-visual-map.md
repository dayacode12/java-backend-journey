# DSA to Backend Visual Study Map

This repo currently contains the backend learning roadmap, workflow docs, and Day 1 Java OOP examples. The DSA solution folders are planned but not implemented yet. Use this map as the learning companion for every problem in `docs/dsa-roadmap.md`.

## Big Picture

```text
Core Java/OOP
  -> DSA patterns
  -> Backend building blocks
  -> Spring Boot APIs, databases, caching, queues, search, distributed systems
```

```text
Arrays/Strings     -> request/response payloads, validation, logs
HashMap            -> caches, sessions, indexes, frequency counts
Stack/Queue        -> parsers, async jobs, message processing
Sliding Window     -> rate limits, rolling metrics, stream windows
Linked List        -> ordered streams, LRU internals, memory links
Trees/Graphs       -> permissions, dependencies, recommendations
Dynamic Programming-> caching sub-results, optimization engines
Trie/Serialization -> search APIs, JSON/tree transport formats
```

## Phase 1: Logic Foundations

| Problem | Pattern | Visualization | Backend Meaning |
|---|---|---|---|
| Reverse String | Two pointers | `h e l l o` -> `o l l e h`; swap `L` and `R` inward | Transform payload fields, normalize strings, log formatting |
| Valid Palindrome | Two pointers + filtering | `A man...` -> compare cleaned chars from both ends | Validate usernames, codes, normalized user input |
| Two Sum | HashMap lookup | need `target - nums[i]`; map stores seen values | Match request IDs, receipt/payment pairs, cache hits |
| Contains Duplicate | Set membership | `[1,2,3,1]`; `1` appears twice | Deduplicate DB inserts, prevent duplicate events |
| Best Time to Buy/Sell Stock | Running minimum | track lowest past price, best future profit | Time-series metrics, SLA/error-rate trend checks |
| Remove Duplicates Sorted Array | Slow/fast pointers | write unique values into front of sorted array | Cleanup sorted ETL batches or query results |
| Majority Element | Voting/counting | candidate survives pair cancellation | Find dominant status, feature flag, region, or event type |
| Valid Anagram | Frequency map | count chars in `s`, subtract chars in `t` | Compare tokens, signatures, normalized identifiers |
| First Unique Character | Frequency map + scan | count all, return first count `1` | First non-duplicate event, first unique message key |
| Group Anagrams | Canonical key | sort/count each word -> group by same key | Cluster equivalent API results or search terms |
| Top K Frequent Elements | Frequency + heap/bucket | counts -> keep largest `k` | Trending content, cache hot keys, noisy endpoints |
| Majority Element II | Boyer-Moore extended | at most two values can appear `> n/3` | Identify top high-volume tenants or event classes |
| Valid Parentheses | Stack | push opens, pop on matching closes | JSON/XML parser mental model |
| Min Stack | Stack with min history | value stack plus minimum stack | Constant-time min tracking in runtime state |
| Queue using Stacks | Two stacks | input stack -> output stack when needed | Job queue mechanics, FIFO over LIFO tools |
| Daily Temperatures | Monotonic stack | store unresolved days until warmer day appears | Event correlation: wait until threshold is crossed |
| Longest Substring Without Repeating | Sliding window + set/map | expand right, move left after duplicate | Session token uniqueness, duplicate-free windows |
| Maximum Average Subarray I | Fixed sliding window | sum first `k`, slide one item at a time | Rolling latency/SLA average over fixed windows |
| Sliding Window Maximum | Deque monotonic queue | deque keeps useful max candidates | Real-time dashboard max over stream windows |

## Phase 2: Data Structure Mastery

| Problem | Pattern | Visualization | Backend Meaning |
|---|---|---|---|
| Merge Two Sorted Lists | Two cursors | `1->3->5` + `2->4` -> sorted merge | Merge paginated or sorted API result streams |
| Reverse Linked List | Pointer rewiring | `prev <- curr`; move through chain | Reverse audit trail or transaction stream |
| Linked List Cycle | Fast/slow pointers | fast catches slow if loop exists | Detect circular dependencies or retry loops |
| Add Two Numbers | Linked list digit carry | add node digits, carry to next | Aggregation where data arrives chunk by chunk |
| Remove Nth Node From End | Two pointers gap `n` | lead pointer creates distance, follow deletes | Remove records by relative position in paginated stream |
| Binary Tree Inorder Traversal | DFS stack/recursion | left -> root -> right | Traverse sorted permissions/config trees |
| Maximum Depth of Binary Tree | DFS/BFS depth | root depth `1`, children add `1` | Measure org, menu, or category hierarchy depth |
| Same Tree | Recursive comparison | compare root, then left, then right | Validate config snapshots or schema trees |
| Lowest Common Ancestor BST | BST navigation | move left/right until split point | Find shared access scope or common parent entity |
| Number of Islands | Grid DFS/BFS | flood-fill connected `1`s | Cluster connected components: tenants, regions, segments |
| Course Schedule | Graph cycle detection | prerequisites as DAG; cycle means impossible | Service dependency ordering, migration planning |
| Word Ladder | BFS shortest path | each word is node, one-letter change is edge | Recommendation or transformation path search |
| Climbing Stairs | DP recurrence | `ways[n]=ways[n-1]+ways[n-2]` | Memoization basics for repeated subproblems |
| House Robber | DP choose/skip | `max(rob current + prev2, prev1)` | Optimal non-conflicting selection logic |
| Coin Change | DP minimum | amount states; try each coin | Resource allocation and minimum-cost composition |
| Edit Distance | 2D DP table | convert prefix of A to prefix of B | Fuzzy search, autocorrect, data reconciliation |
| Longest Increasing Subsequence | DP or binary search | maintain best tail for each length | Detect improving trends in time-series data |

## Phase 3: Backend-Specific Patterns

| Problem | Pattern | Visualization | Backend Meaning |
|---|---|---|---|
| LRU Cache | HashMap + doubly linked list | map gives node; list tracks recency | Session cache, object cache, eviction policy |
| Implement Trie | Prefix tree | root -> `c` -> `a` -> `t` | Autocomplete, route matching, prefix search |
| Merge k Sorted Lists | Min heap | heap stores current head of each list | Aggregate sorted logs/events from many sources |
| Trapping Rain Water | Two pointers or monotonic stack | water above bar depends on left/right max | Capacity modeling, boundary-based reasoning |
| Serialize/Deserialize Binary Tree | BFS/DFS encoding | tree -> string with null markers -> tree | JSON/tree transport, cache storage, API payload restore |

## How To Study Each Problem

```text
1. Name the pattern.
2. Draw the data movement.
3. Trace one normal case.
4. Trace edge cases: empty, one item, duplicates, negatives, sorted/reversed.
5. Code in Java.
6. Write time and space complexity.
7. Explain the backend connection in one paragraph.
```

## Recommended Order

```text
Week 1: Reverse String -> Valid Palindrome -> Two Sum -> Contains Duplicate
Week 2: Stock -> Remove Duplicates -> Majority Element -> Valid Anagram
Week 3: First Unique -> Group Anagrams -> Top K -> Valid Parentheses
Week 4: Min Stack -> Queue using Stacks -> Daily Temperatures -> Sliding Window basics
Week 5: Linked Lists
Week 6: Trees and Graphs
Week 7: Dynamic Programming
Week 8: LRU, Trie, Merge k Lists, Serialization
```

## Backend Mental Model

```text
Request comes in
  -> validate strings/arrays
  -> look up users/sessions in maps
  -> enqueue async work
  -> aggregate rolling metrics
  -> resolve entity relationships
  -> cache expensive results
  -> serialize response
```

DSA is not separate from backend. DSA is the small machinery inside API validation, caching, indexing, scheduling, dependency resolution, search, ranking, and serialization.
