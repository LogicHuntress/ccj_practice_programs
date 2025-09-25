#Compare initial values (simulate malloc vs calloc)
n = 5

malloc_array = [None] * n   # Simulate uninitialized (None)
calloc_array = [0] * n      # Zero-initialized

print("Simulated malloc values:", malloc_array)
print("Simulated calloc values:", calloc_array)
