package mandatoryHomeWork.week1.day1;

import java.util.Arrays;

public class PlusOne {
	
	public static int[] plusOne(int[] input) {
		int lastindex=input.length-1;
		
		for(int i=lastindex;i>=0;i--)
		{
		if(input[i]!=9) {
			input[i]=input[i]+1;
			return input;
		}
		input[i]=0;
		}
		int[] output= new int[input.length+1];
		output[0]=1;
		return output;
	}
	
	

	public static void main(String[] args) {
		//1,2,3  --> 1,2,4
		//1,5,2,9  --> 1,5,3,0
		
		int input []= {8,9,9};
		plusOne(input);
		System.out.println(Arrays.toString(input));
		
		
		//String temp= Arrays.toString(input).replaceAll("\\D+","");
		//System.out.println(temp);
		//char[] output=temp.toCharArray();
		//for(int i=0;i<=input.length;i++)
			//System.out.print(input[i]+",");

}
	
}
