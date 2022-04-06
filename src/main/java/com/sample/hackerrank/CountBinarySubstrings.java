package com.sample.hackerrank;

public class CountBinarySubstrings {

	private CountBinarySubstrings() {}

	public static int getSubstringCount(String s) {
		int prev = 0;
		int count = 1;
		int answer = 0;

		char[] arr = s.toCharArray();

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == arr[i - 1]) {
				count++;
			} else {
				answer += Math.min(count, prev);
				prev = count;
				count = 1;
			}
		}

		answer += Math.min(count, prev);

		return answer;
	}
}
