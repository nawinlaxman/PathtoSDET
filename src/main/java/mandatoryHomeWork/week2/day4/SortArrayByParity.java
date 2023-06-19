package mandatoryHomeWork.week2.day4;

import java.util.Arrays;

public class SortArrayByParity {

	public static void main(String[] args) {
		int input []= {1,3,6,2,5,8,7};
		int output[]=new int[input.length];
		int odd=input.length-1,even=0;
		
		for (int i= 0; i< input.length; i++) {
			
			if(input[i]%2==0)
			{
				output[even]=input[i];
				even++;
			}
			else {
				output[odd]=input[i];
				odd--;
			}
			
		}
		System.out.println(Arrays.toString(output));

	}

}
