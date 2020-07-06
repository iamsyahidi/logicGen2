package hari3;

public class Logic3Soal6 {

	public void buatPola() {
		Logic3Soal1 ambil = new Logic3Soal1();
		int n = ambil.nilaiN();
		int deret[] = ambil.deretFib(n);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j || i + j == n - 1) {
					System.out.printf("%3d",deret[j]);
				} else if (i + j < n - 1&&j>i) {
					System.out.printf("%3s", "A");
				} else if (i+j > n-1 && j>i){
					System.out.printf("%3s", "B");
				} else if (i+j < n-1 && j<i){
					System.out.printf("%3s","D");
				} else {
					System.out.printf("%3s","C");
				} 
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logic3Soal6 cetak = new Logic3Soal6();
		cetak.buatPola();
	}

}
