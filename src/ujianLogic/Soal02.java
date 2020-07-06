package ujianLogic;

import java.util.Scanner;

public class Soal02 {
	
	public int n;
	
	public void nilaiN() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Masukkan nilai n : ");
		this.n = scanner.nextInt();
		System.out.println("Nilai n adalah : " + n);
		scanner.close();
	}
	
	public void buatPola() {
		nilaiN();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i+j==n-1||i+j>=n) {
					System.out.printf("%3s","*");
				}else {
					System.out.printf("%3s"," ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Soal02 ambil = new Soal02();
		ambil.buatPola();
	}

}
