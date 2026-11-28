package AccessModifiers.Parent;


import AccessModifiers.Child.Child1;
import org.w3c.dom.ls.LSOutput;

public class Parent extends Child1{
    public static void main(String[] args){
        System.out.println(Child1.publicVar);
        System.out.println(Child1.protectVar);
//        System.out.println(Child1.defaultVar);
        Parent1.display();
    }

}

class Parent1 extends Parent{

    static void display()
    {
        System.out.println(Child1.protectVar);
    }
}
