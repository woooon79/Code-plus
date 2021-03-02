package algorithm_basic_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ≈∏¿œ∏µ {
static int[] d;
public static void main(String[] args)throws IOException {
	// TODO Auto-generated method stub
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
	 int num=Integer.parseInt(br.readLine());
	 d=new int[1001];
	 d[1]=1;
	 d[2]=3;
	 for(int i=3;i<=num;i++) {
		 d[i]=d[i-1]+d[i-2]*2;
		 d[i]%=10007;
	 }
	 System.out.println(d[num]);
}
}
