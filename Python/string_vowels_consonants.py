#Count Vowels and Consonants
str1 = input("Enter a string: ").lower()
vowels = consonants = 0

for ch in str1:
    if ch.isalpha():
        if ch in 'aeiou':
            vowels += 1
        else:
            consonants += 1

print("Vowels:", vowels)
print("Consonants:", consonants)
