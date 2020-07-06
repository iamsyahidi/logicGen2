package gen2;

public final class Logic1Soal8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i + j <= n - 1 && j <= i) // && i+j<=n-1
				{
					System.out.print("  ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
