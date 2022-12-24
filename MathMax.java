/*Problem
Chef took an examination two times. In the first attempt, he scored XX marks while in the second attempt he scored YY marks. According to the rules of the examination, the best score out of the two attempts will be considered as the final score.

Determine the final score of the Chef.

Input Format
The first line contains a single integer TT the number of test cases. Then the test cases follow.
The first line of each test case contains two integers XX and YY the marks scored by Chef in the first attempt and second attempt respectively.
Output Format
For each test case, output the final score of Chef in the examination.


*/


import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter Number Of Chefs ");
        int t = new Scanner(System.in).nextInt();
        int final_score = 0;
        while(t-- > 0){
            System.out.println("Enter Attempts  .. " + t);
            int x = new Scanner(System.in).nextInt();
            int y = new Scanner(System.in).nextInt();
            final_score = Math.max(x,y);
            System.out.println("final_score "+final_score);
        }
       
        
    }   
}

/* Catch : Simplest way to call NPE */