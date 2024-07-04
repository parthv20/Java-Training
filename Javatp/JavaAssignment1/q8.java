package JavaAssignment1;

public class q8 {

    public static void main(String[] args) {
        System.out.println("Factorials from 1 to 20:");
 
        System.out.println("Number\tFactorial");
        for (int i = 1; i <= 20; i++) {
            long factorial = calculateFactorial(i);
            System.out.println(i + "\t" + factorial);
        }
    }
 
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long factorial = 1;
            for (int i = 2; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }