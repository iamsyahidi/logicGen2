package hari7;

import java.util.Scanner;

public class KisiLogic {
	public String nama;
	
	public void nilaiN() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Masukkan nama karakter : ");
		this.nama = scanner.nextLine();
		System.out.println("Nama karakter adalah : " + nama);
		scanner.close();
	}
	
	public void hitungChar() {
		nilaiN();
		int n = 1;
		for (int i = 0; i < nama.length(); i++) {
			char k = nama.charAt(i);
			if (k=='a'||k=='i'||k=='u'||k=='e'||k=='o') {
				System.out.print(n);
				n++;
			}else if (k=='A'||k=='I'||k=='U'||k=='E'||k=='O') {
				System.out.print(n);
				n++;
			}else {
				System.out.print(k);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KisiLogic ambil = new KisiLogic();
		ambil.hitungChar();
	}
}
