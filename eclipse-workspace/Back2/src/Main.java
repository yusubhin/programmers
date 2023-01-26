import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		int newNum = 100;
		int sum;
		int[] arr = new int[2];
		int NewN = N;
		
		while(newNum != N) {
			if(count != 0) NewN = newNum;
			if(NewN < 10) arr[0] = 0;
			else arr[0] = NewN/10;
			arr[1] = NewN - arr[0] * 10;
			sum = arr[0] + arr[1]; 
			if(sum >= 10) sum = sum % 10;
			newNum = arr[1] * 10 + sum;
			count ++;
		}
		
		System.out.println(count);
	}
}