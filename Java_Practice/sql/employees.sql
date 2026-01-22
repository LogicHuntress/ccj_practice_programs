CREATE DATABASE COMPANY; 
USE COMPANY;

CREATE TABLE employees (
    emp_id INT,
    emp_name VARCHAR(50),
    salary DECIMAL(10,2),
    hire_date DATE
);
  SHOW TABLES;
  DESC employees;
  
  INSERT INTO employees VALUES(101, 'Rahul', 50000.50, '2023-03-23');
  INSERT INTO employees VALUES(102, 'Rajji', 70000.50, '2023-04-23');
  INSERT INTO employees VALUES(103, 'Rakul', 90000.50, '2023-05-23');
  INSERT INTO employees VALUES(104, 'Ramya', 60000.50, '2023-06-23');
  
  SELECT * FROM employees;
  
