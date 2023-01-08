package level_1_문자열_나누기;

class Solution {
    public static int solution(String s) {
        int answer = 0;
       
        char x = s.charAt(0);
        int cntX = 0;
        int cntNX = 0;
        int cntSp = 0;
        int j = 0;
        int len = s.length();
        
        for(int i=0; i<len; i++) {
        	//x = s.charAt(0);
        	if(s.charAt(i) == x) cntX ++;
        	else cntNX ++;
        	//j++;
        	if(cntX == cntNX || i == len-1) {
        		if(i != len-1)
        			x = s.charAt(i+1);
        		//s = s.substring(j);
        		//j = 0;
        		//cntX = 0;
        		//cntNX = 0;
        		cntSp++;
        	}	
        }
        
        answer = cntSp;
        
        return answer;
    }
    
    public static void main(String[] args) {
        int result;
        String str = "banana";
        
        result = solution(str);
		
        System.out.println(result);
	}
}