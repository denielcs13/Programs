/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a>=0 && a<10)
			System.out.print("1");
		else if(a>=10 && a<100)
			System.out.print("2");
		else if(a>=100 && a<1000)
			System.out.print("3");
		else
			System.out.print("More than 3 digits");
			
	}
}