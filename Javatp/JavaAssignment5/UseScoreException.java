package JavaAssignment5;

import java.util.Scanner;

public class UseScoreException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueEnteringScores = true;

        while (continueEnteringScores) {
            try {
                System.out.print("Enter a test score (0-100): ");
                String input = scanner.nextLine().trim();

                int score = Integer.parseInt(input);

                if (score < 0 || score > 100) {
                    throw new ScoreException("The score must be >= 0 and <= 100");
                }

                System.out.println("That is a valid score.");

                System.out.print("Do you want to enter another score? (Yes/No): ");
                String response = scanner.nextLine().trim();

                if (!response.equalsIgnoreCase("Yes") && !response.equalsIgnoreCase("Y")) {
                    continueEnteringScores = false;
                }

            } catch (NumberFormatException e) {
                System.out.println("You must enter a number for the score!");

            } catch (ScoreException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Thank you for using the score entry system. Goodbye!");
        scanner.close();
    }
}