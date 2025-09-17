# Sum of first N natural numbers
n = int(input("Enter N: "))
sum_natural = 0

for i in range(1, n+1):
    sum_natural += i
    if i < n:
        print(f"{i} + ", end="")
    else:
        print(f"{i} = ", end="")

print(sum_natural)

