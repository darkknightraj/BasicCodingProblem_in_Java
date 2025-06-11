import java.util.Scanner;

public class fibonacci {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many fibonacci you want ? ");
        int n  = sc.nextInt();
        int a = 0;
        int b =1;
        for(int i = 0;i<=n ;i++){
            System.out.println(a);
            int c = a+b;
            a=b;
            b=c;

        }
    }
}
