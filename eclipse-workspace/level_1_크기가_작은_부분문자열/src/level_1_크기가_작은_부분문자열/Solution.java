package level_1_크기가_작은_부분문자열;

public class Solution {
	public static int solution(String t, String p) {
        int answer = 0;
        int i = 0;
        int idx;
        int len = p.length();
        long nump = Long.parseLong(p); 
        
        String str;
        long numt;
                
        while(i+len-1 < t.length()) {
        	str = t.substring(i, i+len);
        	numt = Long.parseLong(str);
        	if(numt <= nump)
        		answer ++;
        	i++;
        }
        
        if(answer != 0)
        	return answer;
        else
        	return 0;
    }
	
	public static void main(String[] args) {
		int result;
		String str1 = "3141592";
		String str2 = "271";
		
		result = solution(str1, str2);
		
		System.out.println(result);
	}
}
