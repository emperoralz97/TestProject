import java.util.Scanner;
import java.lang.*;
public class CSUB {
	
	public static long noOfOnes(String s) {
		long ones = 0;
		for(char ch : s.toCharArray()) {
			if(ch=='1') {
				ones += 1;
			}
		}
		return ones;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t,n;
		Scanner in = new Scanner(System.in);
		t = in.nextInt();
		
		while(t>0) {
			n = in.nextInt();
			String s;
			s = in.next();
			long one = noOfOnes(s);
			System.out.print(one*(one+1)/2);
			t--;
			
		}
	}

}
