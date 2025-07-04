public class method {
    public static  void main(String[] args){

       // happyBirthday("Kunal",34);
        System.out.println(add(3,4));
    }
    static  void  happyBirthday(String nibe,int age){
        System.out.println("Happy Birthday to you !! ");
        System.out.println("Happy Birthday to you "+ nibe);
        System.out.printf("You are %d years old !!",age);
    }
    static  double add(double a ,  double b){
        return  a+b;
    }
    static  double add(double a , double b , double c) {
        return a + b + c;
    }
    static  double add(double a , double b , double c ,double d){
        return  a + b+ c+d;
    }


}
