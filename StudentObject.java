public class StudentObject {
    public  static  void main(String[] args){
        Student student1 = new Student("Rajan",43,4.5);
        Student student2=new Student("Kunal",23,4.3);
//        System.out.println(student1.name);
//        System.out.println(student1.age);
//        System.out.println(student1.gpa);
//        System.out.println(student1.isEnrolled);
//        System.out.println(student2.name);
//        System.out.println(student2.age);
//        System.out.println(student2.gpa);
//        System.out.println(student2.isEnrolled);
        student1.study();
        student2.study();
    }
}
