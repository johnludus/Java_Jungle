package Tasks.LevelThree.Parent;

import Tasks.LevelThree.Child.Child;
//import Tasks.LevelThree.Child.Child1;

public class Parent extends Child{
    public static void main(String[] args){
        Parent chl = new Parent();
        System.out.println(chl.id);
        System.out.println(chl.name);
        //System.out.println(Child.getAge());
//        System.out.println(chl.pass);
        System.out.println(chl.getAge());
    }
}
