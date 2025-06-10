import java.util.Scanner;

public class counting {
    public static void main(String[]args){
//        int i = 1;
//        int sum =0;
//        while (i<=5){
//
//            System.out.println(i);
//            sum +=i;
//if i change the place first i use increment then i used the sum value it will first iterate then
        // then add the number so we will get extra i 1 in all number till we add because i start with 2
//            i++;
//        }
//       // System.out.println("Done");
//        System.out.println(sum);
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number where u want to print natural number ? ");
        int n = sc.nextInt();
        int sum =0;
        for(int i = 1; i<=n;i++){
            System.out.println(i);
            sum +=i;

        }
        System.out.println("Sum of the " + n+ "natural number is " +  sum);
    }
}
