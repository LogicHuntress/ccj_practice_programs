class Student:
    def __init__(self, id, name, marks):
        self.id = id
        self.name = name
        self.marks = marks

# take input
id = int(input("Enter student id: "))
name = input("Enter student name: ")
marks = float(input("Enter student marks: "))

# create object
s1 = Student(id, name, marks)

# print details
print("\n--- Student Details ---")
print("ID    :", s1.id)
print("Name  :", s1.name)
print("Marks :", s1.marks)
