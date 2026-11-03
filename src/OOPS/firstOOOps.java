package OOPS;
class Pen{
    String colour ;
    int tipSize;
//    void Pen(String colour,int tip){
//        colour = colour;
//        tip = tip;
//    }
    void changeColour(String newColour){
        colour = newColour;
    }
    void tipSizeChange(int newSize){
        tipSize = newSize;
    }
}

class Bank {
    String name;
    long accountNo;
    String password;

    Bank() {
        name = "";
        accountNo = 0;
        password = "";
    }

    Bank(String name, int accountNo, String password) {
        this.name = name;
        this.accountNo = accountNo;
        this.password = password;
    }
}



public class firstOOOps {
    public static void main(String[] args){

        Bank p1 = new Bank();
        System.out.println(p1.password);

        //Pen p1 = new Pen();
//        p1.changeColour("Red");
//        System.out.println(p1.colour);
    }
}
