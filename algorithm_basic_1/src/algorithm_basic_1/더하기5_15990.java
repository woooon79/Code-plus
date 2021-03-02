package algorithm_basic_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ¥ı«œ±‚5_15990 {
	static long[][] d;
	static final long mod = 1000000009L;
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		 int num=Integer.parseInt(br.readLine());
		 d=new long[100001][4];

         d[1][1]=1;
         d[2][2]=1;
         d[3][3]=1;

         
		 for(int i=2;i<100001;i++) {
			 
	        if(i>1)
			d[i][1]=(d[i-1][2]+d[i-1][3])%mod;
	        if(i>2)
			d[i][2]=(d[i-2][1]+d[i-2][3])%mod;
	        if(i>3)
			d[i][3]=(d[i-3][2]+d[i-3][1])%mod;
			 

		 }
		 for(int i=0;i<num;i++) {
			 
			 int n=Integer.parseInt(br.readLine());
			 
			 System.out.println((d[n][1]+d[n][2]+d[n][3])%mod);
			 
		 }
		 
		 
	}
}
