import java.util.Scanner;

public class GcdLcm {
    public  static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  First Number ? ");
        int firstNum = sc.nextInt();
        int a = firstNum;
        System.out.println("Enter the second number  ? ");
        int secondNum = sc.nextInt();
        int b = secondNum;

        while(secondNum != 0){
            int rem = firstNum % secondNum;
            firstNum  = secondNum;
            secondNum=rem;
        }
        System.out.println("GCD of " + a + "and" +  b + " is " + firstNum);

    }
}
