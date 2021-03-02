package algorithm_basic_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class ¼û¹Ù²ÀÁú6_17087 {
	static BufferedReader br;
	static BufferedWriter bw;

	public static int gcd(int a,int b) {
		if(b==0)
			return a;
		else
			return gcd(b,a%b);
	}
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		 br =new BufferedReader(new InputStreamReader(System.in));
		 bw =new BufferedWriter(new OutputStreamWriter(System.out));
		 StringTokenizer st=new StringTokenizer(br.readLine());
		 int n=Integer.parseInt(st.nextToken());
		 int S=Integer.parseInt(st.nextToken());
		 
		 st=new StringTokenizer(br.readLine());
		 int result=Math.abs(S-Integer.parseInt(st.nextToken()));

		 for(int i=1;i<n;i++) {
			 int next=Math.abs(S-Integer.parseInt(st.nextToken()));
			 result=gcd(result,next);
		 }
		 System.out.println(result);
		
		 
	}
}
