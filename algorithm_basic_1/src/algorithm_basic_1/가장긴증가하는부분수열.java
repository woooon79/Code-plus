package algorithm_basic_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 가장긴증가하는부분수열 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		 int num=Integer.parseInt(br.readLine());
		 int[] arr=new int[num];
		 int[] dp=new int[num];
		 int[] v=new int[num];
		 Arrays.fill(dp, 1);
		 StringTokenizer st=new StringTokenizer(br.readLine());
		 for(int i=0;i<num;i++) {
			 arr[i]=Integer.parseInt(st.nextToken());
		 }
		 int max=0;
		 int max_i=0;
		 for(int i=0;i<num;i++) {
			 
			 for(int j=i-1;j>=0;j--) {
				 if(arr[i]>arr[j]&&dp[i]<dp[j]+1) {					
						dp[i]=dp[j]+1;
						v[i]=j;
				 }
			 }
			 
			 if(max<dp[i]) {
				 max=dp[i];
				 max_i=i;
			 }
		 }
		 
		 System.out.println(max);
		 
		 int[] arr2=new int[max];
		 for(int i=0;i<max;i++) {
			 arr2[i]=arr[max_i];
			 max_i=v[max_i];
		 }
		 for(int i=max-1;i>=0;i--) {
			 System.out.print(arr2[i]+" ");
		 }
		 
		 
		 
		
	}
}
