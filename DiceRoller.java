import java.util.Scanner;
import  java.util.Random;

public class DiceRoller {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int total  = 0;
        System.out.print("Enter the number of dice you want to roll ? ");
        int noOfDice = sc.nextInt();
        if(noOfDice>0) {
            for(int i = 1 ;i<=noOfDice;i++){
                int roll = random.nextInt(1,7);
                printdie(roll);
                System.out.println("You rolled " + i+ " times you got =" + roll);
                total += roll;
            }
            System.out.println("Total sum of all the roll = "+total);
        }else{
            System.out.println("Enter the number greater than  0 ");
        }
        sc.close();
    }
    static  void printdie(int roll){
        String dice1 = """
                   
                    ----------
                   |          |
                   |     1    |
                   |          |
                    ----------
                """;
        String dice2 = """
                   
                    ----------
                   |          |
                   |     2    |
                   |          |
                    ----------
                """;
        String dice3 = """
                   
                    ----------
                   |          |
                   |     3    |
                   |          |
                    ----------
                """;
        String dice4 = """
                   
                    ----------
                   |          |
                   |     4    |
                   |          |
                    ----------
                """;
        String dice5 = """
                   
                    ----------
                   |          |
                   |     5    |
                   |          |
                    ----------
                """;
        String dice6 = """
                   
                    ----------
                   |          |
                   |     6    |
                   |          |
                    ----------
                """;
        switch (roll){
            case 1 -> System.out.println(dice1);
            case 2-> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case  4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid roll ");
        }

    }
}
