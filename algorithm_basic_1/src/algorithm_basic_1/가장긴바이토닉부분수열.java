package algorithm_basic_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 가장긴바이토닉부분수열 {
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		 int num=Integer.parseInt(br.readLine());
		 int[] arr=new int[num];
		 int[] d=new int[num];
		 int[] d2=new int[num];
		// int[] v=new int[num];
		 
		 StringTokenizer st=new StringTokenizer(br.readLine());
		 for(int i=0;i<num;i++) {
			 arr[i]=Integer.parseInt(st.nextToken());
		 }
		 
		 for(int i=0;i<num;i++) {
			 d[i]=1;
			 for(int j=0;j<i;j++) {
				 if(arr[j]<arr[i]) {
					 if(d[i]<d[j]+1) {
						 d[i]=d[j]+1;
					 }
				 }
			 }
			// d2[num-1-i]=0;
			 for(int j=num-1;j>num-1-i;j--) {
				 if(arr[j]<arr[num-1-i]) {
					 if(d2[num-1-i]<d2[j]+1) {
						 d2[num-1-i]=d2[j]+1;
					 }
				 }
			 }
		 }
		 int sum=0;
		 for(int i=0;i<num;i++) {
			 if(sum<d2[i]+d[i])
				 sum=d2[i]+d[i];
		 }
		 
		 System.out.println(sum);
	}
	
}
