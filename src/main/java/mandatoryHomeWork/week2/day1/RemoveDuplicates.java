package mandatoryHomeWork.week2.day1;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int input[]= {1,2,3,3,3,4,5,5};
		int left,right=1;
		for (left=0; left< input.length-1; left++) {
			if(input[left]<input[left+1])
			{
				input[right]=input[left+1];	
				right++;	
			}
			
		}
		System.out.println(Arrays.toString(input));
		System.out.println(right);
	}

}
