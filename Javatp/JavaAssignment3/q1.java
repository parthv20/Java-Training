package JavaAssignment3;




import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = sc.nextLine();
        char[] chars = input.toCharArray();
        StringBuffer hex = new StringBuffer();

        for (int i = 0; i < chars.length; i++) {
            hex.append(Integer.toHexString((int) chars[i]));
        }
        System.out.println(hex.toString());
        sc.close();
    }
}