# Multiplication table of a number
n = int(input("Enter N: "))

for i in range(1, 11):
    result = n * i
    print(f"{n} * {i} = {result}")
