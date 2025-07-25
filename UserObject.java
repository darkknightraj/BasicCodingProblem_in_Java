public class UserObject {
    public  static  void main(String[] args){
        //Create an object
        User user1 = new User("Rajan");
        User user2 =new User("Luna","rajanmishra1728@gmail.com");
        User user3 =new User("Randy","kumal343@gmail.com ",33);
        User user4 = new User();
        System.out.println(user1.name);
        System.out.println(user1.age);
        System.out.println(user1.email);
        System.out.println();
        System.out.println(user2.name);
        System.out.println(user2.age);
        System.out.println(user2.email);
        System.out.println();

        System.out.println(user3.name);
        System.out.println(user3.age);
        System.out.println(user3.email);
        System.out.println();
        System.out.println(user4.name);
        System.out.println(user4.age);
        System.out.println(user4.email);
    }
}
