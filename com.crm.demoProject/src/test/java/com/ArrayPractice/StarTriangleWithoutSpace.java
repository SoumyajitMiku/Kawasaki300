package com.ArrayPractice;

public class StarTriangleWithoutSpace {
	public static void main(String[] args) {

		int rowCount = 5;

		for (int i = 0; i < rowCount; i++) {
			for (int j = i; j < rowCount; j++) {
				System.out.print("  ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}

			for (int l = 0; l < i; l++) {
				System.out.print("* ");
			}
			
			System.out.println();

		}
	}

}
