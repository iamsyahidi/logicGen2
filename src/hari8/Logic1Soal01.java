package hari8;

import java.util.Scanner;

public class Logic1Soal01 {
	public int n;
	public void nilaiN() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Masukkan nilai n : ");
		this.n = scanner.nextInt();
		System.out.println("Nilai n adalah : "+n);
		scanner.close();
	}
	
	public void buatPola() {
		nilaiN();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i==j) {
					System.out.printf("%3s","*");
				}else {
					System.out.printf("%3s"," ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logic1Soal01 ambil = new Logic1Soal01();
		ambil.buatPola();
	}
}

