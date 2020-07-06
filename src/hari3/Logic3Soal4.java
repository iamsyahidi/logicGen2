package hari3;

public class Logic3Soal4 {
	

	public void buatPola() {
		Logic3Soal2 ambil = new Logic3Soal2();
		int n = ambil.ambilNilai();
		int deret [] = ambil.deretTrib(n);
		for (int i = 0; i < n/2; i++) {
			System.out.printf("%3d", deret[i]);
		}
		for (int i = n/2; i < n; i++) {
			System.out.printf("%3d", deret[n-i-1]);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logic3Soal4 cetak = new Logic3Soal4();
		cetak.buatPola();
	}

}
