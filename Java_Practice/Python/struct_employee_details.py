#Class for Employee (list of objects)
class Employee:
    def __init__(self, name, emp_id, salary):
        self.name = name
        self.id = emp_id
        self.salary = salary

n = int(input("Enter number of employees: "))
employees = []

for i in range(n):
    print(f"\nEnter details of employee {i+1}")
    name = input("Name: ")
    emp_id = int(input("ID: "))
    salary = float(input("Salary: "))
    employees.append(Employee(name, emp_id, salary))

print("\nEmployee Details:")
for emp in employees:
    print(f"Name: {emp.name}, ID: {emp.id}, Salary: {emp.salary}")
