package mandatoryHomeWork.week2.day1;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		String input="Welcome to Testleaf";
		char []ch=input.toCharArray();
		int left, right=input.length()-1;
		char temp;
		
		for (left=0; left<right; left++) {
			temp=ch[left];
			ch[left]=ch[right];
			ch[right]=temp;
			right--;
		}
		System.out.println(Arrays.toString(ch));
		String output=new String(ch);
		System.out.println(output);
	}

}
