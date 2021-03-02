package algorithm_basic_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ½ºÆ¼Ä¿ {
	static int[] nums;
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		 int tnum=Integer.parseInt(br.readLine());
		 for(int i=0;i<tnum;i++) {
			 int col=Integer.parseInt(br.readLine());
			 int[][] map=new int[3][col+1];
			 for(int k=1;k<=2;k++) {
				 StringTokenizer st=new StringTokenizer(br.readLine());
				 for(int p=1;p<=col;p++) {
					 map[k][p]=Integer.parseInt(st.nextToken());
				 }
			 }
			 
			 int[][] d=new int[col+1][3];
			 
			 d[1][0]=0;
			 d[1][1]=map[1][1];
			 d[1][2]=map[2][1];
			 
			 
			 for(int k=2;k<=col;k++) {
					 
					 int max=d[k-1][0];
					 if(max<d[k-1][1])
						 max=d[k-1][1];

					 
					 
					 d[k][0]=Math.max(max, d[k-1][2]);
					 d[k][1]=Math.max(d[k-1][0],d[k-1][2])+map[1][k];
					 d[k][2]=Math.max(d[k-1][1],d[k-1][0])+map[2][k];
					
			 }
			 
			 int max=0;
			 max=d[col][0];
			 if(max<d[col][1])
				 max=d[col][1];
			 if(max<d[col][2])
				 max=d[col][2];
			 
			 System.out.println(max);
		 }
	}
}
