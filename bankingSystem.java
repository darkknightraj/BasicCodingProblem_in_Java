import java.util.Scanner;

public class bankingSystem {
    static  Scanner sc = new Scanner(System.in);
    public  static  void main(String[] args) {

        double balance=0;
        int choice;
        boolean isRunning = true;
        while (isRunning){
        System.out.println("************************");
        System.out.println("Welcome to banking Program   ");
        System.out.println("*************************");
        System.out.println("1. Show balance ");
        System.out.println("2. Deposit  ");
        System.out.println("3. Withdraw  ");
        System.out.println("4. Exit   ");

        System.out.print("Enter your choices 1-4 ? ");
        choice = sc.nextInt();
        sc.nextLine();

            switch (choice) {
//                case 1 -> System.out.println("SHOW BALANCE");
                case 1 -> showbalance(balance);
                case 2 -> balance = balance+deposit(balance);
                case 3 -> balance -=withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Enter a valid choice ");
            }
        }
        sc.close();
    }
    static  void showbalance(double balance){
        System.out.printf("Your current balance is : : $%.2f\n",balance);
    }

    static  double deposit(double balance) {
        System.out.print("Enter the amount you want to deposit : ");
        double depositamount = sc.nextDouble();
        sc.nextLine();
        if (depositamount >= 0) {
            double newbalace =depositamount+balance;
            System.out.printf("You deposited amount is $%.2f\n ",depositamount);
            System.out.printf("Your new balance is $%.2f\n",newbalace);
            return depositamount;
        }

        System.out.println("you can't deposit negative money ");
        return  0;
    }

    static  double withdraw(double balance){
        System.out.println("Enter the amount you want to withdraw ");
        double withdrawamount = sc.nextDouble();
        sc.nextLine();
        if(withdrawamount<=balance && withdrawamount>=0){
            double newbalance = balance-withdrawamount;
            System.out.printf("You have withdrawal $%.2f\n" , withdrawamount);
            System.out.printf("Your new balance is $%.2f\n ",newbalance);
            return withdrawamount;
        }else if(withdrawamount<0) {
            System.out.println("You can't withdraw the negative amount ");
        }else {

        System.out.println("Isufficient fund ");
        }

        return 0;
    }

}
