import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int count=0;
        for(int i=2; i<=N; i++){
            for(int j=1;j<=i/2;j++){
                if(i%j==0)
                    count+=1;
            }
            if(count==1)
                System.out.print(i + " ");
            count=0;   
        }
        
    }
}