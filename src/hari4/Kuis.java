package hari4;

import java.util.Scanner;

public class Kuis {

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

	public char[] deretAbjad(int n) {
		char[] abjad = new char[n];
		char a = 'A';
		for (int i = 0; i < n; i++) {
			abjad[i] = a++;
		}
		return abjad;
	}

	public String[] buatArray() {
		Kuis ambil = new Kuis();
		int n = ambil.nilaiN();
		int[] deretfib = deretFib(n);
		char[] deretabc = deretAbjad(n);
		String[] deretfibabc = new String[n];
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				deretfibabc[i] = String.valueOf(deretfib[i / 2]);
			} else {
				deretfibabc[i] = String.valueOf(deretabc[((i - 1) / 2)]);
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(deretfibabc[i]);
		}
		return deretfibabc;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kuis cetak = new Kuis();
		cetak.buatArray();
	}

}
