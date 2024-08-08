package JavaAssignment3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = sc.nextLine();

        ArrayList<String> arr = new ArrayList<>();

        String word="";
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)==' '){
                arr.add(word);
                word = "";
            }
            else{
                word = word + input.charAt(i);
            }
            if(i==input.length()-1){
                arr.add(word);
                break;
            }
        }
        for(int i=0;i<arr.size()/2;i++){
            Collections.swap(arr, i, arr.size()-1-i);
        }
        
        for(int i=1;i<arr.size()-1;i++){
            String prev = arr.get(i);
            String curr="";
            for(int j=prev.length()-1;j>=0;j--){
                curr = curr+prev.charAt(j);
            }
            arr.set(i, curr);
        }
        for(String x: arr){
            System.out.print(x+" ");
        }
    }
}