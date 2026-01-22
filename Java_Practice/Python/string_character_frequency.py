#Character Frequency Count
# Take input from user
str_input = input("Enter a string: ")

# Create an empty dictionary to store frequency
freq = {}

# Count frequency
for ch in str_input:
    if ch in freq:
        freq[ch] += 1
    else:
        freq[ch] = 1

# Print frequency
for ch, count in freq.items():
    print(f"{ch} - {count}")
