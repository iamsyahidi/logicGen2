package ujianLogic;

import java.util.Scanner;

public class Soal01 {
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
				if (i>=j) {
					System.out.printf("%3d",j+1);
				}else {
					System.out.printf("%3s"," ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Soal01 ambil = new Soal01();
		ambil.buatPola();
	}

}
