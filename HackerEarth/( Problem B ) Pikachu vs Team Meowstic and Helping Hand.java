import java.util.*;

public class B {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n= s.nextInt();
		long k= s.nextLong();
		long[] a= new long[n];
		long[] b = new long[n];
		long[] c = new long[n];
		for(int i=0; i<n; i++){
			a[i]=s.nextLong();
		}
		for(int j=0; j<k; j++){
			b[0]=a[0];
			for (int i=0; i<n; i++)
	            c[i] = a[i];
			for(int i=1; i<n; i++){
				b[i]=a[i-1]|a[i];
			}
			if(Arrays.equals(b, c)){
				break;
			}
			for (int i=0; i<n; i++)
	            a[i] = b[i];
		}
		for(int i=0; i<n; i++){
			System.out.print(a[i]+" ");
		}
		s.close();
	}
}