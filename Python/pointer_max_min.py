#Find maximum and minimum element in an array using pointers
arr = [5, 2, 9, 1, 7]
max_val = arr[0]
min_val = arr[0]

for x in arr[1:]:
    if x > max_val:
        max_val = x
    if x < min_val:
        min_val = x

print("Max =", max_val, ", Min =", min_val)
