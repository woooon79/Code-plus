package algorithm_basic_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 연속합 {
	static int[] nums;
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		 int num=Integer.parseInt(br.readLine());
		 nums=new int[num];
		 
		 StringTokenizer st=new StringTokenizer(br.readLine());
		 for(int i=0;i<num;i++) {
			 nums[i]=Integer.parseInt(st.nextToken());
		 }
		 
		 int[] result=new int[num];
		 //i번쨰값이 마지막값일때 이전값과 연속 또는 연속되지 않았을떄 최대값
		 //연속되지 않았다는 것은 자기자신값만 의미
		 
		 result[0]=nums[0];
		 
		 for(int i=1;i<num;i++) {
			 
			 if(result[i-1]+nums[i]>nums[i]) {
				 result[i]=result[i-1]+nums[i];
			 }
			 else {
				 result[i]=nums[i];
			 }
		 }
		 
		 
		 int max=result[0];
		 for(int i=0;i<num;i++) {
			 if(result[i]>max)
				 max=result[i];
		 }
		 
		 System.out.print(max);
		
	}
}
