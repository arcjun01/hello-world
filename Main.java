import java.util.Scanner;

public class Main {
  public static void main(String[] args) 
  {
    // Scanner to receive the input
    Scanner scanner = new Scanner(System.in);

    // Prompts the user to enter a message
    System.out.println("Please input a message: ");
    String message = scanner.nextLine();

    // Prompts the user to enter a number
    System.out.println("Please input a number: ");
    int number = scanner.nextInt();

    // calling the repeatMessage method
    // call the parameters here from the repeatMessage method
    repeatMessage(message, number);
  }

  // method that repeats the message the given number of times
  public static void repeatMessage(String message, int number)   {
    for (int i = 0; i < number; i++) 
    {
      System.out.println(message);
    }
  }
}