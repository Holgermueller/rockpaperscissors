import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int num;
        String userChoice = "";
        String computerChoice = "";
        int userWins = 0;
        int computerWins = 0;

        while (true) {
            System.out.println("Welcome to Rock, Paper, and Scissors!");
            System.out.print("Please choose R)ock P)aper or S)cissors: ");

            userChoice = sc.nextLine();

            if (userChoice.equals("quit")) {
                break;
            }

            num = rand.nextInt(3);

            if (num == 0) {
                computerChoice = "R";
            } else if (num == 1) {
                computerChoice = "P";
            } else if (num == 2) {
                computerChoice = "S";
            }

            if (computerChoice.equals("S")) {
                System.out.println("The computer chose scissors.");
            }

            else if (computerChoice.equals("R")) {
                System.out.println("The computer chose rock.");
            }

            else if (computerChoice.equals("P")) {
                System.out.println("The computer chose paper.");
            }

            if (userChoice.equals("R") && computerChoice.equals("S")) {
                System.out.println("The user won!");
                userWins++;
                System.out.println("The score is: User wins: " + userWins + " / " + "Computer wins: " + computerWins);
            }

            else if (userChoice.equals("P") && computerChoice.equals("R")) {
                System.out.println("The user won!");
                userWins++;
                System.out.println("The score is: User wins: " + userWins + " / " + "Computer wins: " + computerWins);
            }

            else if (userChoice.equals("S") && computerChoice.equals("P")) {
                System.out.println(("The user won!"));
                userWins++;
                System.out.println("The score is: User wins: " + userWins + " / " + "Computer wins: " + computerWins);
            }

            else if (userChoice.equals("S") && computerChoice.equals("R")) {
                System.out.println("The computer won.");
                computerWins++;
                System.out.println("The score is: User wins: " + userWins + " / " + "Computer wins: " + computerWins);
            }

            else if (userChoice.equals("R") && computerChoice.equals("P")) {
                System.out.println("The computer won.");
                computerWins++;
                System.out.println("The score is: User wins: " + userWins + " / " + "Computer wins: " + computerWins);
            }

            else if (userChoice.equals("P") && computerChoice.equals("S")) {
                System.out.println("The computer won.");
                computerWins++;
                System.out.println("The score is: User wins: " + userWins + " / " + "Computer wins: " + computerWins);
            }

            else if (userChoice.equals((computerChoice))) {
                System.out.println("Tie!");
                System.out.println("The score is: User wins: " + userWins + " / " + "Computer wins: " + computerWins);
            }

            else if (!userChoice.equals("R") || !userChoice.equals("P") || !userChoice.equals("S")) {
                System.out.println("That is not an adequate choice. You forfeit. The computer wins.");
                System.out.println("The score is: User wins: " + userWins + " / " + "Computer wins: " + computerWins);
            }

        }

        System.out.println("Thank you for playing!");
        System.out.println("The final score is: User wins: " + userWins + " / " + "Computer wins: " + computerWins);
        System.out.println("Good bye!!");

    }
}
