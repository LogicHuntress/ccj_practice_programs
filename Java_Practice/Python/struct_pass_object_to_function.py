#Pass object to function (by reference)
class Student:
    def __init__(self, name, roll, marks):
        self.name = name
        self.roll = roll
        self.marks = marks

def print_student(s):
    print(f"Student: {s.name}, Roll: {s.roll}, Marks: {s.marks}")

s = Student("Ravi", 101, 88.5)
print_student(s)
