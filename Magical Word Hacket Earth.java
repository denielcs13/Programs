
import java.util.*;

class TestClass {
    
    	static boolean isPrime(int num){
		for(int i=2; i<=num/2; i++){
			if(num%i==0){
				return false;
			}
		}
		return true;
	}
	
	static String magicalWord(String str2){
		String magicWord = "";
		for(int i =0; i<str2.length(); i++){
			int c = (int) str2.charAt(i);
			if(c<65)
				c=65;
			if(c>90 && c<94)
				c=90;
			if(c>122)
				c=122;
			if(c>93 && c<97)
				c=97;
			boolean forward=false;
			boolean backward=false;
			int fc=c;
			int bc=c;
			if(isPrime(c))
				magicWord+=(char) c;
			else{
				while(true){
					fc+=1;
					bc-=1;
					if(fc==91)
						fc=90;
					if(fc==123)
						fc=122;
					if(bc==64)
						bc=65;
					if(bc==96)
						bc=97;
					if(isPrime(fc))
						forward=true;
					if(isPrime(bc))
						backward=true;
					if(forward && backward){
						magicWord+=(char) bc;
						break;
					}
					else if(forward){
						magicWord+=(char) fc;
						break;
					}
					else if(backward){
						magicWord+=(char) bc;
						break;
					}
				}
			}
		}
		return magicWord;
	}
    
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int testCase = s.nextInt();
        for(int i=0; i<testCase; i++){
        	int N = s.nextInt();
        	String str1 = s.next();
        	System.out.println(magicalWord(str1));
        }
        s.close();
        
    }
}