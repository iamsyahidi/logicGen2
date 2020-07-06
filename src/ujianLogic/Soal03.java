package ujianLogic;

import java.util.Scanner;

public class Soal03 {
	
	public int n;
	
	public void nilaiN() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Masukkan nilai n : ");
		this.n = scanner.nextInt();
		System.out.println("Nilai n adalah : " + n);
		scanner.close();
	}

	public int [] deretAng(int n) {
		int[] deret = new int[n];
		deret[0] = 1;
		for (int i = 1; i < n; i++) {
			deret[i] = deret[i-1] + n;
		}
		return deret;
	}
	
	
	public void buatPola() {
		nilaiN();
		Soal03 ambil = new Soal03();
		int [] seri = ambil.deretAng(n);
		for (int i = 0; i < n; i++) {
			System.out.printf("%3d",seri[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Soal03 ambil = new Soal03();
		ambil.buatPola();
	}

}
