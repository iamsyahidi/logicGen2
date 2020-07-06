package ujianLogic;

import java.util.Scanner;

public class Soal08 {
	
	public int n;
	
	public void uangAndi() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Masukkan nilai uang Andi : ");
		this.n = scanner.nextInt();
		System.out.println("Uang Andi senilai : "+n);
		scanner.close();
	}
	
	public void arrBarang() {
		uangAndi();
		int[] kacamata = new int[3];
		kacamata[0]=34;
		kacamata[1]=26;
		kacamata[2]=44;
		int[] baju = new int[3];
		baju[0]=21;
		baju[1]=39;
		baju[2]=33;
		for (int i = 0; i < 3; i++) {
				if (kacamata[i]+baju[i]>70) {
					System.out.println("Harga melebihi untuk belanja");
					System.out.println("Harga kacamata "+kacamata[i]+" Harga baju "+baju[i]);
					System.out.println();
				}else {
					System.out.println("Uang mencukupi untuk belanja");
					System.out.println("Harga kacamata "+kacamata[i]+" Harga baju "+baju[i]);
					System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Soal08 ambil = new Soal08();
		ambil.arrBarang();
	}

}
