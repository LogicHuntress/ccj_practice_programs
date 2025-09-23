#Remove Duplicates from a Sorted Array
arr = list(map(int, input("Enter sorted array: ").split()))
j = 0
n = len(arr)
for i in range(n-1):
    if arr[i] != arr[i+1]:
        arr[j] = arr[i]
        j += 1
arr[j] = arr[n-1]
j += 1

print("Array after removing duplicates:", arr[:j])
