package ujianLogic;

import java.util.Scanner;

public class Soal07 {
	public int n;
	public String[][] kerangka;

	public void nilaiN() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Masukkan nilai n : ");
		this.n = scanner.nextInt();
		System.out.println("Nilai n adalah : " + n);
		scanner.close();

	}

	public void arrKerangka() {
		this.kerangka = new String[n][n];
		for (int i = 0; i < kerangka.length; i++) {
			polaKotak(i);
		}
	}

	public void buatPola() {
		nilaiN();
		if (n % 2 == 0) {
			System.out.println("n harus ganjil");
		}else {
			arrKerangka();
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (kerangka[i][j] != null) {
						System.out.printf("%3s", kerangka[i][j]);
					} else {
						System.out.printf("%3s", " ");
					}
				}
				System.out.println();
			}
		}
		
	}

	public void polaKotak(int perulanganKe) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i <= n / 2) {
					if (j <= n / 2) {
						if (i + j >= n / 2) {
							kerangka[i][j] = "*";
						} else {
							kerangka[i][j] = " ";
						}
					} else {
						if (j - i <= n / 2) {
							kerangka[i][j] = "*";
						} else {
							kerangka[i][j] = " ";
						}
					}
				} else {
					if (j <= n / 2) {
						if (i - j <= n / 2) {
							kerangka[i][j] = "*";
						} else {
							kerangka[i][j] = " ";
						}
					} else {
						if (i + j < n + n / 2) {
							kerangka[i][j] = "*";
						} else {
							kerangka[i][j] = " ";
						}
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Soal07 ambil = new Soal07();
		ambil.buatPola();
	}

}
