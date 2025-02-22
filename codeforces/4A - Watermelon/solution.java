import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputuser = input.nextInt();
        input.close();
        if (inputuser % 2 == 0 && inputuser > 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
