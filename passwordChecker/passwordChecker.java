import java.util.*;
public class Solution {
    public static void main(String[]args){
        Scanner scan= new Scanner(System.in);
        String pass= scan.nextLine().trim();
        String symbols="!@#$%^&*";
        int testx = 0,tests=0,testm=0,testw=0;
        if(pass.length()<6){ System.out.println("Invalid");
                           return;
        }      
        for(int i = 0; i < pass.length();i++){
            if(pass.length()>12){
                if(Character.isUpperCase(pass.charAt(i)) || Character.isLowerCase(pass.charAt(i)) || Character.isDigit(pass.charAt(i)) || symbols.indexOf(pass.charAt(i))>=0){
                    tests++;
                    }
            }
            else if (pass.length()<=12 && pass.length()>=9){
                    if(Character.isUpperCase(pass.charAt(i)) || Character.isLowerCase(pass.charAt(i)) || Character.isDigit(pass.charAt(i))){        
                       testm++;}
            }
            else if(pass.length()>=6 && pass.length()<=8){
                    if(Character.isUpperCase(pass.charAt(i)) || Character.isLowerCase(pass.charAt(i)) || Character.isDigit(pass.charAt(i)) || symbols.indexOf(pass.charAt(i))>=0){
                        testw++;
                    }               
            }            
        }
        if(tests!=0){
                 System.out.println("Strong");
        }
        else if(testm!=0){
                 System.out.println("Moderate");
        } 
        else if(testw!=0){
                 System.out.println("Weak");
        }
        else System.out.println("Invalid");        
    }
}
