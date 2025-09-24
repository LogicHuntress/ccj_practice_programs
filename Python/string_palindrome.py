#Palindrome Check
str1 = input("Enter a string: ")
if str1 == str1[::-1]:
    print("Palindrome")
else:
    print("Not a palindrome")
