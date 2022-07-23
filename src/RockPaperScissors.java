import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
  public static final String TEXT_RESET = "\u001B[0m";
  public static final String TEXT_GREEN = "\u001B[32m";
  public static final String TEXT_YELLOW = "\u001B[33m";
  public static final String TEXT_RED = "\u001B[31m";
  public static final String TEXT_CYAN = "\u001B[36m";
  public static final String TEXT_WHITE = "\u001B[37m";
  public static final String TEXT_BLUE = "\u001B[34m";
  public static final String TEXT_PURPLE = "\u001B[35m";

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    int num;
    String userChoice = "";
    String computerChoice = "";
    int userWins = 0;
    int computerWins = 0;

    while (true) {
      System.out.println(TEXT_GREEN + "Welcome to Rock, Paper, and Scissors!" + TEXT_RESET);
      System.out.println(TEXT_BLUE + "If you want to exit the game, type QUIT" + TEXT_RESET);
      System.out.println(TEXT_PURPLE + "Remember to type your choices with capital letters!" + TEXT_RESET);
      System.out.print(TEXT_YELLOW + "Please choose R)ock P)aper or S)cissors: " + TEXT_RESET);

      userChoice = sc.nextLine();

      if (userChoice.equals("QUIT")) {
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
        System.out.println(TEXT_YELLOW + "The computer chose scissors." + TEXT_RESET);
      }

      else if (computerChoice.equals("R")) {
        System.out.println(TEXT_YELLOW + "The computer chose rock." + TEXT_RESET);
      }

      else if (computerChoice.equals("P")) {
        System.out.println(TEXT_YELLOW + "The computer chose paper." + TEXT_RESET);
      }

      if (userChoice.equals("R") && computerChoice.equals("S")) {
        System.out.println(TEXT_BLUE + "The user won!" + TEXT_RESET);
        userWins++;
        System.out.println(
            TEXT_WHITE + "The score is: User wins: " + TEXT_RESET + TEXT_YELLOW + userWins + TEXT_RESET + TEXT_WHITE
                + " / Computer wins: " + TEXT_RESET + TEXT_YELLOW + computerWins + TEXT_RESET);
      }

      else if (userChoice.equals("P") && computerChoice.equals("R")) {
        System.out.println(TEXT_BLUE + "The user won!" + TEXT_RESET);
        userWins++;
        System.out.println(
            TEXT_WHITE + "The score is: User wins: " + TEXT_RESET + TEXT_YELLOW + userWins + TEXT_RESET + TEXT_WHITE
                + " / Computer wins: " + TEXT_RESET + TEXT_YELLOW + computerWins + TEXT_RESET);
      }

      else if (userChoice.equals("S") && computerChoice.equals("P")) {
        System.out.println(TEXT_BLUE + "The user won!" + TEXT_RESET);
        userWins++;
        System.out.println(
            TEXT_WHITE + "The score is: User wins: " + TEXT_RESET + TEXT_YELLOW + userWins + TEXT_RESET + TEXT_WHITE
                + " / Computer wins: " + TEXT_RESET + TEXT_YELLOW + computerWins + TEXT_RESET);
      }

      else if (userChoice.equals("S") && computerChoice.equals("R")) {
        System.out.println(TEXT_RED + "The computer won." + TEXT_RESET);
        computerWins++;
        System.out.println(
            TEXT_WHITE + "The score is: User wins: " + TEXT_RESET + TEXT_YELLOW + userWins + TEXT_RESET + TEXT_WHITE
                + " / Computer wins: " + TEXT_RESET + TEXT_YELLOW + computerWins + TEXT_RESET);
      }

      else if (userChoice.equals("R") && computerChoice.equals("P")) {
        System.out.println(TEXT_RED + "The computer won." + TEXT_RESET);
        computerWins++;
        System.out.println(
            TEXT_WHITE + "The score is: User wins: " + TEXT_RESET + TEXT_YELLOW + userWins + TEXT_RESET + TEXT_WHITE
                + " / Computer wins: " + TEXT_RESET + TEXT_YELLOW + computerWins + TEXT_RESET);
      }

      else if (userChoice.equals("P") && computerChoice.equals("S")) {
        System.out.println(TEXT_RED + "The computer won." + TEXT_RESET);
        computerWins++;
        System.out.println(
            TEXT_WHITE + "The score is: User wins: " + TEXT_RESET + TEXT_YELLOW + userWins + TEXT_RESET + TEXT_WHITE
                + " / Computer wins: " + TEXT_RESET + TEXT_YELLOW + computerWins + TEXT_RESET);
      }

      else if (userChoice.equals((computerChoice))) {
        System.out.println(TEXT_RED + "Tie!" + TEXT_RESET);
        System.out.println(
            TEXT_WHITE + "The score is: User wins: " + TEXT_RESET + TEXT_YELLOW + userWins + TEXT_RESET + TEXT_WHITE
                + " / Computer wins: " + TEXT_RESET + TEXT_YELLOW + computerWins + TEXT_RESET);
      }

      else if (!userChoice.equals("R") || !userChoice.equals("P") || !userChoice.equals("S")) {
        System.out.println(TEXT_RED + "That is not an adequate choice. You forfeit. The computer wins." + TEXT_RESET);
        computerWins++;
        System.out.println(
            TEXT_WHITE + "The score is: User wins: " + TEXT_RESET + TEXT_YELLOW + userWins + TEXT_RESET + TEXT_WHITE
                + " / Computer wins: " + TEXT_RESET + TEXT_YELLOW + computerWins + TEXT_RESET);
      }

    }

    System.out.println(TEXT_CYAN + "Thank you for playing!" + TEXT_RESET);
    System.out.println(TEXT_WHITE + "The final score is: User wins: " + TEXT_RESET + TEXT_YELLOW + userWins + TEXT_RESET
        + TEXT_WHITE + " /  Computer wins: " + TEXT_RESET + TEXT_YELLOW + computerWins + TEXT_RESET);
    System.out.println(TEXT_CYAN + "Good bye!!" + TEXT_RESET);

  }
}
