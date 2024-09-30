package OOPS;

public class type_of_constructor {
    public static void main(String args[]) {
        student s1 = new student();
        student s2 = new student("Raj");
        student s3 = new student(321);
        // student s4= new student("aman" , 123); // this wass not called becoz there is
        // no function of name and roll number parameter
    }
}

class student {
    String name;
    int roll;

    student() { // non-parameterize constructor
        System.out.println("Habibi ,construtor called");
    }

    student(String name) { // parateterize constructor
        this.name = name;
    }

    student(int roll) {
        this.roll = roll;
    }
}
