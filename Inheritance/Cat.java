package Inheritance;

public class Cat extends Animal{
    int lives = 9;
    String name ;
    Cat(String name){
        this.name=name;
    }
    void speak(){
        System.out.println("The cat speak like meow");
    }
}
