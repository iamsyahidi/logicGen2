package hari3;


public class LatMethod {
	
	public static void cetakTulisan() {
		System.out.println("Hai ! ");
	}
	
	public static int hitungUsia(int lahir, int sekarang) {
		int umur = sekarang - lahir;
		System.out.println("Usia saya adalah : " + umur);
		return umur;
	}
	
	public static void cetakNama(String nama) {
		System.out.println("Nama saya adalah : " + nama);
	}
	
	public static void main (String[] args) {
		cetakTulisan();
		cetakNama("Ilham Syahidi");
		hitungUsia (1997,2020);
	}

}
