package mandatoryHomeWork.week2.day5;

import java.util.Arrays;

public class ReverseWord {

	public static void main(String[] args) {
		String s1="Welcome to Testleaf";
		
		StringBuilder sb = new StringBuilder();
		String[] split = s1.split(" ");
		for (int i = 0; i < split.length; i++) {
			char[] ch = split[i].toCharArray();
			for (int j = ch.length - 1; j >= 0; j--) {
				sb.append(ch[j]);
			}
			sb.append(" ");
		}
		sb.replace(sb.length() - 1, sb.length(), "");
		System.out.println(sb.toString()); 
	}

}
