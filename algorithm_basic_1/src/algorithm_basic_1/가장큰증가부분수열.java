package algorithm_basic_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 가장큰증가부분수열 {
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		 int num=Integer.parseInt(br.readLine());
		 int[] arr=new int[num];
		 int[] d=new int[num];
		// int[] v=new int[num];
		 
		 StringTokenizer st=new StringTokenizer(br.readLine());
		 for(int i=0;i<num;i++) {
			 arr[i]=Integer.parseInt(st.nextToken());
		 }
		 
		 d[0]=arr[0];
		 
		 for(int i=1;i<num;i++) {
			 int max=0;
			 for(int j=0;j<i;j++) {
				 if(arr[i]>arr[j]) {
					 if(max<d[j])
						 max=d[j];
				 }
 
			 }
			 d[i]=max+arr[i];
		 }
		 
		 int max=-1;
		 for(int i=0;i<num;i++) {
			 if(d[i]>max)
				 max=d[i];
		 }
		 System.out.println(max);
	}
}
