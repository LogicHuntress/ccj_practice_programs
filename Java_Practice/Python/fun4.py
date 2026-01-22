def largest(arr):
    max_val = arr[0]
    for i in arr[1:]:
        if i > max_val:
            max_val = i
    return max_val

# main
n = int(input("Enter size of array: "))
arr = []

print("Enter", n, "elements: ")
for i in range(n):
    arr.append(int(input()))

result = largest(arr)
print("Largest element =", result)
