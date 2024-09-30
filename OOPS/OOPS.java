package OOPS;

public class OOPS {
    public static void main(String args[]) {
        pen p1 = new pen(); // creating object
        p1.Setcolor("blue"); // calling function from class
        System.out.println(p1.color);

        p1.Settip(4);// calling function from class
        System.out.println(p1.tip);

        p1.color = "Black"; // without function bhi change kr skte colour if colour is public
        System.out.println(p1.color);
    }
}

class pen {
    String color; // prop of object
    int tip; // prop of object

    void Setcolor(String newcolor) { // function of object
        color = newcolor;
    }

    void Settip(int newtip) { // function of object
        tip = newtip;
    }
}
