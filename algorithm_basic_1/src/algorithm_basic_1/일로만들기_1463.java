package algorithm_basic_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 일로만들기_1463 {
	static int[] d;
	static int dp(int n) {
		if(n==1)
			return 0;
		if(d[n]>0)
			return d[n];
		
		d[n]=dp(n-1)+1;
		
		if(n%2==0) {
			int temp=dp(n/2)+1;
			if(d[n]>temp)
				d[n]=temp;
		}
		if(n%3==0) {
			int temp=dp(n/3)+1;
			if(d[n]>temp)
				d[n]=temp;
		}
		return d[n];
	}
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		 int num=Integer.parseInt(br.readLine());
		 d=new int[num+1];
		 System.out.println(dp(num));
	}
}
