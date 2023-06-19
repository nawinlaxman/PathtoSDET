package mandatoryHomeWork.week3.day4;

import java.util.ArrayList;
import java.util.Arrays;

public class ReversePrefix {

	public static void main(String[] args) {
		 String s = "abcdef";
		 char[] arr=s.toCharArray();
		 char ch='b';
		 int left, right =s.indexOf(ch);
		 char temp;
		 
		 for (left= 0; left<right ; left++) {
			temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			right--;
			
		}
		System.out.println(Arrays.toString(arr)); 
		System.out.println(String.valueOf(arr));
		
	
		
	}

}
