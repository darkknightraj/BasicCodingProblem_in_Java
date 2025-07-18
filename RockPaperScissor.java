import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"rock","paper","scissors"};
        String playerchoice;
        String computerchoice;
        String playagain = "yes";
        do {
            System.out.print("Enter your move (rock,paper ,scissors ) : ");
            playerchoice = sc.nextLine().toLowerCase();
            if (!playerchoice.equals("rock") &&
                    !playerchoice.equals("paper") &&
                    !playerchoice.equals("scissors")) {
                System.out.println("Invalid choice ");
                continue;
            }
            computerchoice = choices[random.nextInt(3)];
            System.out.println("Computer choice : " + computerchoice);

            if (playerchoice.equals(computerchoice)) {
                System.out.println("Its tie");
            } else if (playerchoice.equals("rock") && computerchoice.equals("scissors")) {
                System.out.println("You win ");
            } else if (playerchoice.equals("paper") && computerchoice.equals("rock")) {
                System.out.println("You win ");
            } else if (playerchoice.equals("scissors") && computerchoice.equals("paper")) {
                System.out.println("You win ");
            } else {
                System.out.println("You lose ");
            }
            System.out.println("Play again (yes/no) : ");
            playagain = sc.nextLine().toLowerCase();
        }while (playagain.equals("yes"));
        System.out.println("Thanks for playing ");
        sc.close();

    }
}
