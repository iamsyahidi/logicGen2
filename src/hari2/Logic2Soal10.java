package hari2;

import java.util.Scanner;

public class Logic2Soal10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print(" Masukkan nilai N : ");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i <= 4 && j < n) {
					System.out.printf("%3d", i*2);
				} else {
					System.out.printf("%3d", -i*2+16);
				}
			}
			System.out.println();
		}
		scanner.close();
	}

}
