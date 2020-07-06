package hari7;

import java.util.Scanner;

public class KisiLogic02 {
	public String nama;
	public String [] arrKata;
	public int panjangNama;
	public int jumlahKata;
	
	public void getNama() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Masukkan nama karakter : ");
		this.nama = scanner.nextLine();
		System.out.println("Nama karakter adalah : "+nama);
		scanner.close();
	}
	
	public void splitChar() {
		getNama();
		this.arrKata = nama.split(" ");
		this.jumlahKata=arrKata.length;
		for (int i = 0; i < jumlahKata; i++) {
			this.panjangNama = arrKata[i].length();
			for (int j = 0; j < panjangNama; j++) {
				char huruf = arrKata[i].charAt(j);
				if(j==0||j==(panjangNama-1)) {
					System.out.print(huruf);
				}else {
					System.out.print("*");
				}
			}
			System.out.print(" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KisiLogic02 ambil = new KisiLogic02();
		ambil.splitChar();
	}

}
