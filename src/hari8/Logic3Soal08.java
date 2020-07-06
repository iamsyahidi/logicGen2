package hari8;

import java.util.Scanner;

public class Logic3Soal08 {
	public int n;
	
	public void nilaiN() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Masukkan nilai n : ");
		this.n = scanner.nextInt();
		System.out.println("Nilai n adalah : "+n);
		scanner.close();
	}

	public int [] deretGanjil() {
		int [] bilGanjil = new int [n];
		bilGanjil[0]=1;
		for (int i = 1; i < bilGanjil.length; i+=2) {
			bilGanjil[i]=bilGanjil[i-1]+bilGanjil[i];
		}
		return bilGanjil;
	}
	
	public void buatPola() {
		nilaiN();
		deretGanjil();
		Logic3Soal08 ambil = new Logic3Soal08();
		int [] deret = ambil.deretGanjil();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i==0||j==0||j<=i||i<=j) {
					System.out.println(deret[i]);	
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logic3Soal08 ambil = new Logic3Soal08();
		ambil.buatPola();
	}

}
