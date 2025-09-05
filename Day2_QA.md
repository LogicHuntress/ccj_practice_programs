# Day-2: Arrays — Interview Q&A  

Q1. What is an array in C?  
A: Array is a collection of elements of the same data type stored in **contiguous memory locations**.  
   Each element is accessed using its **index** starting from 0.  

---  

Q2. Difference between array index and array size?  
A: **Index** → position of element (0 to n-1).  
   **Size** → total number of elements (e.g., `int arr[5];` → size=5, indices=0..4).  

---  

Q3. Difference between static and dynamic arrays?  
A: **Static Array** → size fixed at compile time (`int arr[10];`).  
   **Dynamic Array** → size decided at runtime (`malloc()`, `calloc()` in C).  

---  

Q4. Difference between Linear Search and Binary Search?  
A: **Linear Search** → checks each element sequentially, **O(n)**, works on unsorted arrays.  
   **Binary Search** → divides array into halves, **O(log n)**, works only on **sorted arrays**.  

---  

Q5. What happens if you access an array out of bounds?  
A: Leads to **undefined behavior** → may read garbage value, crash, or overwrite memory.  
