package hari6;

import java.util.Scanner;

public class Kuis01 {
	
	public int n1;
	public int n2;
	public String [][] arrKerangka;
	public int panjang;
	
	public void nilaiN() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Masukkan nilai n1 : ");
		this.n1 = scanner.nextInt();
		System.out.println("Masukkan nilai n2 : ");
		this.n2 = scanner.nextInt();
		System.out.println("Nilai n1 dan n2 adalah : " + n1 +" dan " + n2);
		scanner.close();
	}
	
	public void kerangka() {
		panjang = n1*n2;
		arrKerangka = new String [panjang][panjang];
		for (int i = 0; i < n2; i++) {
			if (i%2==0) {
				pola1(i);
			}else {
				polaSegitiga(i);
			}
			
		}
	}
	
	public void buatPola() {
		nilaiN();
		kerangka();
		for (int i = 0; i < arrKerangka.length; i++) {
			for (int j = 0; j < arrKerangka.length; j++) {
				if (arrKerangka[i][j] != null) {
					System.out.print(arrKerangka[i][j]);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public void pola1(int n) {
		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < n1; j++) {
				arrKerangka[i+n*n1][j+n*n1]="*";
			}
		}
	}
	
	public void polaSegitiga(int n) {
		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < n1; j++) {
				if(j<=i) {
				arrKerangka[i+n*n1][j+n*n1]="*";
				}
			}
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kuis01 ambil = new Kuis01();
		ambil.buatPola();
	}

}
