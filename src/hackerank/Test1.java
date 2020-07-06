//package hackerank;
//
//import java.util.Scanner;
//
//public class Test1 {
//	
//	public int n;
//	
//	public void nilaiN() {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Masukkan nilai n : ");
//		this.n = scanner.nextInt();
//		scanner.close();
//	}
//	
//	// gunakan bahasa inggris 	
//	public void buatPola() {
//		nilaiN();
//		for (int i = 1; i <=n; i++) {
//			if (i%3==0&&i%5==0) {
//				System.out.print("FizzBuzz");
//			}else if (i%3==0) {
//				System.out.print("Fizz");
//			}else if (i%5==0) {
//				System.out.print("Buzz");
//			}else {
//				System.out.print(i);
//			}
//			System.out.println();
//		}
//		
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Test1 ambil = new Test1();
//		ambil.buatPola();
//	}
//
//}
