# Day-3: Strings — Interview Q&A

Q1. What is a string in C?  
A: A string is a sequence of characters terminated by the null character '\0'.

---

Q2. Difference between character array and string?  
A: Character array → just collection of characters (may or may not end with '\0').  
   String → character array that always ends with '\0'.

---

Q3. How are strings stored in memory?  
A: As contiguous characters, with an extra '\0' at the end to mark the end of the string.

---

Q4. Difference between strlen() and sizeof()?  
A: strlen() → returns actual number of characters (excluding '\0').  
   sizeof() → returns total memory allocated to the array.

---

Q5. What happens if you forget the null character '\0'?  
A: Functions like printf or strlen will continue reading memory, leading to garbage values or crashes.
