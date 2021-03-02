package algorithm_basic_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 가장긴감소하는부분수열 {
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
		 int max=0;
		 for(int i=0;i<num;i++) {
			 d[i]=1;
			 for(int j=0;j<i;j++) {
				 
				 if(arr[i]<arr[j]) {
					 if(d[j]+1>d[i])
						 d[i]=d[j]+1;
				 }
			 }
			 if(max<d[i])
				 max=d[i];
		 }
		 System.out.println(max);
		 
		 
    }
}
