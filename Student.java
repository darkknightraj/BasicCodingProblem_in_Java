public class Student {
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    Student(String n,int age,double g) {
        this.name = n;
        this.age = age;
        this.gpa = g;
        this.isEnrolled = true;
    }

        void study(){
            System.out.println(this.name + " is studying ");
        }


    }


