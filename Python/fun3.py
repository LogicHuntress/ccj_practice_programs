def is_prime(n):   # function definition
    if n <= 1:
        return False   # 1 or negative numbers not prime

    for i in range(2, n // 2 + 1):
        if n % i == 0:
            return False   # not prime
    return True    # otherwise prime

# main part
n = int(input("Enter a number: "))

if is_prime(n):   # function call
    print(n, "is Prime")
else:
    print(n, "is Not Prime")
