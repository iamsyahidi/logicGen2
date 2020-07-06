package hari5;

import java.util.Scanner;

public class Kuis01 {
	public int n1;
	public int n2;
	public String[][] kerangka;

	public void nilaiN() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Masukkan nilai n1 : ");
		this.n1 = scanner.nextInt();
		System.out.println("Masukkan nilai n2 : ");
		this.n2 = scanner.nextInt();
		System.out.println("Nilai n1 dan n2 adalah : " + n1 + " dan " + n2);
		scanner.close();
	}

	public void kerangkaArr() {
		this.kerangka = new String[n1][n1*n2];
		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < n1*n2; j++) {
				if (j % n1 <= i) {
					kerangka[i][j] = "*";
				} else {
					kerangka[i][j] = " ";
				}
			}
		}
	}

	public void buatPola() {
		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < (n1 * n2); j++) {
				System.out.printf("%3s", kerangka[i][j]);
			}
			System.out.println();
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kuis01 ambil = new Kuis01();
		ambil.nilaiN();
		ambil.kerangkaArr();
		ambil.buatPola();
	}

}
