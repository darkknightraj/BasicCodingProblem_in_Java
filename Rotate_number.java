import java.util.Scanner;

public class Rotate_number {
    public  static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        int newn =n;
       int count = 0;
        while(n>0) {
            n = n / 10;
            count++;
        }
       // System.out.println(count);
        System.out.println("Enter the number how many times you want to rotate ");
        int k = sc.nextInt();
        k = k%count;
        if(k<0){
            k =k+count;
        }
        int number = (count-k);
        int multiplier =(int)Math.pow(10,number);
      //  System.out.println(multiplier);
        int que = (int)(newn / Math.pow(10, k));

       // System.out.println(que);
        int rem = (int)(newn % Math.pow(10,k));
        //System.out.println(rem);
        int rotated_number = rem*multiplier+que;
        System.out.println(rotated_number);
    }


}
