#Access & modify members using reference
class Student:
    def __init__(self, name, roll, marks):
        self.name = name
        self.roll = roll
        self.marks = marks

s = Student("Ravi", 101, 88.5)

print("Original Name:", s.name)

# Modify using reference
s.name = "Kiran"
s.marks = 95.0

print("Modified Name:", s.name, ", Marks:", s.marks)
