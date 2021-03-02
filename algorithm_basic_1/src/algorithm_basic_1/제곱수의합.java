package algorithm_basic_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Á¦°ö¼öÀÇÇÕ {
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		 int num=Integer.parseInt(br.readLine());
		 int result;
		 
		 
		 int[] d=new int[num+1];
		 d[1]=1;
		 
		 for(int i=2;i<=num;i++) {
			 int sqrt =(int)(Math.pow(i,0.5));
			 int min=i;
			 for(int j=1;j<=sqrt;j++) {
			      int tmp=(int)Math.pow(j, 2);
			      if(min>d[i-tmp])
			          min=d[i-tmp];
			 }
			 d[i]=min+1;
		 }
		 
		 System.out.println();
		 System.out.print(d[num]);
		 
	}
}
