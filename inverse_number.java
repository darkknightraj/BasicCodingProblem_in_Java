import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;
import java.util.*;

public class inverse_number {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int inv =0;
        int op = 1;
        while (n!=0){
            int od = n%10;
            int id = op;
            int ip = od;
            inv= inv+id*(int)Math.pow(10,ip-1);
            n = n/10;
            op++;
        }
        System.out.println(inv);
    }
}
