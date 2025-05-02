package ethan.ji.code.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromicAlgo {
    public static String makeAlphabeticallySmallestPalindrome(String input) {
        int[] freq = new int[26];
        for (char c : input.toCharArray()) {
            freq[c - 'a']++;
        }
        List<Integer> oddList = new ArrayList<Integer>();
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] % 2 != 0) {
                oddList.add(i);
            }
        }
        StringBuilder half = new StringBuilder();
        String center = "";
        int left = 0;
        int right = oddList.size() - 1;
        while (left <= right) {
            if (left == right) {
                center = String.valueOf((char) ('a' + oddList.get(left)));
            }
            freq[oddList.get(right--)]--;
            freq[oddList.get(left++)]++;
        }

        for (int i = 0; i < freq.length; i++) {
            for (int j = 0; j < freq[i] / 2; j++) {
                half.append((char) (i + 'a'));
            }
        }
        String firstHalf = half.toString();
        String secondHalf = half.reverse().toString();
        return firstHalf + center + secondHalf;
    }

    public static void main(String[] args) {
        System.out.println(makeAlphabeticallySmallestPalindrome("sssrrrwwa"));
    }
}
