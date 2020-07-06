package ujianLogic;

import java.util.Scanner;

public class Soal06 {
	public int n;
	public int m;
	
	public void nilaiN() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan nilai m : ");
		this.m = scanner.nextInt();
		System.out.print("Masukkan nilai n : ");
		this.n = scanner.nextInt();
		System.out.println("Nilai m dan n adalah : "+m+" dan "+n);
		scanner.close();
	}
	
	public void buatPola() {
		nilaiN();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (i==0||j==0||j==m-1||i==n-1) {
					System.out.printf("%3s", "*");
				}else {
					System.out.printf("%3s", " ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Soal06 ambil = new Soal06();
		ambil.buatPola();
	}

}
