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
		int b = sc.nextInt();
		int c = sc.nextInt();
		double d = Math.sqrt((b*b-4*a*c));
		double x1 = (d-b)/(2*a);
		double x2 = (-d-b)/(2*a);
		System.out.println(x1);
		System.out.print(x2);
	}
}