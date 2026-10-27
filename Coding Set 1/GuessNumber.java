import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int secret = (int)(Math.random() * 100) + 1;
        int guess = 0;

        System.out.println("Guess a number between 1 and 100");

        while (guess != secret) {

            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess > secret) {
                System.out.println("Too High!");
            } else if (guess < secret) {
                System.out.println("Too Low!");
            } else {
                System.out.println("Correct! You won!");
            }
        }

        sc.close();
    }
}
