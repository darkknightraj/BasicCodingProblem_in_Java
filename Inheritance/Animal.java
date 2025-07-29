package Inheritance;

public class Animal extends Organism {
    String type;

    Animal(){
        type = "carnivorous";
    }

    void eat(){
        System.out.println("The animals are eating ");
    }
}
