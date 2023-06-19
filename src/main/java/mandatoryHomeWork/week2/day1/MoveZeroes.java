package mandatoryHomeWork.week2.day1;

import java.util.Arrays;


public class MoveZeroes {

	public static void main(String[] args) {
		
		int input []= {1,0,3,5,0,9,10};
		int left, right=input.length-1;
		int temp;
		for (left=0; left<right; left++) {
			if(input[left]==0)
			{
			temp=input[left];
			input[left]=input[right];
			input[right]=temp;
			right--;
			}
			
		}
		
		System.out.println(Arrays.toString(input));
		

	}

}
