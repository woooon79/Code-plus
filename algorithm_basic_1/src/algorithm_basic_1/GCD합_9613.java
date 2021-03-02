package algorithm_basic_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class GCDÇÕ_9613 {
	static BufferedReader br;
	static BufferedWriter bw;
	
	public static long gcd(long a,long b) {
		if(b==0) {
			return a;
		}
		else {
			return gcd(b,a%b);
		}
	}

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		 br =new BufferedReader(new InputStreamReader(System.in));
		 bw =new BufferedWriter(new OutputStreamWriter(System.out));
		 int num=Integer.parseInt(br.readLine());
		 for(int i=0;i<num;i++) {
		 StringTokenizer st=new StringTokenizer(br.readLine());
		 int n=Integer.parseInt(st.nextToken());
		 long [] arr=new long[n];
		 for(int j=0;j<n;j++) {
			 arr[j]=Integer.parseInt(st.nextToken());
		 }
		 long result=0;
		 for(int j=0;j<n-1;j++) {
			 for(int k=j+1;k<n;k++) {
				 result+=gcd(arr[j],arr[k]);
				 
			 }
		 }
		 System.out.println(result);
		 
		 }
	}
	}
