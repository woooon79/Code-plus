package algorithm_basic_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ∞ÒµÂπŸ»Â∆ƒ∆ºº«_17103 {
	static BufferedReader br;
	static BufferedWriter bw;
	static int[] prime=new int[1000001];
	static boolean[] chk=new boolean[1000001];
	
	
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		 br =new BufferedReader(new InputStreamReader(System.in));
		 bw =new BufferedWriter(new OutputStreamWriter(System.out));
		
		 int num=Integer.parseInt(br.readLine());
		 int[] nums=new int[num];
		 int max=0;
		 for(int i=0;i<num;i++) {
			 nums[i]=Integer.parseInt(br.readLine());
			 if(max<nums[i])
				 max=nums[i];
		 }
		 
		 int pn=0;
		 for(int i=2;i<=max;i++) {
			 if(chk[i]==false) {
				 prime[pn++]=i;
				 for(int j=i*2;j<=max;j+=i) {
					 chk[j]=true;
				 }
			 }
		 }
		 
		 for(int i=0;i<num;i++) {
			 int result=0;
			 int tmp;
			 int j=0;
			 while((tmp=nums[i]-prime[j])>=0&&prime[j]<=nums[i]/2) {
				 
				 if(chk[tmp]==false) {
					 result++;
				 }
				 j++;
			 }
			 
			System.out.println(result);
		 }
		 

		 
		 
		 
		 
	}
}
