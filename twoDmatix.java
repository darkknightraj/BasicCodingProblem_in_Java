public class twoDmatix {
    public static  void main(String[] args){
        String[] fruits ={"mango","apple","litchi","coconut"};
        String[] vegetables = {"cucumber ","pumpkin","curlyfower","ladiesfinger"};
        String[] meats = {"chicken","pork","beef","fist"};
        String[][] groceries = {fruits,vegetables,meats};
        for(String[] foods : groceries){
            for(String food : foods){
                System.out.print(food + " ");
            }
            System.out.println();
            System.out.println();
            System.out.println("  ");
        }

    }

}
