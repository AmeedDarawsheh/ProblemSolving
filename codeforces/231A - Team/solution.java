import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int check = 0 ;
        int matrix[][]=new int [x][3];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = scan.nextInt(); // Read user input
            }
        }
        for (int i = 0; i < x; i++) {
                if((matrix[i][0]+matrix[i][1]+matrix[i][2])>1){
                    check++;
            }
            else continue;
        }
        System.out.println(check);
    }
}
