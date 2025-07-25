public class Generic {
    String name;
    double marks;
    Generic(String name,double marks){
        this.name=name;
        this.marks=marks;
    }
    @Override
    public String toString() {
        return name + " : " + marks;
    }

}
class Swap {
    public static void Swap(Generic x, Generic y) {
        String tempName = x.name;
        double tempMarks = x.marks;

        x.name = y.name;
        x.marks = y.marks;

        y.name = tempName;
        y.marks = tempMarks;
    }

    public static void main(String[] args) {

        Generic p1 = new Generic("Rajan", 89.32);
        Generic p2 = new Generic("Luna", 45.3);
        System.out.println("Before swap");
        System.out.println("p1 " + p1 + " " + "y " + p2);
        Swap(p1,p2);
        System.out.println("After swap ");
        System.out.println("p1 " + p1 + " " + "y " + p2);


    }
}
