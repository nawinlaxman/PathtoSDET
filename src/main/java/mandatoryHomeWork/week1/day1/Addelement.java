package mandatoryHomeWork.week1.day1;

import java.util.Arrays;

public class Addelement {

	public static void main(String[] args) {
		Integer arr[] = {1,2,3,4,5,6};  
		int n = arr.length;  
		int index = 3, value =7;
		System.out.println(Arrays.toString(arr));  
		Integer newArr[] = new Integer[n+1];  
		int j = 0;  
		for(int i = 0; i<newArr.length; i++) {  
		if(i==index) {  
		newArr[i] = value;  
		}else {  
		newArr[i] = arr[j];  
		j++;  
		}  
		} 
		System.out.println(Arrays.toString(newArr));  
		}
	}
