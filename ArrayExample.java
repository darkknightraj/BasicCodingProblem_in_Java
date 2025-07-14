public class ArrayExample {
    public  static  void main(String[] args){
        //String[] foods = {"pizza","burger","taco","meat"};
        String[] foods = new String[3];
        foods[0]="pizza";
        foods[1]="taco";
        foods[2]="hamburger";
        for(String food : foods){
            System.out.println(food);
        }
    }
}
