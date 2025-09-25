//Class for Student (input details of one student)
import java.util.Scanner;

class Student {
    String name;
    int roll;
    float marks;
}

public class struct_student_details {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.print("Enter name: ");
        s.name = sc.next();
        System.out.print("Enter roll number: ");
        s.roll = sc.nextInt();
        System.out.print("Enter marks: ");
        s.marks = sc.nextFloat();

        System.out.println("\nStudent Details:");
        System.out.println("Name: " + s.name);
        System.out.println("Roll: " + s.roll);
        System.out.println("Marks: " + s.marks);

        sc.close();
    }
}
