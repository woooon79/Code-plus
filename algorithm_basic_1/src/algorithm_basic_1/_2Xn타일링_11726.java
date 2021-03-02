package algorithm_basic_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _2Xn≈∏¿œ∏µ_11726 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
	    int n=Integer.parseInt(br.readLine());
	    int[] dp=new int[n+1];
	    
	    dp[1]=1;
	    dp[2]=2;
	    
	    for(int i=3;i<=n;i++) {
	    	dp[i]=dp[i-1]+ dp[i-2];
	    }
	    System.out.println(dp[n]);
	    
	    
	}
}
