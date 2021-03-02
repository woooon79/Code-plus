package algorithm_basic_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 카드구매하기2 {
	static int[] p;
	static int[] d;
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		 int num=Integer.parseInt(br.readLine());
		 p=new int[num+1];
		 d=new int[num+1];
		 StringTokenizer st=new StringTokenizer(br.readLine());
		 for(int i=1;i<=num;i++) {
			 p[i]=Integer.parseInt(st.nextToken());
		 }
		 
		 d[0]=0;
		 for(int i=1;i<=num;i++) {
			 int min=10001;
			 for(int j=1;j<=i;j++) {
				 if(d[i-j]+p[j]<min)
				 min=d[i-j]+p[j];
			 }
			 d[i]=min;
		 }
		 
		
		 System.out.println(d[num]);
	}
}
