package hari2;

import java.util.Scanner;

public class PostTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print(" Masukkan nilai N : ");
		int n = scanner.nextInt();
		int x1 = 1;
		int x2 = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i<=n-1&&j==4){
					System.out.printf("%3d", x1);
					int sum = x1 + x2;
					x1 = x2;
					x2 = sum;
				} else if (i == j) {
					System.out.printf("%3d", x1);
					int sum = x1 + x2;
					x1 = x2;
					x2 = sum;
				} else if (i + j == n - 1) {
					System.out.printf("%3d", x1);
					int sum = x1 + x2;
					x1 = x2;
					x2 = sum;
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		scanner.close();
	}

}
