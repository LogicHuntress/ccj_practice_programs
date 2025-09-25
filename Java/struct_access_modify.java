//Access & modify members using reference (object)
class Student {
    String name;
    int roll;
    float marks;
}

public class struct_access_modify {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Ravi";
        s.roll = 101;
        s.marks = 88.5f;

        System.out.println("Original Name: " + s.name);

        // Modify using reference
        s.name = "Kiran";
        s.marks = 95.0f;

        System.out.println("Modified Name: " + s.name + ", Marks: " + s.marks);
    }
}
