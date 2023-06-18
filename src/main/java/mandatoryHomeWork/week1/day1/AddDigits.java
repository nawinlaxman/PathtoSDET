package mandatoryHomeWork.week1.day1;

public class AddDigits {

	public static void main(String[] args) {
		int n=0;
		int l=0;
		int sum =0;
		while(n>0) {
			l=n%10;
			sum=sum+l;
			n=n/10;
		}
		System.out.println(sum);
	}

}
