import java.util.Scanner;
 
public class Solution {
 
    public static void main(String[] args) {
   	
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        in.nextLine();
        for(int i = 0 ; i< x ; i++) {
        	String test = in.nextLine() ;
        	if(test.equalsIgnoreCase("yes")) {
        		
        		System.out.println("YES");
        	}
        	else System.out.println("NO");     	
        }               
    }
}
