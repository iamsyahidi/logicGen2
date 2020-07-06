package hari5;

import hari3.Logic3Soal3;

public class Logic3Soal7 {

	public void buatPola() {
		Logic3Soal3 ambil = new Logic3Soal3();
		int n = ambil.nilaiN();
		int[] deret = ambil.fibMirror(n);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j || i + j == n - 1) {
					System.out.printf("%3d", deret[i]);
				} else if (i + j < n - 1 && j > i) {
					System.out.printf("%3d", deret[i]);
				} else if (i + j > n - 1 && j > i) {
					System.out.printf("%3d", deret[j]);
				} else if (i + j < n - 1 && j < i) {
					System.out.printf("%3d", deret[j]);
				} else {
					System.out.printf("%3d", deret[i]);
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logic3Soal7 cetak = new Logic3Soal7();
		cetak.buatPola();
	}

}
