package Inheritance;

public class Person {
    String first;
    String last;
    // Create constructor
    Person(String first,String  last){
        this.first = first;
        this.last = last;
    }
    void showName(){
        System.out.println(this.first + " " + this.last);
    }

}
