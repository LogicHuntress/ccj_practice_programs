#Input n numbers dynamically and print sum
n = int(input("Enter number of elements: "))
arr = []

sum_val = 0
for i in range(n):
    val = int(input(f"Enter element {i+1}: "))
    arr.append(val)
    sum_val += val

print("Sum =", sum_val)
