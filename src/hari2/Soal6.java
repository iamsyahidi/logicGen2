package hari2;

import java.util.Scanner;

public class Soal6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan nilai N : ");
		char A='A';
		int n = scanner.nextInt();
		for (int i = 1; i <=n; i++) {
			if (i%2==0) {
				System.out.print(A++);
			}
			else {
				System.out.print(i);
			}
		}
		System.out.println();
		scanner.close();
	}

}
