

import java.util.*;

public class StackOperation {

    @SuppressWarnings("resource")
	public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        
        long n = s.nextLong();
        long k =s.nextLong();
        
        if(n==1 && k%2==1){
        	System.out.println(-1);
        	return;
        }
        long max=s.nextLong();
        for(int i=1; i<k-1 && i<n; i++){
        	long temp=s.nextLong();
        	if(temp>max)
        		max=temp;
        }
        long temp1=0;
        if(n>k+1){
        	temp1= s.nextLong();
        	temp1=s.nextLong();
        }
        if(max>=temp1)
        	System.out.println(max);
        else
        	System.out.println(temp1);
        s.close();

    }
}
