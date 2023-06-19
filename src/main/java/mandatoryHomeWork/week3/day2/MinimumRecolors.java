package mandatoryHomeWork.week3.day2;

public class MinimumRecolors {

	public static void main(String[] args) {
		String input="WBBWWBBWBW";
		int k=7;
		
		int s=0;
        int e=k;
        int res=0;
        char[] ch=input.toCharArray();
        
        for(int i=0; i<k; i++)
        	if(ch[i]=='W') 
        	res++;
        
        int t=res;
        for(int i=0; i<ch.length-k; i++){
        	if(ch[s]=='W')
        		t-=1;
        	if(ch[e]=='W')
        		t+=1;
        	res=Math.min(res, t);
        	s++;
        	e++;
        }
        System.out.println(res);
	}

}
