#Class for Student (input details of one student)
class Student:
    def __init__(self, name, roll, marks):
        self.name = name
        self.roll = roll
        self.marks = marks

# Input
name = input("Enter name: ")
roll = int(input("Enter roll number: "))
marks = float(input("Enter marks: "))

s = Student(name, roll, marks)

print("\nStudent Details:")
print("Name:", s.name)
print("Roll:", s.roll)
print("Marks:", s.marks)
