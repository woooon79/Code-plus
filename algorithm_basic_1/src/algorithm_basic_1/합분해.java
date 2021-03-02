package algorithm_basic_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ÇÕºÐÇØ {
	static long[][] d;
	static long mod=1000000000;
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine());
		 int n=Integer.parseInt(st.nextToken());
		 int k=Integer.parseInt(st.nextToken());
		 d=new long[n+1][k+1];

		 for(int i=0;i<=n;i++) {
			 d[i][1]=1;
		 }
d[0][0]=1;
		 for(int i=1;i<=n;i++) {
			 for(int p=1;p<=k;p++) {
			 for(int j=0;j<=i;j++) {
				 d[i][p]+=d[i-j][p-1];
				 d[i][p]%=1000000000;
			 }
			 
			 }
		 }

			 System.out.println(d[n][k]);
			 
		 
		 
		 
	}
}
