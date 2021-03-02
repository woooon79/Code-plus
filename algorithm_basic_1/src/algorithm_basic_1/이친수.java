package algorithm_basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*

public class 이친수 {﻿

﻿
	static long[][] d;
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		 int num=Integer.parseInt(br.readLine());
		 //[자릿수][맨마지막수=> 0또는 1]
		 d=new long[num+1][2];

		 d[1][0]=0;
		 d[1][1]=1;
		 for(int i=2;i<=num;i++) {
				//맨마지막수가 0 또는 1일때 경우를 나눠서 생각
				
			 d[i][1]=d[i-1][0];
			//맨 마지막수가 1일경우, 그 전의 수는 0밖에 올 수 없다. (1이 연속해서 두번올 수 없기 때문)
			 d[i][0]=d[i-1][1]+d[i-1][0];
 
		 }
		 
		 System.out.println(d[num][0]+d[num][1]);
	}
}
*/