package hari3;

import java.util.Scanner;

public class Kuis2 {

	public int nilaiN() {
		// input nilai N
		Scanner scanner = new Scanner(System.in);
		System.out.println("Masukkan nilai N : ");
		int n = scanner.nextInt();
		System.out.println("Nilai yang dimasukkan adalah : " + n);
		scanner.close();
		return n;
	}

	public void buatPola() {
		// run buat pola
		int n = nilaiN();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i % 2 == 0) {
					System.out.print("*");
				} else if (i % 4 == 1 && j == n - 1) {
					System.out.print("*");
				} else if (i % 4 == 3 && j == 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// tampilin pola
		Kuis2 cetak = new Kuis2();
		cetak.buatPola();
	}

}
