#Count the Frequency of Elements
arr = list(map(int, input("Enter elements: ").split()))
freq = {}
for x in arr:
    if x in freq:
        freq[x] += 1
    else:
        freq[x] = 1
for key, value in freq.items():
    print(f"{key} occurs {value} times")
