package ujianLogic;

import java.util.Scanner;

public class Soal04 {
	public int n;
	
	public void nilaiN() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Masukkan nilai n : ");
		this.n = scanner.nextInt();
		System.out.println("Nilai n adalah : "+n);
		scanner.close();
	}

	public int [] deretFib(int n) {
		int[] deret = new int[n];
		deret[0] = 1;
		deret[1] = 1;
		for (int i = 2; i < n; i++) {
			deret [i] = deret[i-1]+deret[i-2];
		}
		return deret;
	}
	
	public void buatPola() {
		nilaiN();
		Soal04 ambil = new Soal04();
		int[] seri = ambil.deretFib(n);
		for (int i = 0; i < seri.length; i++) {
			System.out.printf("%3d", seri[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Soal04 ambil = new Soal04();
		ambil.buatPola();
	}

}
