package JavaAssignment3;


import java.util.ArrayList;
import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(n);
        for(int i=1;i<=n;i++){
            arr.add(i);
        }
        for(int i=1;i<arr.size();i++){
            int ludic = arr.get(i);

            for(int toRemove = ludic+i; toRemove < arr.size(); toRemove+=ludic-1)
                arr.remove(toRemove);
        }
        System.out.println(arr);
    }
}