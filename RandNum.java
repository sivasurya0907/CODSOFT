import java.util.*;

class Main {
    public static void main(String args[])
     {
        Scanner sc = new Scanner(System.in);
        Random random = new Random(); // To Create a random number in backend
         System.out.println("Welcome! Start the game");
        while (true) { 
            // Infinite loop to allow playing again
            int randomNumber = random.nextInt(100) + 1; //Setting the limit of the random number from 1 to 100

            int maxAttempts = 10; //Maximum number of attempts
            int yourAttempt = 0; 

            while (yourAttempt < maxAttempts) {
                System.out.print("Enter a random number from 1 to 100:");
                int enteredNum = sc.nextInt();
                
                if (enteredNum == randomNumber) {
                    System.out.println("Wow! Congrats, your guess is correct");
                    break; // Exit the inner loop if the guess is correct
                } else if (enteredNum < randomNumber) {
                    System.out.println("Sorry, your guess is too low. Try again");
                } else {
                    System.out.println("Sorry, your guess is too high. Try again");
                }

                yourAttempt += 1;
            }

            if (yourAttempt == maxAttempts) {
                System.out.println("Sorry, you have reached your limit. Better luck next time");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = sc.next().toLowerCase();

            if (!playAgain.equals("yes")) {
                break; // Exit the outer loop if the user doesn't want to play again
            }
        }

        sc.close();
    }
}
