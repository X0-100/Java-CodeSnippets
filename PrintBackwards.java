
import java.util.*;
class HelloWorld {
    static String get_solution(String[] problem, int n){
		
		String [] solution = new String[n];
		String solutionSTr = "";
		String appender = problem[n-1];
	
		for(int i = n-2; i >=0; i--){
			solution[i] = problem[i];
			solutionSTr = solutionSTr+solution[i];
		}
		return appender+solutionSTr;
	}
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		
		String t = scanner.next();
		String [] queuepool = t.split("");
		
		String returned_string = get_solution(queuepool, queuepool.length);
		
		System.out.println(returned_string);
		
	}
	    
}