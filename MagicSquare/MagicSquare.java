import java.util.*;
public class MagicSquare {
    public static void main (String [] args){
    Scanner scan = new Scanner(System.in);
    int diagSum = 0, diagSum2 =0 ;
    int test=0;
    int matrixSize = scan.nextInt();
    if ( matrixSize <= 1  ){
        System.out.println("invalid size"); return ;
    }
    int [][]matrix = new int [matrixSize][matrixSize];
    int []rowSum = new int[matrixSize];
    int []colSum = new int[matrixSize];
      for(int i = 0 ;i<matrixSize;i++){
          for(int j =0 ; j<matrixSize ;j ++){
              matrix[i][j] = scan.nextInt();
              rowSum[i] +=matrix[i][j];
              colSum[i] +=matrix[i][j];
               if(i == j ){
               diagSum+=matrix[i][j];
                 }
                if(i+j == matrixSize-1 ){
               diagSum2+=matrix[i][j];
                }
          }
      }
      test = rowSum[0];
      for(int i = 0 ; i< matrixSize ;i++){
          if(test !=diagSum2 || test!= diagSum ){
                     System.out.println("not magic square");
                     return ;
                }
                if(test != rowSum[i] ||test!= colSum[i] ){
                     System.out.println("not magic square");
                     return ;
                }
       }
      System.out.println("magic square");
    }
}
