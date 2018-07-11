import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
		String msg = s.next();
		int k = s.nextInt();
		int k1= k;
		int c = 0;
		for(int i=0; i<msg.length(); i++){
			c=(int) msg.charAt(i);
			if(c>47 && c<58){
				k%=10;
				c+=k;
				if(c>57){
					c-=10;
				}
				k=k1;
			}
			if(c>64 && c<91){
				k%=26;
				c+=k;
				if(c>90){
					c-=26;
				}
				k=k1;
			}
			if(c>96 && c<123){
				k%=26;
				c+=k;
				if(c>122){
					c-=26;
				}
				k=k1;
			}
			System.out.print((char)c);
		}
		s.close();
    }
}
