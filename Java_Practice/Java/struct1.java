import java.util.Scanner;  

class Student {
    int id;
    String name;
    float marks;
}

public class struct1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  

        Student s1 = new Student();  

        System.out.print("Enter student id: ");
        s1.id = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter student name: ");
        s1.name = sc.nextLine();

        System.out.print("Enter student marks: ");
        s1.marks = sc.nextFloat();

        System.out.println("\n--- Student Details ---");
        System.out.println("ID    : " + s1.id);
        System.out.println("Name  : " + s1.name);
        System.out.println("Marks : " + s1.marks);

        sc.close(); // for closing 
    }
}
