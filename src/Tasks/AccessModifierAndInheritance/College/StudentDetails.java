package Tasks.AccessModifierAndInheritance.College;

public class StudentDetails {
    public static void main(String[] args){
//        Student.college = "IIT";
//        System.out.println(Student.college);
//        System.out.println(Student.department);
//        System.out.println(Student.name);
        //System.out.println(Student.age);
        Student stu = new Student();
        Student stu1 = new Student();
        stu.name = "Ludus";
        stu1.name = "senju";
        System.out.println(stu.name);
        System.out.println(stu1.name);
        Student.setAge(30);
        System.out.println(Student.getAge());
    }
}
