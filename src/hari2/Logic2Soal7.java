package hari2;

import java.util.Scanner;

public class Logic2Soal7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan nilai N : ");
		System.out.println();
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					System.out.printf("%2d", i * 2 + 1);
				} else if (i + j == n - 1) {
					System.out.printf("%2d", j * 2);
				} else if (i + j >= n - 1 && j <= i) {
					System.out.printf("%2s", "B");
				} else if (i + j <= n - 1 && j >= i) {
					System.out.printf("%2s", "A");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		scanner.close();
	}

}
