public class Friend {
    String name;
    static int noOfFriends;
    //If we use static keyword infront of number of friends it will referenced from the class and
    //print exat total number of friend

    Friend(String name) {
        this.name = name;
        noOfFriends++;
    }
    static  void showfrinds(){
        System.out.println("The total number of friends " + noOfFriends + " .");
    }
}
