#Second largest element
arr = list(map(int, input("Enter elements: ").split()))
first = second = float('-inf')
for x in arr:
    if x > first:
        second = first
        first = x
    elif x > second and x != first:
        second = x
print("Second largest element:", second)
