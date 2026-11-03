package OOPS;
class Animal{
    int teath;
     void eat(){
         System.out.println("Eats meat.");
     }
}

class Carnivore extends Animal{

    void strength(){
        System.out.println("Very Strong.");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Carnivore lion = new Carnivore();
        lion.eat();
    }
}
