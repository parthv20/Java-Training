package javatraining.Corejavatest1parthchavan;

import java.util.Scanner;

public class Pallindromeinsertion2 {

    public static int minInsertionsToPalindrome(String str) {
    int[] charCount = new int[26] ;

    // Count frequency of each character
    for (char c : str.toCharArray()) {
        charCount[c - 'a']++;
    }

    int oddCount = 0;

    // Count characters with odd frequencies
    for (int count : charCount) {
        if (count % 2 != 0) {
            oddCount++;
        }
    }

    // Minimum insertions needed
    return Math.max(0, oddCount - 1);
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = scanner.nextLine();

        int minInsertions = minInsertionsToPalindrome(str);
        System.out.println("Minimum insertions to make the string a palindrome: " + minInsertions);

        scanner.close();
}
}
