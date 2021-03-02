package algorithm_basic_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 쉬운계단수 {
	static int[][] d;
	static long mod= 1000000000;
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		 int num=Integer.parseInt(br.readLine());
		 d=new int[num+1][10];

		 d[1][0]=0;
		 for(int i=1;i<=9;i++) {
			 d[1][i]=1;
		 }
		 for(int i=2;i<=num;i++) {
			 for(int j=0;j<=9;j++) {
				 if(j-1>=0)
				   d[i][j]=d[i-1][j-1];
				 if(j+1<=9)
				   d[i][j]+=d[i-1][j+1];
				 
				 d[i][j]%=mod;
			 }
		 }
		
		 int sum=0;
			for(int i=0;i<=9;i++) {
				sum+=d[num][i];
			}
			
			System.out.println(sum%mod);
			 
		 
		 
		 
	}
}
