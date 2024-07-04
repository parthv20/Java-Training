package JavaAssignment1;
import java.util.Scanner ;
public class q1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number  :");
        int num1 =  scanner.nextInt();

        System.out.println("Enter the second number  :");
        int num2 =  scanner.nextInt();

        if(num1 > num2){
            System.out.println("num1 is the larger number");
        }
        else if (num2 > num1){
            System.out.println("num2 is the larger number");
        }
        else {
            System.out.println("Bothe the numbvers are equal");
        }
         
        scanner.close();
    }
}