import java.util.*;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		char[] s=sc.next().toCharArray();
		char[] t=sc.next().toCharArray();
		int[] S= new int[n];
		int[] T= new int[n];
		int sum=0;
		for(int i=0; i<n; i++){
			S[i]=s[i]-65;
			T[i]=t[i]-65;
		}
		for(int i=0; i<n; i++){
			sum+=(T[i]-S[i]>=0)?(T[i]-S[i]>=13?T[i]-S[i]-12:T[i]-S[i]):(T[i]-S[i]+26>=13?T[i]-S[i]+14:T[i]-S[i]+26);
		}
		System.out.println(sum);
		sc.close();
	}
}