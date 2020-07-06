package hari3;

import java.util.Scanner;

public class Logic3Soal3 {
	
	public int nilaiN() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan nilai N : ");
		int n = scanner.nextInt();
		System.out.println("Nilai N adalah : " + n);
		scanner.close();
		return n;
	}

	public int[] fibMirror(int n) {
		int[] deret = new int[n];
		deret[0] = 1;
		deret[1] = 1;
		for (int i = 2; i < n; i++) {
			if (i <= n / 2) {
				deret[i] = deret[i - 1] + deret[i - 2];
			} else {
				deret[i] = deret[n - i - 1];
			}
		}
		return deret;
	}
	
	public void buatPola() {
		Logic3Soal3 ambil = new Logic3Soal3();
		int n = ambil.nilaiN();
		int[] seri = ambil.fibMirror(n);
		for (int i = 0; i < n; i++) {
			System.out.printf("%3d", seri[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// tampilin pola
		Logic3Soal3 cetak = new Logic3Soal3();
		cetak.buatPola();;
	}

}
