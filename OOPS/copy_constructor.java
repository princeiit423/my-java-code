package OOPS;

public class copy_constructor {
    public static void main(String args[]) {
        student s1 = new student();
        s1.name = "Prince";
        s1.roll = 34;
        s1.password = "abcd";

        student s2 = new student(s1);
        s2.password = "xyz";
        System.out.println(s2.name);
    }
}

class student {
    String name;
    int roll;
    int marks;
    String password;

    student() {
        System.out.println("Constructor is called");
    }

    student(student s1) { // copy constructor
        this.name = s1.name;
        this.roll = s1.roll;
    }

    student(int roll) {
        this.roll = roll;
    }

    student(String password) {
        this.password = password;
    }
}
