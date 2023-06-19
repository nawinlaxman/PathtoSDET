package mandatoryHomeWork.week1.day1;

public class PyramidProgram {

	public static void main(String[] args) {
		
		//BruteForce1
		int row=5;int c=0;
		while(c<row)
		{
			for(int j=0;j<=c;j++)
			System.out.print("*");
			System.out.println();
			c++;
		}
		
		//2nd method
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=n-i;j>1;j--)
			System.out.print(" ");
			for (int j = 0; j <i; j++)
			System.out.print("* ");
			System.out.println();
		}
	}
}
