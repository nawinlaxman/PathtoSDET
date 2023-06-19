package mandatoryHomeWork.week2.day2;

public class MergeAlternately {

	public static void main(String[] args) {
		String st1= "abcd";
		String st2= "ef";
		//String st3="";
		StringBuilder st3 = new StringBuilder();
		int i=0;
		//for (int i = 0; i < st1.length()-1; i++) {
		//	st3+=st1.charAt(i)+st2.charAt(i);
		//}
		//System.out.println(st3);
		
		while(i<st1.length()||i<st2.length())
		{
			if(i<st1.length())
			st3.append(st1.charAt(i));
			if(i<st2.length())
			st3.append(st2.charAt(i));	
			
			i++;
		}
		System.out.println(st3);
	}

}
