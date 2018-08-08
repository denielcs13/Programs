import java.util.*;
 
class Ideone {
 
    public static void main(String args[] ) throws Exception {
 
        Scanner s = new Scanner(System.in);
 
        int t=s.nextInt();
        while(t>0){
            t--;
            int n= s.nextInt();
            int k=s.nextInt();
            long[] arr = new long[n];
            for(int i=0; i<n; i++){
            	arr[i]=s.nextLong();
            }
            long MS[] = new long[n];
            MS[n - 1] = arr[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                if (i + k + 1 >= n)
                    MS[i] = Math.max(arr[i], MS[i + 1]);
                else
                    MS[i] = Math.max(arr[i] + MS[i + k + 1],
                                    MS[i + 1]);
            }
            System.out.println(MS[0]);
        }
        s.close();
    }
}