	package mandatoryHomeWork.week2.day2;

import java.util.Arrays;

public class RemoveAllOccurrence {

	public static void main(String[] args) {
		int input[]= {1,4,5,7,4};
		int val =4;
		int left=0;
		int right=input.length-1;
		int count =0;
		while(left<right)
		{
			if(input[left]==val)
			{
				count++;
				while(input[right]==val) 
					{
					count ++;
					right--;
					}
				input[left]=input[right];
				right--;
				left++;
			}
			else
				left++;
		}
		System.out.println(Arrays.toString(input));
		System.out.println(input.length-count);
	}

}
