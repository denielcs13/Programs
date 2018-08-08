
import java.io.*;
import java.util.Arrays;


class MaxSum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str= br.readLine();
		String[] strArr= str.split(" ");
		long[] arr = new long[n];
		for(int i=0; i<n; i++){
			arr[i]= Long.parseLong(strArr[i]);
		}
		Arrays.sort(arr);
		long a=0;
		long sum=0;
		long maxNeg=arr[0];
		for(int i=0; i<n; i++){
			if(arr[i]>=0){
				a+=1;
				sum+=arr[i];
			}
			else{
				if(arr[i]>maxNeg){
					maxNeg=arr[i];
				}
			}
		}
		if(sum==0 && a==0){
			System.out.println(maxNeg+" 1");
		}else{
			System.out.println(sum+" "+a);
		}
	}
}