package OOPS;

public class abstraction {
    public static void main(String args[]) {
        horse h1 = new horse();
        h1.walk();
        chicken c1 = new chicken();
        c1.walk();
    }
}

abstract class Animal {
    void eat() {
        System.out.println("eating");
    }

    abstract void walk(); // yaha ye abstract ho gya hai mtlb implementation nahi dikhya gya
                          // koi dfusra class me dikhaya gya hai yah hai abstraction.
}

class horse extends Animal {
    void walk() {
        System.out.println("walk on 4 legs");
    }
}

class chicken extends Animal {
    void walk() {
        System.out.println("walk on 2 legs");
    }
}
