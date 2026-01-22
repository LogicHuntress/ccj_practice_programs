-- Step 1: Create database and use it
CREATE DATABASE IF NOT EXISTS company_db;
USE company_db;

-- Step 2: Create employees table
CREATE TABLE employees (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(50) NOT NULL,
    salary DECIMAL(10,2),    
    hire_date DATE
);

-- Step 3: Insert sample data
INSERT INTO employees VALUES (101, 'Rahul', 50000.50, '2023-03-23');
INSERT INTO employees VALUES (102, 'Rajji', 70000.50, '2023-04-23');
INSERT INTO employees VALUES (103, 'Rakul', 90000.50, '2023-05-23');

-- Check data
SELECT * FROM employees;

-- Step 4: Alter table (Add new column)
ALTER TABLE employees
ADD department VARCHAR(30);

-- Update new column values
UPDATE employees SET department = 'HR' WHERE emp_id = 101;
UPDATE employees SET department = 'IT' WHERE emp_id = 102;
UPDATE employees SET department = 'Finance' WHERE emp_id = 103;

-- Check table again
SELECT * FROM employees;

-- Step 5: Alter table (Modify salary column size)
ALTER TABLE employees
MODIFY salary DECIMAL(12,2);

-- Step 6: Alter table (Drop a column)
ALTER TABLE employees
DROP COLUMN department;

-- Final check
SELECT * FROM employees;

-- Step 7: Drop the table
DROP TABLE employees;
