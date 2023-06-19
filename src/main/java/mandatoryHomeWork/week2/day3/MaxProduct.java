package mandatoryHomeWork.week2.day3;

public class MaxProduct {

	public static void main(String[] args) {
		
		
		int input[]= {7,6,5};   //8,4,6,7,1      //3,4   
		int left=0,right=0;
//		for (int i = 0; i < input.length; i++) {
//			if(input[left]<input[i])
//				input[left]=input[i];
//		}
//		for (int i = 0; i < input.length; i++) {
//			if(input[right]<input[i]&&input[i]!=input[left])
//				input[right]=input[i];
//		}
		
//		for (int i = 0; i < input.length; i++) {
//			if(input[left]<input[i])
//			{
//				input[right]=input[left];
//				input[left]=input[i];
//			}
//			else if(input[right]<input[i]&&input[i]!=input[left])
//			{
//				input[right]=input[i];
//			}
			
			for (int i = 0; i < input.length; i++) {
				if(left<input[i])
				{
					right=left;
					left=input[i];
				}
				else if(right<input[i]/*&&input[i]!=input[left]*/)
				{
					right=input[i];
				}
		}	
		System.out.println(left+","+right);
		System.out.println((left-1)*(right-1));		
	}

}
