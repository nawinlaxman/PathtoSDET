package mandatoryHomeWork.week3.day5;

import java.util.Arrays;

public class MajorityElement {

	public static void main(String[] args) {
		int input[] = {2,2,1,1,1,2,2};
		int n=input.length/2;
		int res=0,count=0,max=0;
		
//		for (int i = 0; i < input.length; i++) {
//			if(input[i]>n&&input[i]>res)
//				res=input[i];
//		}
//		System.out.println(res);
		
		Arrays.sort(input);
		for (int i = 0; i < input.length-1; i++) {
			if(input[i]==input[i+1]) {
				count++;
				if(count>max) {
					max=count;
					res=input[i];
				}
			}
			else
				count=0;
		}
		
		System.out.println(res);
		
		
		
	}

}
