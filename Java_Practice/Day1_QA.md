# Day-1: Loops — Interview Q&A

Q1. Difference between entry-controlled and exit-controlled loops?  
A: Entry-controlled loops check the condition before executing the loop body (`for`, `while`).  
   Exit-controlled loops check the condition after executing once (`do { ... } while(cond);`).  

---

Q2. What is an infinite loop?  
A: A loop that never terminates because the exit condition is never met (`while(1) { ... }`).  
   Useful only when intended (servers, daemons); otherwise it's a bug.  

---

Q3. Difference between `for` and `while` loops?  
A: `for` → used when iteration count is known (init; condition; update).  
   `while` → used when iteration depends on a condition checked each time.  

---

Q4. When to use `break` vs `continue`?  
A: `break` → exits the whole loop immediately.  
   `continue` → skips rest of the current iteration, goes to next.  

---

Q5. What are nested loops and when are they used?  
A: Loop inside another loop.  
   Used for 2D problems (matrices), pattern printing, comparing pairs.  
   Increases time complexity (O(n²), O(n³)).  
