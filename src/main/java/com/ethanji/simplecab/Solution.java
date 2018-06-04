package com.ethanji.simplecab;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) {
		// Solution ss = new Solution();
		// Solution.findNumber(arr, k)
		// Solution.oddNumbers(2, 5);
		 Solution.braces(new String[] {"{}",""});
//		System.out.println(Solution.compute("djksHDKJADHKJsjaThtsdjkahskdjh"));
		String aa = "";
		System.out.println(aa.equals(""));
	}

	static String findNumber(int[] arr, int k) {
		/*
		 * Write your code here.
		 */

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == k) {
				return "YES";
			}
		}
		return "NO";
	}

	static int[] oddNumbers(int l, int r) {
		/*
		 * Write your code here.
		 */
		int[] result = new int[r - l + 1];
		int count = 0;
		for (int i = l; i <= r; i++) {
			if ((i & 1) == 1) {
				result[count++] = i;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	static String winner(int[] andrea, int[] maria, String s) {
		int mariaScore = 0;
		int andreaScore = 0;
		if (s.equalsIgnoreCase("even")) {
			for (int i = 0; i < maria.length; i++) {
				if ((i & 1) == 0) {
					mariaScore += maria[i];
				}
			}
			for (int i = 0; i < andrea.length; i++) {
				if ((i & 1) == 0) {
					andreaScore += andrea[i];
				}
			}
		} else if (s.equalsIgnoreCase("odd")) {
			for (int i = 0; i < maria.length; i++) {
				if ((i & 1) == 1) {
					mariaScore += maria[i];
				}
			}
			for (int i = 0; i < andrea.length; i++) {
				if ((i & 1) == 1) {
					andreaScore += andrea[i];
				}
			}
		}
		String result = "Tie";
		if (mariaScore != andreaScore) {
			return result;
		}
		return mariaScore < andreaScore ? "Andrea" : "Maria";
	}

	static String[] braces(String[] values) {
		String[] result = new String[values.length];
		int count = 0;
		for (String value : values) {
			Stack<Character> stack = new Stack<Character>();

			if (value == "" || value.charAt(0) == '}' || value.charAt(0) == ')'
					|| value.charAt(0) == ']') {
				result[count++] = "NO";
				continue;
			}
			char c;
			int i = 0;
			for (; i < value.length(); i++) {
				c = value.charAt(i);
				if (c == '[' || c == '(' || c == '{') {
					stack.push(c);
				} else if (c == ']') {
					if (stack.isEmpty() || stack.pop() != '[') {
						result[count++] = "NO";
						break;
					}
				} else if (c == ')') {
					if (stack.isEmpty() || stack.pop() != '(') {
						result[count++] = "NO";
						break;
					}
				} else if (c == '}') {
					if (stack.isEmpty() || stack.pop() != '{') {
						result[count++] = "NO";
						break;
					}
				}
			}
			
			if (i == value.length()){
				if(stack.isEmpty()){
					result[count++] = "YES";
				} else {
					result[count++] = "NO";
				}
			}
		}
		return result;
	}

	// Complete the compute function below.
	static String compute(String s) {

		String[] result = new String[s.length()];
		for (int i = 0; i < s.length(); i++)
			result[i] = s.substring(i);
		Arrays.sort(result);
		return result[result.length-1];
	}
}
