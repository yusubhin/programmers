package programmers_level_1;

public class ªÔ√—ªÁ {
	public static void main(String[] args) {
        int num = 12;
        int result;
        
        result = solution(num);
        
        System.out.println(result);
    }
    
    public static int solution(int n) {
        int answer = 0;
        int i = 1;
        
        while(true) {
            if ((n % i) == 1)
                break;
            else
                i++;
        }
        answer = i;
        
        return answer;
    }
}