package JavaAssignment7;


import java.util.Scanner;
import java.util.Stack;

/*
 
            1
            2
            .
            .
            .
        N	N-1	
        
        A 	B 	C


    move N-1 A --> B using C
    move Nth A --> C using B
    move N-1 B --> C using A

 */

public class Q4 {
    //Tower of Hanoi
    private static Stack<Integer> A;
    private static Stack<Integer> B;
    private static Stack<Integer> C;
    public static void main(String[] args) {
        A = new Stack<>();
        B = new Stack<>();
        C = new Stack<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of disks");
        int n = sc.nextInt();
        sc.close();

        for(int i=n;i>=1;i--){
            A.add(i);
        }
        
        towerOfHanoi(n,A,B,C);
    }
    private static void towerOfHanoi(int n, Stack<Integer> src, Stack<Integer> aux, Stack<Integer> dest){
        if(n==0){
            return;
        }
        towerOfHanoi(n-1, src, dest, aux);
        int disk = src.pop();
        dest.add(disk);
        System.out.println("Disk " + disk + " from " + getName(src) + " to " + getName(dest));
        towerOfHanoi(n-1, aux, src, dest);
    }

    private static String getName(Stack<Integer> rod){
        if(rod == A)return "A";
        if(rod == B)return "B";
        if(rod == C)return "C";
        return "";
    }
}