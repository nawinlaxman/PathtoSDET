package mandatoryHomeWork.week2.day1;

import java.util.Arrays;

public class SwapVowels {

	public static void main(String[] args) {
		
		String input="Halle evoryeno! Welcemo te TEstloef";
		//Tastleef
		//"Halle evoryeno! Welcemo te TEstloef"
		int l, r=input.length()-1;
		char [] ip=input.toCharArray();
		char ipl,ipr,temp;
		for (l=0; l<r; l++) {
		{
			ipl=ip[l];
			if(ipl=='a'||ipl=='e'||ipl=='o'||ipl=='E')
			{
			for(;l<r;r--)
			{
				ipr=ip[r];
				if(ipr=='a'||ipr=='e'||ipr=='o'||ipr=='E')
				{
					temp=ip[l];
					ip[l]=ip[r];
					ip[r]=temp;
					r--;
					break;
				}
			}
		}
	}
}
		System.out.println(Arrays.toString(ip));	
	}

}
