package Pattern;

import java.util.Scanner;

public class solidRec {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row ? ");
        int row = sc.nextInt();
        System.out.println("Enter the number of col ? ");
        int col = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(" * ");

            }
            System.out.println();
        }
    }
}
