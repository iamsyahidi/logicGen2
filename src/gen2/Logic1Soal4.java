package gen2;

public class Logic1Soal4 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n = 9;
		for (int i = 0; i < n; i++) 
		{
			for (int j = 0; j < n; j++) 
			{
				if (i+j==n-1) 
				{
					System.out.print("*");	
				}
				else if (i==j) 
				{
					System.out.print("*");	
				}
				else if (i==4&&j<n)
				{
					System.out.print("*");
				}
				else if (j==4&&i<n) 
				{
					System.out.print("*");	
				}
				else 
				{
					System.out.print(" ");	
				}
			}
			System.out.println();
		}
	}

}
