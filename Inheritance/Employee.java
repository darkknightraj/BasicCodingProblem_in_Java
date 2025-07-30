package Inheritance;

public class Employee extends  Person{
    double Salary;
    Employee(String first,String last,double Salary){
        super(first,last);
        this.Salary = Salary;
    }
    void showSalary(){
        System.out.println(this.first + " salary is " + this.Salary);
    }
}
