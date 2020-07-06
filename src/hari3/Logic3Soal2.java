package hari3;

import java.util.Scanner;

public class Logic3Soal2 {

	public int ambilNilai() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Masukkan nilai N : ");
		int n = scanner.nextInt();
		System.out.println("Nilai N yang dimasukkan adalah : " + n);
		scanner.close();
		return n;
	}

	public int[] deretTrib(int n) {
		int seri[] = new int[n];
		seri[0] = 1;
		seri[1] = 1;
		seri[2] = 1;
		for (int i = 3; i < n; i++) {
			seri[i] = seri[i - 1] + seri[i - 2]+seri[i-3];
		}
		return seri;
	}
	
	public void buatPola() {
		int N = ambilNilai();
		int [] deret = deretTrib(N);
		for (int i = 0; i < N; i++) {
			System.out.printf("%3d", deret[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// panggil buatPola
		Logic3Soal2 cetak = new Logic3Soal2();
		cetak.buatPola();
	}

}
