package hari6;

import java.util.Scanner;

public class Logic7Soal07 {

	public int n;
	public int panjang;
	public String[][] arrKerangka;

	public void nilaiN() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Masukkan nilai n : ");
		this.n = scanner.nextInt();
		System.out.println("Nilai n adalah : " + n);
		scanner.close();
	}

	public void kerangka() {
		this.panjang = n * (n + 1) - 1;
		this.arrKerangka = new String[n][panjang];
		for (int i = 0; i < n; i++) {
			polaKotak(i);
		}
	}

	public void buatPola() {
		nilaiN();
		kerangka();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < panjang; j++) {
				if (arrKerangka[i][j] != null) {
					System.out.printf("%3s", arrKerangka[i][j]);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public void polaKotak(int perulanganKe) {
		int a = 1;
		int b = 4 * (n - 1);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0) {
					arrKerangka[i][j + (perulanganKe * (n + 1))] = String.valueOf(a);
					a++;
				} else if (j == (n - 1)) {
					arrKerangka[i][j + (perulanganKe * (n + 1))] = String.valueOf(a);
					a++;
				} else if (i == (n - 1)) {
					arrKerangka[i][j + (perulanganKe * (n + 1))] = String.valueOf(b);
					b--;
				} else if (j == 0) {
					arrKerangka[i][j + (perulanganKe * (n + 1))] = String.valueOf(b);
					b--;
				} else
					arrKerangka[i][j + (perulanganKe * (n + 1))] = " ";
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logic7Soal07 ambil = new Logic7Soal07();
		ambil.buatPola();
	}

}
