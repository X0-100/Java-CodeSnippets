/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		while(n-- > 0){
	        int x = scanner.nextInt();
	        int y = scanner.nextInt();
	        int z = scanner.nextInt();
	    
	        int [] traverse = {x,y,z};
	    
	        Arrays.sort(traverse);  
	        
	        int second_max = 0;
	        
	        int nlength = traverse.length;
	    
    	    for(int i = nlength-2; i >= 0; i--){
    	        if(traverse[i]!=traverse[i-1]){
    	            second_max = traverse[i];
    	            break;
    	        }
    	    }
	    
	        System.out.println(second_max);
	    	    
		}
	
	}
}
