/**
 * LeetCode Problem: Reverse String
 * Link: https://leetcode.com/problems/reverse-string/
 * Difficulty: Easy
 *
 * Backend Connection:
 * String and character-array transformations appear in API payload cleanup,
 * log formatting, token processing, and simple data normalization. The same
 * two-pointer idea is also useful when checking or transforming data without
 * allocating unnecessary extra memory.
 *
 * Approach:
 * Use two pointers: one at the beginning and one at the end. Swap the
 * characters, then move both pointers toward the center until they meet.
 *
 * Visualization:
 * ['h','e','l','l','o']
 *   L               R   swap h and o
 * ['o','e','l','l','h']
 *       L       R       swap e and l
 * ['o','l','l','e','h']
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class ReverseString {

    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    private static void runTest(String testName, char[] input, String expected) {
        ReverseString solution = new ReverseString();
        solution.reverseString(input);

        String actual = String.valueOf(input);
        if (!actual.equals(expected)) {
            throw new AssertionError(
                    testName + " failed. Expected: " + expected + ", Actual: " + actual
            );
        }

        System.out.println(testName + " passed: " + actual);
    }

    public static void main(String[] args) {
        runTest("Regular string", new char[]{'h', 'e', 'l', 'l', 'o'}, "olleh");
        runTest("Even length string", new char[]{'J', 'a', 'v', 'a'}, "avaJ");
        runTest("Single character", new char[]{'a'}, "a");
        runTest("Empty array", new char[]{}, "");
    }
}
