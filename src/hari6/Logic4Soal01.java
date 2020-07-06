package hari6;

import java.util.Scanner;

public class Logic4Soal01 {

	public int n;

	public void nilaiN() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Masukkan nilai n : ");
		this.n = scanner.nextInt();
		System.out.println("Nilai n adalah : " + n);
		scanner.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
