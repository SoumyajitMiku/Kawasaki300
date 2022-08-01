package com.interviewQuestions;

import java.util.Arrays;

public class MultipleMissingElementsInArray {
	
	public static void main(String[] args) {
		int a[] = { 2, 7, 10 };// 4,5,7,8
		Arrays.sort(a);// 1,2,3,6,9

		for (int i = 0; i < a.length-1; i++) {
			
				while (a[i + 1] - a[i] > 1) {
					a[i]++;
					System.out.print(a[i] + " ");
				}
			
		
		}
	}

}
