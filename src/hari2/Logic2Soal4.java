package hari2;

import java.util.Scanner;

public class Logic2Soal4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print(" Masukkan nilai N : ");
		System.out.println();
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i==j || j==4&&i<n) {
					System.out.print(i*2+1);
				}else if (i+j==n-1 || i==4&&j<n) {
					System.out.print(j*2);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		scanner.close();
	}

}
