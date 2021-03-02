package algorithm_basic_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 타일채우기 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
	    int n=Integer.parseInt(br.readLine());
	    int[] dp=new int[n+1];
	    
	    if(n%2==1) {
	    	System.out.println(0);
	    	return;
	    }
	    dp[2]=3;
	    
	    for(int i=4;i<=n;i=i+2) {
	    	dp[i]=dp[i-2]*3;
	    	if(i>=4) {
	    		dp[i]+=dp[i-4]*2;
	    	}
	    	if(i>=6) {
	    		dp[i]+=dp[i-6]*2;
	    	}
	    		
	    }
	    
	    System.out.println(dp[n]);
	}
}
