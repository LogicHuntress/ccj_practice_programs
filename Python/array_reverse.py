#Reverse an Array
arr = list(map(int, input("Enter array elements: ").split()))
start, end = 0, len(arr)-1

while start < end:
    arr[start], arr[end] = arr[end], arr[start]
    start += 1
    end -= 1

print("Reversed array:", arr)
