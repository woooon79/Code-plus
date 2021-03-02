package algorithm_basic_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ¥ı«œ±‚_9095 {
	static int[] d;
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		 int num=Integer.parseInt(br.readLine());
		 d=new int[11];
		 d[1]=1;
		 d[2]=2;
		 d[3]=4;
		 for(int i=4;i<11;i++) {
			 d[i]=d[i-1]+d[i-2]+d[i-3];
		 }
		 for(int i=0;i<num;i++) {
			 
			 int n=Integer.parseInt(br.readLine());
			 
			 System.out.println(d[n]);
			 
		 }
		 
		 
	}
}
