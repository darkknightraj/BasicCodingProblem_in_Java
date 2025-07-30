package Inheritance;

public class PersonMain {
    public  static  void   main(String[] args){

        Person person = new Person("Tom ","Riddle");
        Student student = new Student("Hary","Pottor",3.45);
        Employee employee = new Employee("Rubeous","Hagrid",450003);

        person.showName();
        student.showGpa();
        System.out.println(student.first);
    }
}
