/**
 * 
 */
package oopWfh;

/**
 * @author ilham syahidi
 *
 */
public class LuasPersegiPanjang {

	// atribut
	private int panjang;
	private int lebar;

	// Setter Getter
	public int getPanjang() {
		return panjang;
	}

	public void setPanjang(int panjang) {
		this.panjang = panjang;
	}

	public int getLebar() {
		return lebar;
	}

	public void setLebar(int lebar) {
		this.lebar = lebar;
	}

		// metho hitungLuas
	public 	int hitungLuas(int panjang, int lebar) {
		int hasil;
		hasil = panjang * lebar;
		System.out.print(hasil);
		return hasil;
	}
	

		// method mai
	public  static void main(String [] args) {
		LuasPersegiPanjang lsp = new LuasPersegiPanjang();;
		lsp.hitungLuas(4, 6);
	}
		
	


}

///**
// * 
// */
//package oopWfh;
//
//import java.util.Scanner;
//
///**
// * @author ilham syahidi
// *
// */
//class LuasPersegiPanjang {
//
//	// atribut
//	static int panjang;
//	static int lebar;
//
//	// method hitungLuas
//	static int hitungLuas() {
//		Scanner scanner = new Scanner(System.in);
//		panjang = scanner.nextInt();
//		lebar = scanner.nextInt();
//		int hasil;
//		hasil = panjang * lebar;
//		System.out.print(hasil);
//		scanner.close();
//		return hasil;
//	}
//
//	// method main
//	static void main(String[] args) {
//		hitungLuas();
//	}
//
//}


