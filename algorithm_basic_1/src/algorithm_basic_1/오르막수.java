package algorithm_basic_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 오르막수 {
	static int[] nums;
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		 int num=Integer.parseInt(br.readLine());
		 
		 int[][] d=new int[num+1][10];
		 
		 for(int i=0;i<10;i++) {
			 d[1][i]=1;
		 }
		 
		 for(int i=2;i<=num;i++) {
			 for(int j=0;j<10;j++) {
				 for(int k=0;k<=j;k++)
				d[i][j]+=d[i-1][k];
			 }
		 }
		 
		 int sum=0;
		 for(int i=0;i<10;i++) {
			 sum+=d[num][i];
			 
		 }
		 
		 System.out.println(sum);
	}
}
