#Find Largest & Smallest Element
arr = list(map(int, input("Enter array elements: ").split()))
max_val = arr[0]
min_val = arr[0]

for num in arr[1:]:
    if num > max_val:
        max_val = num
    if num < min_val:
        min_val = num

print("Largest element =", max_val)
print("Smallest element =", min_val)
