package hari6;

import java.util.Scanner;

public class Kuis02 {
	public int n1;
	public int panjang;
	public String [][] kerangkaArr;
	public int [] seriFib;
	public int a;
	public int x;
	
	public void nilaiN() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Masukkan nilai n : ");
		this.n1 = scanner.nextInt();
		System.out.println("Nilai n adalah : "+n1);
		scanner.close();
	}

	public void kerangkaArr() {
		for (int i = 0; i < n1; i++) {
			this.x+=i+1;
		}
		this.kerangkaArr = new String [x][x];
		for (int i = 0; i < n1; i++) {
			polaSegitiga(i);
		}
	}
	
	public void deretFib(int n) {
		seriFib[0] = 1;
		seriFib[1] = 1;
		for (int i = 2; i < n; i++) {
			this.seriFib[i] = seriFib[i - 1] + seriFib[i - 2];
		}
	}
	
	public void buatPola() {
		nilaiN();
		kerangkaArr();
		for (int i = 0; i < kerangkaArr.length; i++) {
			for (int j = 0; j < kerangkaArr.length; j++) {
				if (kerangkaArr [i][j] != null) {
					System.out.print(kerangkaArr[i][j]);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public void polaSegitiga(int perulanganKe) {
		this.a += perulanganKe;
		for (int i = 0; i < perulanganKe; i++) {
			for (int j = 0; j < perulanganKe; j++) {
				if (i<=j) {
				kerangkaArr[i+a][j+a]="*";
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kuis02 ambil = new Kuis02();
		ambil.buatPola();
	}

}
