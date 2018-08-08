import java.util.*;
 
public class Avg {
 
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] intArr = new int[n];
        for(int i=0;i<n;i++){
        	intArr[i]=s.nextInt();
        }
        Arrays.sort(intArr);
        float[] avgArr = new float[n];
        long sum=0;
        for(int i=1;i<=n;i++){
            sum+=intArr[i-1];
        	avgArr[i]=sum/i;
        }
        int t = s.nextInt();
        
        while(t>0){
        	t--;
        	int j;
        	long limit=s.nextLong();
        	if(limit==1){
        		System.out.println(0);
        		continue;
        	}
        	for(j=1; j<n+1; j++){
        	    sum+=intArr[j-1];
        	    double a= (double) sum/j;
        		if(a>=limit){
        		    break;
        		}
        	}
        	System.out.println(j-1);
        }
        s.close();
 
	}
 
}