package OOPS;

public class constructor {
    public static void main(String args[]) {
        student s1 = new student("Prince");
        System.out.println(s1.name);

    }
}

class student {
    String name;
    int age;

    student(String name) {
        this.name = name;
    }
}
