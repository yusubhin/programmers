package level_1_가장_가까운__같은_글자;

import java.util.Arrays;

public class Solution {
	public static int[] solution(String s) {
		int len = s.length();
		int[] answer = new int[len];
		char ch;
		char[] charArr;
		int idx;
		
		charArr = s.toCharArray();
		
		for(int i=0; i<len; i++) {
			idx = -1;
			ch = charArr[i];
			for(int j=0; j<i; j++) {
				if(j == i) continue;
				else {
					if(ch == charArr[j])
						idx = j;
				}
			}
			if(idx == -1)
				answer[i] = -1;
			else {
				answer[i] = i - idx; 				
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		String str = "newww";
		int[] result;
		
		result = solution(str);
		
		System.out.println(Arrays.toString(result));
	}
}
