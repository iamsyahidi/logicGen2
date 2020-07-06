package hari3;

public class Logic3Soal5 {

	public void buatPola() {
		Logic3Soal1 ambil = new Logic3Soal1();
		int n = ambil.nilaiN();
		int deret[] = ambil.deretFib(n);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j < i && i + j < n - 1) {
					System.out.printf("%3s", " ");
				} else if (j>=n/2) {
					System.out.printf("%3d", deret[n-1-j]);
				} else {
					System.out.printf("%3d", deret[j]);
				}
			}
			System.out.println();
		}
	}

	public static void main(String... s) {
		Logic3Soal5 cetak = new Logic3Soal5();
		cetak.buatPola();
	}

}
