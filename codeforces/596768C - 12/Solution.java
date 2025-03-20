import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        String s = in.next();
        
        int[][] dp = new int[n][4];
        
        for (int d = 0; d < 4; d++) {
            dp[0][d] = (s.charAt(0) == "NESW".charAt(d)) ? 1 : 0;
        }
        
        for (int i = 1; i < n; i++) {
            for (int curr = 0; curr < 4; curr++) { 
                int prev1 = (curr + 1) % 4;
                int prev2 = (curr + 3) % 4; 
                dp[i][curr] = Math.max(dp[i-1][prev1], dp[i-1][prev2]) + 
                             ((s.charAt(i) == "NESW".charAt(curr)) ? 1 : 0);
            }
        }
        
        int mx = 0;
        for (int d = 0; d < 4; d++) {
            mx = Math.max(mx, dp[n-1][d]);
        }
        
        System.out.println(mx);
 
    }
}
