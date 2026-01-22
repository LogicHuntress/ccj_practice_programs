# Sum of squares of first N natural numbers
n = int(input("Enter N: "))
sum_squares = 0

for i in range(1, n+1):
    sum_squares += i*i
    if i < n:
        print(f"{i}^2 + ", end="")
    else:
        print(f"{i}^2 = ", end="")

print(sum_squares)
