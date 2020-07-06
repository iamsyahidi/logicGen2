package hari2;

import java.util.Scanner;

public class Logic2Soal9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print(" Masukkan nilai N : ");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i < n - 1 && j <= 4) {
					System.out.printf("%2d", j * 2 + 1);
				} else if (i < n - 1 && j >= 4) {
					System.out.printf("%2d", -j*2+17);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		scanner.close();
	}

}
