package hari3;

import java.util.Scanner;

public class Logic3Soal1 {

	public int nilaiN() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Masukkan nilai N : ");
		int n = scanner.nextInt();
		System.out.println("Nilai N yang dimasukkan adalah : " + n);
		scanner.close();
		return n;
	}

	public int[] deretFib(int n) {
		int seri[] = new int[n];
		seri[0] = 1;
		seri[1] = 1;
		for (int i = 2; i < n; i++) {
			seri[i] = seri[i - 1] + seri[i - 2];
		}
		return seri;
	}

	public void buatPola() {
		int N = nilaiN();
		int[] deret = deretFib(N);
		for (int i = 0; i < N; i++) {
			System.out.printf("%3d", deret[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// tampilkan pola
		Logic3Soal1 cetak = new Logic3Soal1();
		cetak.buatPola();
	}

}
