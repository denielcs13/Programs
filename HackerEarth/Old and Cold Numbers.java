

import java.util.Scanner;

class OldCold {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        while(t>0){
            t--;
            int n = s.nextInt();
            int Odd[] = new int[n+1];
            int Even[] = new int[n+1];
            Odd[0] = 0;
            Even[0] = 0;
            for(int i=1;i<=n;i++){
                int num = s.nextInt();
                if(num==1){
                    Even[i] = Even[i-1] + 1;
                    Odd[i] = Odd[i-1];
                }else if(num%2==0){
                    Even[i] = Even[i-1] + 1;
                    Odd[i] = Odd[i-1];
                }else{
                    Even[i] = Even[i-1];
                    Odd[i] = Odd[i-1] + 1;
                }
            }

            int q= s.nextInt();

            while(q>0){
                q--;
                int l= s.nextInt();
                int r= s.nextInt();
                int diff = (Odd[r]-Odd[l-1])-(Even[r]-Even[l-1]);
                if(diff>0){
                    if(diff%2==0){
                        System.out.println(diff/2);
                    }else{
                        System.out.println((diff+1)/2);
                    }
                }else{
                    System.out.println(0);
                }
            }
        }

    }
}
