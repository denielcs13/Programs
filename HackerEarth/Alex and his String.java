import java.util.*;


public class Lexo {
    public static void main(String args[] ) throws Exception {
    
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        StringBuilder sb = new StringBuilder(str);
        int[] intArr = new int[26];
        for(int i=0;i<26;i++){
        	intArr[i]=0;
        }
        int k = s.nextInt();
        for(int i=0;i<k;i++){
        	intArr[(int)sb.charAt(0)-(int)'a']++;
        	sb.deleteCharAt(0);
        }
        while(sb.length()>0){
        	for(int i=0;i<26;i++){
        		if(intArr[i]>0){
        			System.out.print((char)(i+97));
        			intArr[i]--;
        			break;
        		}
        	}
        	intArr[sb.charAt(0)-'a']++;
    		sb.deleteCharAt(0);
        }
        for(int i=0;i<26;i++){
        	for(int j=0;j<intArr[i];j++){
        		System.out.print((char)(i+97));
        	}
        }
        s.close();
    }
}