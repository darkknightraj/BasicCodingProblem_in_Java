import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test case ");
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            //System.out.println("enter the number to check prime or not ? ");
            int n = sc.nextInt();

            int count = 0;
            for (int div = 2; div * div <= n; div++) {
                if (n % div == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
    }
}

