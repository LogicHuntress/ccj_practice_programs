#Left Rotate an Array by One Position
arr = list(map(int, input("Enter array elements: ").split()))
first = arr[0]

for i in range(len(arr)-1):
    arr[i] = arr[i+1]

arr[-1] = first
print("Array after left rotation:", arr)
