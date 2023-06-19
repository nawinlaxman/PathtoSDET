package mandatoryHomeWork.week1.day4;

public class SandGlassPattern {

	public static void main(String[] args) {
		int n=5;
		for(int i=n;i>0;i--)
		{
			for(int j=n-i;j>=1;j--)
			System.out.print(" ");
			
			for (int j = 0; j <i; j++)
			System.out.print("* ");
			
			System.out.println();
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=n-i;j>=1;j--)
			System.out.print(" ");
			for (int j = 0; j <i; j++)
			System.out.print("* ");
			System.out.println();
		}

	}

}
