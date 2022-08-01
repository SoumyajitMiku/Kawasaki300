package com.interviewQuestions;

import java.util.LinkedHashSet;

public class CommonCharInStringArray {

	public static void main(String[] args) {

		String s[] = { "abcd", "aebf", "awbt", "beza" };

		LinkedHashSet<Character> hset = new LinkedHashSet<Character>();

		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length(); j++) {
				try {
					for (int j2 = 0; j2 < s[i + 1].length(); j2++) {

						if (s[i].charAt(j) == s[i + 1].charAt(j2)) {
							hset.add(s[i].charAt(j));
							// System.out.println(s[i].charAt(j));
						}
					}
				} catch (Exception e) {

				}

			}

		}

		System.out.println(hset);

	}
}
