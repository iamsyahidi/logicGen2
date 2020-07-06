package gen2;

public class Logic1Soal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					System.out.printf("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
