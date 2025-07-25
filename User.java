public class User {
String name;
String email;
int age;

User(String name){
    this.name= name;
    this.email="Not provided";
    this.age = 33;
}
//Constructor overloaded two construtor with same name but different parameter
User(String name,String email){
    this.name = name;
    this.email=email;
    this.age  = 43;
}
User(String name , String email ,int age){
    this.name= name;
    this.email = email;
    this.age=age;
}

    public User() {
        this.name = "Guest";
        this.email = "Not provided";
        this.age = 9;
    }
}
