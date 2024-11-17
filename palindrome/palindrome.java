import java.util.*;
class palindrome{
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String [] words = text.trim().split("\\s+");
        for(int t = 0 ; t < words.length;t++){
            String text2=words[t].trim().replaceAll("[^a-zA-Z]","");
            String textTest = new StringBuilder(text2).reverse().toString();
        if(text2.equalsIgnoreCase(textTest))
            System.out.println(words[t]+" palindrome");
        else System.out.println(words[t]+" not palindrome");
        }
    }
}
