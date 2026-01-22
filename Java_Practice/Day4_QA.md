## Day-4: Interview Q&A on Pointers

**Q1. What is a pointer in C/C++?**  
**A:** A variable that stores the memory address of another variable.  
Example: `int num = 10; int *ptr = &num;`

**Q2. What is a NULL pointer?**  
**A:** A pointer that does not point to any valid memory.  
Example: `int *p = NULL;` Accessing `*p` causes error.

**Q3. What is pointer arithmetic?**  
**A:** Performing `+`, `-`, `++`, `--` on pointers moves them by size of their data type.  
Example: `int arr[3] = {10,20,30}; int *p = arr; *(p+1) = 20;`

**Q4. Difference between pointer and array?**  
**A:** Pointer → stores address, can change.  
Array → fixed-size block, name acts like pointer to first element.

**Q5. What is a dangling pointer and how to avoid it?**  
**A:** Pointer pointing to memory that is freed/deleted.  
Avoid by: setting pointer to `NULL` after free/delete.
