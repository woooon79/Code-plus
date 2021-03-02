package algorithm_basic_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ������ {
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
		 //i�������� ���������϶� �������� ���� �Ǵ� ���ӵ��� �ʾ����� �ִ밪
		 //���ӵ��� �ʾҴٴ� ���� �ڱ��ڽŰ��� �ǹ�
		 
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
