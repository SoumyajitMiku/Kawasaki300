package com.interviewQuestions;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class SumOfNumberConsistPrimeNumber {

	public static void main(String[] args) {

		int n = 30;

		ArrayList al = new ArrayList();
		LinkedHashSet ls = new LinkedHashSet();

		for (int i = 1; i <= n; i++) {
			int count = 0;

			for (int j = 1; j <= i; j++) {

				if (i % j == 0) {
					count++;
				}

			}

			if (count == 2) {
				al.add(i);
			}
		}

		// System.out.println(al);

		for (int i = 0; i < al.size(); i++) {

			for (int j = 0; j < al.size(); j++) {

				if (i != j) {

					String s1 = al.get(i).toString();
					int n1 = Integer.parseInt(s1);
					String s2 = al.get(j).toString();
					int n2 = Integer.parseInt(s2);

					if (n1 + n2 == 30) {

						// System.out.println(n1 + " " + n2);
						ls.add(n1);
						ls.add(n2);

					}

				}

			}

		}

		System.out.println(ls);

	}

}
