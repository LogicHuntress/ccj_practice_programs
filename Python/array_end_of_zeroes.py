# Move All Zeroes to End of Array
arr = list(map(int, input("Enter array elements separated by space: ").split()))
n = len(arr)
j = 0
for i in range(n):
    if arr[i] != 0:
        arr[j] = arr[i]
        j += 1
while j < n:
    arr[j] = 0
    j += 1
print("Array after moving zeroes:", arr)
