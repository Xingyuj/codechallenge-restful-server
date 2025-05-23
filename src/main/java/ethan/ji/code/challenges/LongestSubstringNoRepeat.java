package ethan.ji.code.challenges;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given a string s, find the length of the longest substring without duplicate characters.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abcabcbb" Output: 3 Explanation: The answer is "abc", with the length of 3. Example 2:
 *
 * Input: s = "bbbbb" Output: 1 Explanation: The answer is "b", with the length of 1. Example 3:
 *
 * Input: s = "pwwkew" Output: 3 Explanation: The answer is "wke", with the length of 3. Notice that the answer must be
 * a substring, "pwke" is a subsequence and not a substring.
 *
 *
 * Constraints:
 *
 * 0 <= s.length <= 5 * 104 s consists of English letters, digits, symbols and spaces.
 */
public class LongestSubstringNoRepeat {

    public static int findNoRepeatSubString(String input) {
        int left = 0, right = 0;
        Set<Character> subChars = new HashSet<>();
        char[] inputChars = input.toCharArray();
        int maxLength = 0;
        while (right < inputChars.length) {
            if (subChars.contains(inputChars[right])) {
                subChars.remove(inputChars[left++]);
            } else {
                subChars.add(inputChars[right++]);
                maxLength = Math.max(maxLength, subChars.size());
            }
        }
        return maxLength;
    }

    // Fast solution
    public static int lengthOfLongestUniqueSubstring(String input) {
        if (input == null || input.isEmpty()) return 0;

        boolean[] seen = new boolean[128];  // ASCII
        int left = 0, right = 0, maxLen = 0;

        while (right < input.length()) {
            char c = input.charAt(right);
            if (seen[c]) {
                seen[input.charAt(left++)] = false;
            } else {
                seen[c] = true;
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        System.out.println(findNoRepeatSubString(input));
    }
}
