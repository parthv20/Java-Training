package javatraining.Corejavaassignment2parthchavan;

    
import java.util.Scanner;
  
public class q4 {
    
    
    // Function to calculate factorial
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    
    // Function to calculate binomial coefficient C(n, k)( As the ans required is (m+n-2)C(n-1))
    public static long comb(int n, int k) {
        if (k > n - k) {
            k = n - k; // C(n, k) = C(n, n-k)
        }
        
        long res = 1;
        for (int i = 0; i < k; i++) {
            res *= (n - i);
            res /= (i + 1);
        }
        
        return res;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine(); 
        
        while (T >0) {
            int M = scanner.nextInt();
            int N = scanner.nextInt();
            scanner.nextLine(); 
            

            int totalMoves = M + N - 2; // Total moves required to reach bottom-right from top-left
            int movesRight = N - 1; // Moves to the right
            long paths = comb(totalMoves, movesRight);
            
            System.out.println(paths);
        }
        
        scanner.close();
    }
}