#Allocate memory for array and print values
n = int(input("Enter size of array: "))
arr = []

for i in range(n):
    val = int(input(f"Enter element {i+1}: "))
    arr.append(val)

print("Array elements:", arr)
