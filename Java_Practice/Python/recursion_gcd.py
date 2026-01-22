def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)

x, y = map(int, input("Enter two numbers: ").split())
print("GCD =", gcd(x, y))
