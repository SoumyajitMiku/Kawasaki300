package com.interviewQuestions;

public class SortingZeroInAnArray {

	public static void main(String[] args) {

		int[] arr = { 0, 2, 0, 7, 0, 0, 4, 0, 3, 8, 0 };

		int[] res = new int[arr.length];

		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 0) {
				count++;
			}

		}
		int k = 0;

		for (int i = 0; i < res.length; i++) {

			if (arr[i] == 0) {
				res[k++] = 0;

			} else {
				res[count++] = arr[i];
			}

		}

		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]);
		}

	}

}
