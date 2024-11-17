import java.util.*;
class TotalBill {
    public static void main (String []arg){
        Scanner scan = new Scanner (System.in);
         int x = scan.nextInt();
         if(x<0){
             System.out.println("invalid input");
             return  ;
         }
         int numberOfUnits=0;
         float pricePerUnits=0.0f;
         double discount=0.0; 
         float total=0.0f;
         for(int i = 0 ; i < x ; i++){
           numberOfUnits = scan.nextInt();
           if(numberOfUnits < 0 ) {
            System.out.println("invalid input");
            return  ;
           }
           pricePerUnits = scan.nextFloat();
           if(pricePerUnits < 0 ) {
            System.out.println("invalid input");
            return  ;
           }
           discount = scan.nextDouble();
             if(discount < 0 || discount > 1 ) {
            System.out.println("invalid input");
            return ;
           }
           
           if(discount > 0){
           total += (numberOfUnits*pricePerUnits ) - numberOfUnits*(pricePerUnits*discount);     
           }
          else total += numberOfUnits*pricePerUnits;
         }
         System.out.println(total);
    } 
}
