package com.sendtomoon.data;

public class AparseArr {

	public static void main(String[] args) {
		AparseArr aa = new AparseArr();
		aa.service();
	}

	public void service() {
		int[][] origin = new int[11][12];
		origin[1][2] = 1;
		origin[2][3] = 2;
		for (int[] row : origin) {
			for (int data : row) {
				System.out.printf("%d\t", data);
			}
			System.out.println();
		}

	}
}
