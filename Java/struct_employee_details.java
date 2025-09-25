//Class for Employee (array of objects)
import java.util.Scanner;

class Employee {
    String name;
    int id;
    float salary;
}

public class struct_employee_details {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        Employee[] emp = new Employee[n];

        for(int i=0; i<n; i++) {
            emp[i] = new Employee();
            System.out.println("\nEnter details of employee " + (i+1));
            System.out.print("Name: ");
            emp[i].name = sc.next();
            System.out.print("ID: ");
            emp[i].id = sc.nextInt();
            System.out.print("Salary: ");
            emp[i].salary = sc.nextFloat();
        }

        System.out.println("\nEmployee Details:");
        for(int i=0; i<n; i++) {
            System.out.println("Name: " + emp[i].name + ", ID: " + emp[i].id + ", Salary: " + emp[i].salary);
        }

        sc.close();
    }
}
