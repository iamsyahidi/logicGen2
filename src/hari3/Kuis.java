package hari3;

import java.util.Scanner;

public class Kuis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Masukkan nilai N : ");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= (n - 1) * n; j++) {
				if (i == 0 || i == (n - 1) || j % (n - 1) == 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		scanner.close();
	}

}
