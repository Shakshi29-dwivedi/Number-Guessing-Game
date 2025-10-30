package NumberGuessingGame;

    import java.util.*;

    public class NumberGuess {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Random guessed = new Random();

            int numberToGuess =  guessed.nextInt(100) + 1;
            int guess = 0;
            int attempts = 0;

            System.out.println("Guess the number between 1 and 100!");

            while (guess != numberToGuess) {
                System.out.print("Enter your guess: ");
                guess = input.nextInt();
                attempts++;

                if (guess < numberToGuess)
                    System.out.println("Too low!");
                else if (guess > numberToGuess)
                    System.out.println("Too high!");
                else
                    System.out.println("🎉 Correct! You guessed it in " + attempts + " tries.");
            }
        }
    }

