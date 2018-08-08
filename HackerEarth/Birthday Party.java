
import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i=0;i<t; i++){
            int n = s.nextInt();
            int m = s. nextInt();
            if(m%n==0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }


    }
}
