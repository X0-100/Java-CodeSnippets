/* Matching String Code Snippet  */

import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        String str = "Today Is A good day, Today Is MOnday";
        
        String [] arr  = str.split(" ");
        String to_match = "day";
        int count = 0 ;
        
        for(String splitcheck : arr){
            if(splitcheck.contains("day")){
                count = count + 1;
            }
        }
        
        System.out.println(count + "  - Times day Occured in String - " + str);
        
    }
}

/* Catch : String Split returns Array of String */