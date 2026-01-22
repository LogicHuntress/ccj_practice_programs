#Compare two objects
class Student:
    def __init__(self, name, roll, marks):
        self.name = name
        self.roll = roll
        self.marks = marks

s1 = Student("Ravi", 101, 88.5)
s2 = Student("Ravi", 101, 88.5)

if s1.name == s2.name and s1.roll == s2.roll and s1.marks == s2.marks:
    print("Both students have same data.")
else:
    print("Students data is different.")
