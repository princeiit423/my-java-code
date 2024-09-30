package OOPS;

public class inheritance {
    public static void main(String args[]) {
        fish shark = new fish();
        shark.eat(); // fish class not have eat property inherit by animal class
        System.out.println(shark.eat);

    }
}

class Animals {
    String eat;
    int breathe;

    void eat() {
        System.out.println("eating!");
    }

    void breathe() {
        System.out.println("Breathing");
    }
}

class fish extends Animals {
    int fins;
    int swim;

    void fins() {
        System.out.println("Fins");
    }

    void swim() {
        System.out.println("swimming");
    }
}
