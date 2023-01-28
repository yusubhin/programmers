class Solution {
	public static String solution(int[] food) {
        String answer = "";
        int len = food.length;
        int[] eat = new int[len];
        
        for(int i=0; i<len; i++) {
        	if(i == 0) eat[i] = 1;
        	else {
        		eat[i] = food[i]/2;
        		for(int j=0; j<eat[i]; j++) {
        			answer += Integer.toString(i);
        		}
        	}
        }
        
        answer += 0;
        
        for(int i=answer.length()-2; i>=0; i--) {
        	answer += answer.charAt(i);
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
    	int[] numFoods = {1, 3, 4, 6};
    	String result;
    	
    	result=solution(numFoods);
    	
    	System.out.println(result);
    }
}
