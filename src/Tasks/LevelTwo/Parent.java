package Tasks.LevelTwo;

public class Parent {
    static private int pass = 1234;
    static public String userName = "john";
    static String nickName = "Ludu";
    static protected int userId = 1323;

    static void display(){
        System.out.println(pass);
        System.out.println(userName);
        System.out.println(nickName);
        System.out.println(userId);

    }
}

class Child{
    static void displayDetails(){
        System.out.println(Parent.pass);
        System.out.println(Parent.userName);
        System.out.println(Parent.nickName);
        System.out.println(Parent.userId);
    }

    public static void main(String[] arge){

        displayDetails();
        Parent.display();
    }
}
