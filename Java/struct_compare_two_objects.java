//Compare two objects
class Student {
    String name;
    int roll;
    float marks;
}

public class struct_compare_two_objects {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ravi"; s1.roll = 101; s1.marks = 88.5f;

        Student s2 = new Student();
        s2.name = "Ravi"; s2.roll = 101; s2.marks = 88.5f;

        if(s1.name.equals(s2.name) && s1.roll == s2.roll && s1.marks == s2.marks) {
            System.out.println("Both students have same data.");
        } else {
            System.out.println("Students data is different.");
        }
    }
}
