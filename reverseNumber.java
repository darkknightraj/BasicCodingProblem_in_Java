import java.util.Scanner;

public class reverseNumber {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to reverse ? ");
        int n = sc.nextInt();
        int reverse_number =0;
        int original_n =n;
        while(n>0){
            int rem = n%10;
            reverse_number= reverse_number* 10 +rem;
            n=n/10;
        }
        System.out.println("Reverse number of " + original_n + " is  " + reverse_number);
    }
}
