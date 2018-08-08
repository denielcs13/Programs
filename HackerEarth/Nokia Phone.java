import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
 
        Scanner s = new Scanner(System.in);
 
        int t=s.nextInt();
        while(t>0){
            t--;
            int count=0;
            int p=0;
            char[] str=s.next().toCharArray();
            List<String> l1 = new ArrayList<>();
            l1.add(".,?!1");
            l1.add("abc2");
            l1.add("def3");
            l1.add("ghi4");
            l1.add("jkl5");
            l1.add("mno6");
            l1.add("pqrs7");
            l1.add("tuv8");
            l1.add("wxyz9");
            l1.add("_0");
            for(int i=0; i<str.length; i++){
                for(int j=0; j<10; j++){
                	String str1=l1.get(j);
                	if(j!=p && str1.contains(""+str[i])){
                		count++;
                	}
                	if(str1.contains(""+str[i])){
                		count+=str1.indexOf(str[i])+1;
                		p=j;
                	}
                }
            }
		    System.out.println(count);
        }
 
        s.close();
    }
}