# 🔥 Daily DSA Workflow & Git Push Strategy

> **Goal:** Solve LeetCode problems systematically, push solutions to GitHub with meaningful commits, and build a portfolio of backend-relevant DSA patterns.

---

## ⏱️ Daily 90-Minute Workflow

### **Time Allocation**

```
┌────────────────────────────────────────────────┐
│ 15 mins: Problem Selection & Understanding     │
│ • Pick 1 Easy problem from the roadmap         │
│ • Read problem statement carefully             │
│ • Understand the backend connection            │
└────────────────────────────────────────────────┘
                       ↓
┌────────────────────────────────────────────────┐
│ 10 mins: Algorithm Design (Paper/Excalidraw)   │
│ • Draw the data structure visualization        │
│ • Trace through the algorithm by hand          │
│ • Identify edge cases                          │
└────────────────────────────────────────────────┘
                       ↓
┌────────────────────────────────────────────────┐
│ 30 mins: Coding Implementation                 │
│ • Write clean, readable code                   │
│ • Add meaningful variable names                │
│ • Include time/space complexity comments       │
└────────────────────────────────────────────────┘
                       ↓
┌────────────────────────────────────────────────┐
│ 20 mins: Testing & Debugging                   │
│ • Test with provided examples                  │
│ • Test with edge cases                         │
│ • Use debugger to trace execution              │
│ • Verify time/space complexity                 │
└────────────────────────────────────────────────┘
                       ↓
┌────────────────────────────────────────────────┐
│ 10 mins: Code Review & Optimization            │
│ • Check for code smell                         │
│ • Refactor if needed                           │
│ • Add comments for complex logic               │
└────────────────────────────────────────────────┘
                       ↓
┌────────────────────────────────────────────────┐
│ 5 mins: Git Commit & Push                      │
│ • Stage changes: git add                       │
│ • Commit with meaningful message               │
│ • Push to GitHub                               │
└────────────────────────────────────────────────┘
```

---

## 🎯 Daily Target

```
✅ 2 Easy Problems   → Build confidence, understand patterns
✅ 1 Medium Problem  → Strengthen algorithmic thinking
⏭️ 0 Hard Problems   → Save for later phases
```

**In 30 days:** ~90 problems completed  
**In 90 days:** ~270 problems completed  
**In 180 days:** All 3 phases mastered + portfolio ready

---

## 📝 LeetCode Solution Template

Copy this template into every solution file:

```java
/**
 * LeetCode Problem: [Problem Name]
 * Link: https://leetcode.com/problems/[problem-slug]/
 * Difficulty: Easy/Medium/Hard
 * 
 * Backend Connection:
 * [Explain how this pattern applies to backend engineering]
 * 
 * Approach:
 * [Brief explanation of your algorithm]
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package com.dsa.phase1.strings_arrays;

public class ReverseString {
    
    /**
     * Reverse a string using two-pointer technique
     * 
     * @param s the character array to reverse
     */
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        
        while (left < right) {
            // Swap characters
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            
            left++;
            right--;
        }
    }
    
    /**
     * Test cases
     */
    public static void main(String[] args) {
        ReverseString solution = new ReverseString();
        
        // Test case 1: Regular string
        char[] test1 = {'h', 'e', 'l', 'l', 'o'};
        solution.reverseString(test1);
        System.out.println("Test 1: " + String.valueOf(test1)); // Expected: "olleh"
        
        // Test case 2: Single character
        char[] test2 = {'a'};
        solution.reverseString(test2);
        System.out.println("Test 2: " + String.valueOf(test2)); // Expected: "a"
        
        // Test case 3: Empty array
        char[] test3 = {};
        solution.reverseString(test3);
        System.out.println("Test 3: " + String.valueOf(test3)); // Expected: ""
    }
}
```

---

## 🗂️ Repository Structure Setup

### **Create This Folder Structure:**

```bash
# Navigate to your repo
cd java-backend-journey

# Create DSA folders
mkdir -p leetcode-solutions/phase1-logic-foundations/{strings-arrays,hashmap-thinking,stack-queue,sliding-window}
mkdir -p leetcode-solutions/phase2-data-structures/{linked-lists,trees-graphs,dynamic-programming}
mkdir -p leetcode-solutions/phase3-backend-patterns

# Create a README for each phase (optional but recommended)
touch leetcode-solutions/README.md
touch leetcode-solutions/phase1-logic-foundations/README.md
```

---

## 🔄 Git Workflow for Each Problem

### **Step 1: Create a Feature Branch**

```bash
# Navigate to repo
cd java-backend-journey

# Create a branch for this DSA phase
git checkout -b dsa/phase1-logic-foundations

# Or if solving multiple problems in one branch
git branch -a  # View existing branches
```

### **Step 2: Create Your Solution File**

```bash
# Navigate to the appropriate phase folder
cd leetcode-solutions/phase1-logic-foundations/strings-arrays

# Create your Java file
touch ReverseString.java

# Open in your IDE (IntelliJ IDEA)
# File → New → Java Class
```

### **Step 3: Write Your Solution**

Use the template above to write your solution with:
- ✅ Problem link
- ✅ Backend connection
- ✅ Clear algorithm explanation
- ✅ Time/space complexity
- ✅ Test cases in main()

### **Step 4: Test Locally**

```bash
# Run your solution
cd leetcode-solutions/phase1-logic-foundations/strings-arrays
javac ReverseString.java
java ReverseString
```

### **Step 5: Git Add & Commit**

```bash
# Stage the file
git add leetcode-solutions/phase1-logic-foundations/strings-arrays/ReverseString.java

# Commit with a detailed message (following this format)
git commit -m "solve: LeetCode #344 - Reverse String (Easy)

Problem: https://leetcode.com/problems/reverse-string/
Difficulty: Easy
Approach: Two-pointer technique

Algorithm:
- Use left and right pointers starting from both ends
- Swap characters while left < right
- Time: O(n), Space: O(1) [excluding output]

Backend Connection:
- String manipulation is common in API responses
- Used for reversing logs, payment confirmations
- Foundation for understanding character encoding in REST APIs

Test Cases:
✓ Regular string: ['h','e','l','l','o'] → ['o','l','l','e','h']
✓ Single character: ['a'] → ['a']
✓ Empty: [] → []
"
```

### **Step 6: Push to GitHub**

```bash
# Push to your feature branch
git push origin dsa/phase1-logic-foundations

# Or if tracking the branch for the first time
git push -u origin dsa/phase1-logic-foundations
```

### **Step 7: Optional - Create Pull Request (After Phase Complete)**

```bash
# After completing all problems in Phase 1, create a PR
# Go to GitHub → "Pull Requests" → "New Pull Request"
# Select: dsa/phase1-logic-foundations → main
# Add summary of problems solved in this phase
```

### **Step 8: Merge to Main**

```bash
# After PR review (or self-review), merge to main
git checkout master
git pull origin master
git merge dsa/phase1-logic-foundations
git push origin master
```

---

## 📋 Commit Message Format

Every commit should follow this format:

```
solve: LeetCode #[NUMBER] - [Problem Name] ([Difficulty])

Problem: [LeetCode Link]
Difficulty: Easy/Medium/Hard
Approach: [One-line algorithm summary]

Algorithm:
[2-3 lines explaining your approach]

Time Complexity: O(?)
Space Complexity: O(?)

Backend Connection:
[How this pattern applies to backend engineering]

Test Cases:
✓ Test case 1
✓ Test case 2
✓ Edge cases
```

### **Example:**

```
solve: LeetCode #1 - Two Sum (Easy)

Problem: https://leetcode.com/problems/two-sum/
Difficulty: Easy
Approach: HashMap for O(n) solution

Algorithm:
- Create a HashMap to store (value, index) pairs
- For each number, check if complement exists in map
- If yes, return indices; if no, add to map and continue

Time Complexity: O(n)
Space Complexity: O(n)

Backend Connection:
- HashMap lookups are fundamental to caching systems
- Used in session management: find duplicate users, detect fraud
- Payment systems: match transactions with receipts

Test Cases:
✓ nums = [2,7,11,15], target = 9 → [0,1]
✓ nums = [3,2,4], target = 6 → [1,2]
✓ nums with negative numbers handled correctly
```

---

## 📊 Weekly Routine

### **Monday - Friday (Each Day)**
```
Morning Session (90 mins):
  • 1 Easy problem (Strings/Arrays or HashMap)
  • Create feature branch, code, commit, push

Evening Session (60 mins - Optional):
  • 1 Easy problem (Stack/Queue or Sliding Window)
  • Code, test, commit, push
```

### **Saturday**
```
Review & Practice (2-3 hours):
  • Solve 1 Medium problem
  • Deep dive into algorithm complexity
  • Write detailed blog post or notes
```

### **Sunday**
```
Rest & Reflection:
  • Review the week's solutions
  • Update progress tracker
  • Plan next week's focus area
  • Update documentation
```

---

## 🎯 Branch Strategy

### **Multiple Phase Approach (Recommended)**

```bash
# Main branch - always stable
master (main)

# Feature branches for each phase
├── dsa/phase1-logic-foundations
│   ├── commits for problems 1-20
│   └── PR when phase complete
├── dsa/phase2-data-structures
│   └── commits for problems 21-40
└── dsa/phase3-backend-patterns
    └── commits for problems 41-50
```

### **Single Continuous Branch (Alternative)**

```bash
# Single DSA branch for all problems
master (main)
└── dsa/leetcode-solutions
    └── All problems committed here
    └── Merge to main weekly
```

---

## 📈 Progress Tracking

### **GitHub Insights to Monitor**

1. **Commit Frequency** - Track consistency (aim for daily commits)
2. **Pull Requests** - One PR per phase
3. **Repository Insights** - View commit history, contributors

### **Update README After Each Phase**

```markdown
## ✅ Progress

- [x] Phase 1: Logic Foundations (20 problems) - Completed: [Date]
- [ ] Phase 2: Data Structures (17 problems) - In Progress
- [ ] Phase 3: Backend Patterns (5 problems) - Not Started

**Total Problems Solved:** 20/42
**Last Updated:** [Date]
```

---

## 🚀 Quick Reference Commands

```bash
# Clone repo
git clone https://github.com/dayacode12/java-backend-journey.git
cd java-backend-journey

# Create feature branch
git checkout -b dsa/phase1-logic-foundations

# View branch
git branch -a

# Add file
git add leetcode-solutions/phase1-logic-foundations/strings-arrays/ReverseString.java

# Commit with message
git commit -m "solve: LeetCode #344 - Reverse String (Easy) ..."

# Push to remote
git push origin dsa/phase1-logic-foundations

# Switch branches
git checkout master
git checkout dsa/phase1-logic-foundations

# View commit history
git log --oneline

# View changes
git diff

# Undo last commit (if needed)
git reset --soft HEAD~1
```

---

## ✅ Checklist Before Pushing

Before every `git push`, verify:

- [ ] Code compiles without errors (`javac *.java`)
- [ ] All test cases pass (run `main()` method)
- [ ] Edge cases handled (empty input, single element, etc.)
- [ ] Comments are clear and concise
- [ ] Time and space complexity documented
- [ ] Backend connection explained
- [ ] Commit message follows format
- [ ] No debugging print statements left
- [ ] File is in correct folder structure
- [ ] GitHub username configured (`git config --list`)

---

## 🎓 Learning Tips While Solving

1. **Understand Before Coding** - Draw the algorithm first
2. **Use Java Visualizer** - Paste code to see execution flow: https://pythontutor.com/java.html
3. **Debug Manually** - Trace through test cases by hand
4. **Add Comments** - Explain "why" not just "what"
5. **Compare Approaches** - After solving, check 2-3 other approaches
6. **Analyze Complexity** - Always calculate O(n) and O(space)
7. **Connect to Backend** - Think of real-world usage

---

## 🔗 Resources

- **LeetCode:** https://leetcode.com/
- **Java Visualizer:** https://pythontutor.com/java.html
- **System Design:** https://excalidraw.com/
- **Algorithm Animations:** https://see-algorithms.com/
- **Git Docs:** https://git-scm.com/doc
- **IntelliJ IDEA:** https://www.jetbrains.com/idea/download/

---

## 📌 Next Steps

1. ✅ Read through `docs/dsa-roadmap.md` for problem list
2. ✅ Set up your local environment (clone repo, open in IDE)
3. ✅ Create the folder structure as shown above
4. ✅ Pick the first problem: **[Reverse String](https://leetcode.com/problems/reverse-string/)**
5. ✅ Use this workflow template and start coding!
6. ✅ Commit and push your first solution
7. ✅ Repeat daily for 90 days 🚀
