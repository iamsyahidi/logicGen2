package hari6;

import java.util.Scanner;

public class Logic5Soal01 {
	public int n1;
	public int panjang;
	public String[][] arrKerangka;
	public int x;
	public int a;

	public void nilaiN() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Masukkan nilai n : ");
		this.n1 = scanner.nextInt();
		System.out.println("Nilai n adalah : " + n1);
		scanner.close();
	}
	

	public void kerangka() {
		for (int i = 0; i < n1; i++) {
			this.x += (i+1);
		}
		this.arrKerangka = new String[x][x];
		for (int i = 0; i < n1; i++) {
			polaKotak(i);
		}
	}


	public void buatPola() {
		nilaiN();
		kerangka();
		for (int i = 0; i < arrKerangka.length; i++) {
			for (int j = 0; j < arrKerangka.length; j++) {
				if (arrKerangka[i][j] != null) {
					System.out.print(arrKerangka[i][j]);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public void polaKotak(int perulanganKe) {
		this.a += perulanganKe;
		for (int i = 0; i <= perulanganKe; i++) {
			for (int j = 0; j <= perulanganKe; j++) {
				arrKerangka[i+a][j+a]="*";
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logic5Soal01 ambil = new Logic5Soal01();
		ambil.buatPola();
	}

}
