package mandatoryHomeWork.week3.day5;

public class ContainsNearbyDuplicate {

	public static void main(String[] args) {
		int input[]= {1,2,3,1}; //k=3 
		int k=3;
		int j=0;
		
		while(j<input.length) {
		for (int i = j+1; i<input.length; i++) {
			if(input[i]==input[j])
			{
				if(i-j==k)	
				{System.out.println(true);
				break;
				}
			}
		}
		j++;
		}
	System.out.println(false);
	}

}
