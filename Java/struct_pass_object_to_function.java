//Pass object to function (by reference in Java)
class Student {
    String name;
    int roll;
    float marks;
}

public class struct_pass_object_to_function {
    // Pass by value of reference
    static void printStudent(Student s) {
        System.out.println("Student: " + s.name + ", Roll: " + s.roll + ", Marks: " + s.marks);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Ravi";
        s.roll = 101;
        s.marks = 88.5f;

        printStudent(s);
    }
}
