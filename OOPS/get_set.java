package OOPS;

public class get_set {

    class pen {
        private String color; // prop of object
        private int tip; // prop of object

        String getcolor() {
            return this.color; // getter function for access function value
        }

        int gettip() {
            return this.tip; // getter function for access function value
        }

        void Setcolor(String newcolor) { // function of object // setter
            color = newcolor;
        }

        void Settip(int newtip) { // function of object // setter
            tip = newtip;
        }
    }

    public static void main(String args[]) {
        pen p1 = new pen(); // creating object
        p1.Setcolor("blue"); // calling function from class
        System.out.println(p1.getcolor());

        p1.Settip(4);// calling function from class
        System.out.println(p1.gettip());

        // p1.color = "Black"; // it will not executed because properties are private we
        // cant access directly
        // System.out.println(p1.getcolor());
    }

}
