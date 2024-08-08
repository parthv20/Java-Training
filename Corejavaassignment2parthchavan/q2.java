package javatraining.Corejavaassignment2parthchavan;

import java.util.Scanner;


public class q2 {

//     public static int largestPrefixSuffix(String str) {

//     int n = str.length(); 
  
    
//     if (n < 2) { 
//         return 0; 
//     } 

   
//     int len = 0; 
    
//     int i = 0; 

    
//     while (i < n / 2) { 
//         int j1 = 0, j2 = (n - 1) - i; 
//         boolean isPrefixSuffix = true; 

       
//         while (j1 <= i) { 

//             if (str.charAt(j1) != str.charAt(j2)) { 
//                 isPrefixSuffix = false; 
//             } 
//             j1++; 
//             j2++; 
//         }  
//         i++; 
//         if()
//     } 
       
//     return len=i+1; 
// }
// public static void main(String[] args) 
//     { 

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the String");
//        String str = scanner.nextLine();
//         System.out.println(largestPrefixSuffix(str)); 

//         scanner.close();
//     } 
   
public static int largestPrefixSuffix(String str) {
    int n = str.length();

    if (n < 2) {
        return 0;
    }

    int len = 0; int i=0;

   while(i<n/2){
   
        int j1 = 0, j2 = (n - 1) - i;
        boolean isPrefixSuffix = true;

        while (j1 <= i) {
            if (str.charAt(j1) != str.charAt(j2)) {
                isPrefixSuffix = false;
                break;
            }
            j1++;
            j2++;
        }

        if (isPrefixSuffix) {
            len = i + 1;
        }
        i++;
    }
   

    return len;




}


public static void main(String[] args) 
    { 

       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the String");
       String str = scanner.nextLine();
        System.out.println(largestPrefixSuffix(str)); 

        scanner.close();
    }
}

