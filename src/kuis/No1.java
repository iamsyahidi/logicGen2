package kuis;

// jika n=4
public class No1 {
	public static void main(String[] args) {
		int n = 4;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%3s", "*");
			}
			System.out.println();
		}
	}
}
