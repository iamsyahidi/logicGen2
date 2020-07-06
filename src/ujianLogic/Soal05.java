package ujianLogic;

import java.util.Scanner;


public class Soal05 {
	public int n;
	
	public void nilaiN() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Masukkan nilai n : ");
		this.n = scanner.nextInt();
		System.out.println("Nilai n adalah : "+n);
		scanner.close();
	}
	
	public int[] deretGan(int n) {
		int[] deret = new int[n];
		deret[0]=1;
		for (int i = 1; i < deret.length; i++) {
			deret[i]=deret[i-1]+2;
		}
		return deret;
	}
	
	public void buatPola() {
		nilaiN();
		Soal05 ambil = new Soal05();
		int[] seri = ambil.deretGan(n);
		for (int i = 0; i < seri.length; i++) {
			System.out.printf("%3d", seri[i]);
			// 1+2*j
		}
		System.out.println();
		for (int i=seri.length-1; i>=0; i--) {
			System.out.printf("%3d", seri[i]);
		}
			//2*n-(1+2*j)
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Soal05 ambil = new Soal05();
		ambil.buatPola();
	}

}
