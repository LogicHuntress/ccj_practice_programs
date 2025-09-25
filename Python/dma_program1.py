#Demonstrate difference between uninitialized & zero-initialized array
n = 5

uninitialized = [None]*n   # Simulate uninitialized
zero_initialized = [0]*n   # Zero-initialized

print("Uninitialized array values:", uninitialized)
print("Zero-initialized array values:", zero_initialized)
