import java.util.Scanner;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int min = 0;
        int max = 10;
        int guess = 0;
        String trash = "";
        int random = (int)Math.floor(Math.random()*(max-min+1)+min);


        System.out.print("\nGuess a number between 1 and 10: ");
        if(in.hasNextInt())
        {
            guess = in.nextInt();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("\nRun the program again and enter a valid input! " + trash + " Is a bad input!");
            System.exit(0);
        }

        if (guess >= 1 && guess <= 10)
        {
            if(guess == random)
            {
                System.out.println("\nYou guessed the number!");
            }
            else if (guess < random)
            {
                System.out.println("\nYour guess was too low.");
            }
            else if(guess > random)
            {
                System.out.println("\nYour guess was too High.");
            }
        }
        else if (guess < 1)
        {
            System.out.println("\nRun the program again and enter a valid input! " + guess + " Is a bad input!");
            System.exit(0);
        }
        else if (guess > 10)
        {
            System.out.println("\nRun the program again and enter a valid input! " + guess + " Is a bad input!");
            System.exit(0);
        }
    }
}