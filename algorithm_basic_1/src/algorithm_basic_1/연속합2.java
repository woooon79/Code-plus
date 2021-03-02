package algorithm_basic_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ¿¬¼ÓÇÕ2 {
	static int[] nums;
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		 int num=Integer.parseInt(br.readLine());
		 nums=new int[num];
		 int[] d1=new int[num];
		 int[] d2=new int[num];
		 
		 StringTokenizer st=new StringTokenizer(br.readLine());

		 for(int i=0;i<num;i++) {
			 nums[i]=Integer.parseInt(st.nextToken());
		 }
		 
		 d1[0]=nums[0];
		 
		 
		 for(int i=1;i<num;i++) {
			d1[i]=nums[i];
			if(d1[i]<d1[i-1]+nums[i])
				d1[i]=d1[i-1]+nums[i];
		 }
		
		 for(int i=num-1;i>=0;i--) {

				d2[i]=nums[i];
				
				if(i+1<num) {

				if(d2[i]<d2[i+1]+nums[i])
					d2[i]=d2[i+1]+nums[i];
				}
				
		 }
		 
		 int max=0;
		 for(int i=0;i<num;i++) {
			 
			 if(i==0) {
				 max=d1[i];
				 if(i+1<num)
				 max=Math.max(d2[i+1],d1[i]);
				 continue;
			 }
			 if(i==num-1) {
				 if(max<Math.max(d1[i-1],d1[i]))
				     max=Math.max(d1[i-1],d1[i]);
				 break;
			 }
			 
			 if(max<Math.max(d1[i-1]+d2[i+1],d1[i]))
				 max=Math.max(d1[i-1]+d2[i+1],d1[i]);
		 }
		 

		 System.out.println(max);
	}
}
