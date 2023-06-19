package mandatoryHomeWork.week3.day3;

public class SearchInsert {

	public static void main(String[] args) {
		int input[] = {1,3,5,7};
		int target =6;
		
		for (int i = 0; i < input.length; i++) {
			if(input[i]==target) {
				System.out.println(i);
				break;}
			else if(input[i]>target) {
				System.out.println(i);
				break;}
				}

		}	
	}

