#Check if Array is Sorted (ascending/descending)
arr = list(map(int, input("Enter array elements: ").split()))
isAsc = True
isDesc = True

for i in range(len(arr)-1):
    if arr[i] > arr[i+1]:
        isAsc = False
    if arr[i] < arr[i+1]:
        isDesc = False

if isAsc:
    print("Array is sorted ascending.")
elif isDesc:
    print("Array is sorted descending.")
else:
    print("Array is NOT sorted.")
