package Inheritance;

public class AnimalObject {
    public  static void main(String[] args){
        Dog dog = new Dog();
        Cat cat = new Cat("Rocky");
        Plant plant = new Plant();

//        System.out.println(dog.isAlive);
//        System.out.println(cat.isAlive);
//        dog.eat();
//        cat.eat();
//        System.out.println(dog.doglives);
//        System.out.println(cat.lives);
//        dog.speak();
//        cat.speak();
//        System.out.println(cat.name);
        System.out.println(plant.isAlive);
        plant.photosythesis();
        System.out.println(dog.type);
        System.out.println(cat.type);

    }
}
