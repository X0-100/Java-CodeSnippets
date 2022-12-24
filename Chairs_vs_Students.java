/* 


This year XX students joined his class and each student will require one chair to sit on. Chef already has YY chairs in his class. Determine the minimum number of new chairs Chef must buy so that every student is able to get one chair to sit on.


*/
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-- > 0){
		    int x = scanner.nextInt();
		    int y = scanner.nextInt();
		    int chairsrequired = x > y ? x - y : 0;
		    System.out.println(chairsrequired);
		}
	}
}
