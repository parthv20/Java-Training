package javatraining.Corejavaassignment2parthchavan;


import java.util.Scanner;
import java.util.Stack;

public class sortstack1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

       
        System.out.println("Enter integers to push onto the stack (enter 0 to stop):");
        int input = scanner.nextInt();
        while (input != 0) {
            stack.push(input);
            input = scanner.nextInt();
        }

        sortStack(stack);

        System.out.println("\nStack after sorting:");
        printStack(stack);

        scanner.close();
    }

   
    public static void sortStack(Stack<Integer> stack) {
        Stack<Integer> demoStack = new Stack<>();

        while (!stack.isEmpty()) {
            int demo = stack.pop();

            // Move elements from demoStack to stack which are greater than demo
            while (!demoStack.isEmpty() && demoStack.peek() > demo) {
                stack.push(demoStack.pop());
            }

            demoStack.push(demo);
        }

     
        while (!demoStack.isEmpty()) {
            stack.push(demoStack.pop());
        }
    }

    
    public static void printStack(Stack<Integer> stack) {
        for (Integer value : stack) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}