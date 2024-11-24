import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String arg[]){
        Random random =new Random();
        Scanner scanner =new Scanner(System.in);
        int playAgain = 1;
        int totalScore = 0;
        while (playAgain == 1) {
            int numberToGuess = random.nextInt(100) +1;
            int attempts = 0;
            int maxAttempts = 10;
            System.out.println("Guess the number between 1 to 100");
            System.out.println("You have"+maxAttempts +"attempts");
            while (attempts < maxAttempts) {
                System.out.println("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;
                if (userGuess == numberToGuess) {
                    System.out.println("Congratulation! you guessed the number in" + attempts + "attempts");
                    totalScore += attempts;
                    break;
                }
                else if (userGuess < numberToGuess){
                    System.out.println("Tooo low! Try again");
                }
                    else{
                        System.out.println("Too high! Try again");
                    }
                }
                if(attempts==maxAttempts){
                    System.out.println("Sorry,you did not guess the number it was"+numberToGuess+" ");
                }
                System.out.println("Your total score is"+totalScore+" ");
                System.out.println("Play again?(1=yes,0=no):");
                playAgain=scanner.nextInt();
        }
        scanner.close();
    }
}