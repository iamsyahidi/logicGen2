package hari2;

import java.util.Scanner;

public class Soal5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan nilai N :");
		int n = scanner.nextInt();
		for (int i = 1; i <=n; i++) {
			System.out.print(((i % 2 == 0) ? (i - 1) : (i + 1)));
		}
		System.out.println();
		scanner.close();
	}

}
