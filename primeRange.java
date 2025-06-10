import java.util.Scanner;

public class primeRange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower  range ");
        int lr = sc.nextInt();
        System.out.println("Enter the upper range ");
        int ur =sc.nextInt();
        for(int i = lr ; i<=ur;i++){
            int count =0;
           for(int div = 2;div*div <=i;div++){
               if(i%div==0){
                   count++;
                   break;
               }
           }
           if (count ==0){
               System.out.println(i + "  Prime ");
           }else{
               System.out.println(i +"  Not prime ");
           }

        }

    }
}
