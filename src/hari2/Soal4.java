package hari2;

import java.util.Scanner;

public class Soal4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Masukkan nilai loop N:");
		//
		char A='A';
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print(A++ +" ");
		}
		System.out.println();
		scanner.close();
	}
}

