import java.util.Scanner;

public class rotatenumbernew {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ? ");
        int n = sc.nextInt();
        System.out.println("Enter the value from where you want to rotate ? ");
        int k = sc.nextInt();
        int temp = n;
        int nod=0;
        while(temp >0){
            temp = temp/10;
            nod++;
        }
       // System.out.println(nod);
        k = k%nod;
        if(k<0){
            k +=nod;
        }
        int div = 1;
        int multi = 1;
        for(int i = 1;i<=nod;i++){
            if(i<= k){
        div = div*10;
        }else{
                multi *= 10;
            }
        }
        int q = n/div;
        int r = n%div;
        int rotated = r * multi + q;
        System.out.println("Rotate number " + n + " of the value " + k + " is " + rotated);
    }
}
