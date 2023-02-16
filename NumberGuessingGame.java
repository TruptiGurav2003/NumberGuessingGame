package simple;

import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args)
    {
        int attempt=1;
        int userGuessNumber=0;
        int secretNumber=(int)(Math.random() * 99 +1);
        Scanner userInput=new Scanner(System.in);
        System.out.println("Welcome to number guessing game");
        do {

            System.out.println("Enter a guess number between 1 to 100\n");

            if(userInput.hasNextInt())
            {
                userGuessNumber=userInput.nextInt();
                if(userGuessNumber==secretNumber)
                {
                    System.out.println("Congrats !!!! You win");
                    break;
                }
                else if(userGuessNumber < secretNumber)
                    System.out.println(" Your guess Number is smaller");
                else if(userGuessNumber > secretNumber)
                    System.out.println("Your Guess number is greater");
                if(attempt==10)
                {
                    System.out.println("You have exceeded the maximum attempt . Try Again");
                    break;
                }
                attempt++;
            }
            else{
                System.out.println("Enter a valid Integer Number");
                break;
            }
        }
        while(userGuessNumber!=secretNumber);
    }
}

