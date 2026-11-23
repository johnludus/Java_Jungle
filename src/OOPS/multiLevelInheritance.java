package OOPS;

import javax.naming.ldap.ManageReferralControl;

class Person{
    String name;
    int age;
    Person(){
        name = "";
        age = 0;
    }
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    void personDetails(){
        System.out.println("Details");
    }
}
class Employee extends Person{
    long empId;
    long salary;
    Employee (){
        empId = 0;
        salary = 0;
    }
    Employee(String name , int age,long empId,long salary){
        super(name , age);
        this.empId = empId;
        this.salary = salary;
    }
    void employeeDetails(){
        System.out.println("deatils");
    }

}

class Manager extends Employee{
    String department;
    int teamSize;
    Manager(){
        department = "";
        teamSize = 0;
    }
    Manager(String name,int age,long empId,long salary,String dept,int teamSize){
        super(name,age,empId,salary);
        department = dept;
        this.teamSize = teamSize;
    }
    void managerDetails(){
        System.out.println("Name" + "-" + name +"\n"+ "Age - " + age +"\n" + "Employee Id - " + empId + "\n" + "Salary - " + salary +  "\n" + "Department -" + department +"\n"+ "Tean Size - " + teamSize );
    }
}
public class multiLevelInheritance {
    public static void main(String[] args){
        Manager manager1 = new Manager("John",19,1323,1000000,"Backend Development",10);
        manager1.managerDetails();
    }
}
