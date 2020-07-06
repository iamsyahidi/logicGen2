package hari2;

import java.util.Scanner;

public class Soal1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// create a new Scanner object
		Scanner scanner = new Scanner(System.in);
		System.out.println("Masukkan nilai n :");
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++) 
		{
			System.out.printf("%3s",i);
		}
		scanner.close();
	}

}
