public class VariableArguments {
    public static void main(String[] args){
        System.out.println(add(1,2,3));
        System.out.println(average(2,3,4,5));
    }
    static  int add(int... numbers){ //ellipsis
        int sum = 0;
        for(int number : numbers){
            sum+=number;
        }
        return sum;
    }
    static  double average(double... numbers){
        double sum = 0;
        for(double number : numbers){
            sum += number;
        }
        return sum/numbers.length;
    }
}
