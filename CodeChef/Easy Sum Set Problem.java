

import java.util.*;

public class EasySumSetProblem {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        
        int A = s.nextInt();
        List<Integer> a = new ArrayList<>();
        for(int i=0; i<A; i++){
        	a.add(s.nextInt());
        }
        int C = s.nextInt();
        List<Integer> c = new ArrayList<>();
        for(int i=0; i<C; i++){
        	c.add(s.nextInt());
        }
        int [] myarray = new int[101];
        Arrays.fill(myarray, 0);
        
        for(Integer x:c){
        	for(Integer y: a){
        		if(x-y>=0){
        			myarray[x-y]+=1;
        		}
        	}
        }
          for(int i=1; i<101; i++){
        	  if(myarray[i]==A){
        		  System.out.print(i+" ");
        	  }
          }
        s.close();

    }
}
