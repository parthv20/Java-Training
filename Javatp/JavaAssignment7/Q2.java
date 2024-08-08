package JavaAssignment7 ;


import java.util.Scanner;
import java.util.Stack;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = sc.nextLine().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        sc.close();

        System.out.println(checkPalin(input));
    }

    private static boolean checkPalin(String input){
        Stack<Character> st = new Stack<>();

        for(int i=0;i<input.length()/2;i++){
            st.add(input.charAt(i));
        }
        for(int i=(input.length()+1)/2;i<input.length();i++){
            char x = st.pop();
            if(x != input.charAt(i)){
                System.out.println(x + " " + input.charAt(i));
                return false;
            }
        }
        return true;
    }
}