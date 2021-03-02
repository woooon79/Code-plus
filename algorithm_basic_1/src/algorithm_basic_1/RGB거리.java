package algorithm_basic_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class RGB°Å¸® {
	static int[][] d;
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		 int num=Integer.parseInt(br.readLine());
		 int[][] cost=new int[num+1][3];
		 d=new int[num+1][3];
		 for(int i=1;i<=num;i++) {
			 StringTokenizer st=new StringTokenizer(br.readLine());
			 for(int j=0;j<3;j++) {
				 cost[i][j]=Integer.parseInt(st.nextToken());
			 }
		 }

		 
		 for(int i=1;i<=num;i++) {
			 
				 d[i][0]=Math.min(d[i-1][1]+cost[i][0],d[i-1][2]+cost[i][0] );
				 d[i][1]=Math.min(d[i-1][0]+cost[i][1],d[i-1][2]+cost[i][1] );
				 d[i][2]=Math.min(d[i-1][0]+cost[i][2],d[i-1][1]+cost[i][2] );
			 
		 }
		 int min=d[num][0];
		 if(d[num][0]>d[num][1])
			 min=d[num][1];
		 if(min>d[num][2])
			 min=d[num][2];
		 
		 System.out.println(min);
		 
	}
}
