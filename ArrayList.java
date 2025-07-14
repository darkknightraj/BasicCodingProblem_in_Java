import java.util.Arrays;

public class ArrayList {
    public static void main(String[] args){
        String[] fruits = {"apple","orange","banana","litchi"};
        fruits[0]="pineapple";
        int numOfFruits = fruits.length;
       // System.out.println(numOfFruits);
        //System.out.println(fruits[0]);
//        for(int i = 0;i<fruits.length;i++){
//            System.out.println(fruits[i]);
        //Arrays.sort(fruits);
        Arrays.fill(fruits,"coconut");
        for(String fruit:fruits){
            System.out.println(fruit);

        }
    }
}
