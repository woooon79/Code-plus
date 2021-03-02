package algorithm_basic_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Á¤¼ö»ï°¢Çü {
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		 int num=Integer.parseInt(br.readLine());
		 int[][] map=new int[num+1][num+1];
		 int[][] d=new int[num+1][num+1];
		 
		 for(int i=1;i<=num;i++) {
			 StringTokenizer st=new StringTokenizer(br.readLine());
			 for(int j=1;j<=i;j++) {
				 map[i][j]=Integer.parseInt(st.nextToken());
			 }
		 }
		 
		 d[1][1]=map[1][1];
		 
		 for(int i=2;i<=num;i++) {
			 for(int j=1;j<=i;j++) {
				 
				 if(j>1&&j<i)
				d[i][j]=Math.max(d[i-1][j-1],d[i-1][j])+map[i][j];
				 else if(j==1)
					 d[i][j]=d[i-1][j]+map[i][j];
				 else if(j==i)
					 d[i][j]=d[i-1][j-1]+map[i][j];
				
			 }
		 }
		 
		 int max=0;
		 for(int i=1;i<=num;i++) {
			 if(max<d[num][i])
				 max=d[num][i];
		 }
		 
		 System.out.println(max);
		 
	}
}
