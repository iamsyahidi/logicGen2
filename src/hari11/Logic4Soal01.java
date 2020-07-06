package hari11;

import java.util.Scanner;

public class Logic4Soal01 {
	
	public int n;
	
	public void getN() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input value n : ");
		this.n = scanner.nextInt();
		System.out.println("Value of n is : "+ n);
		scanner.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
