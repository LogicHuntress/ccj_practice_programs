-- Step 1: Drop and Create Database
DROP DATABASE IF EXISTS school;
CREATE DATABASE school;
USE school;

-- Step 2: Create Classes Table
CREATE TABLE classes (
    class_id INT PRIMARY KEY AUTO_INCREMENT, 
    class_name VARCHAR(50) NOT NULL UNIQUE
);

-- Insert Classes
INSERT INTO classes (class_name) VALUES ('Class 6');
INSERT INTO classes (class_name) VALUES ('Class 7');
INSERT INTO classes (class_name) VALUES ('Class 8');

-- Step 3: Create Students Table with constraints
CREATE TABLE students (
    student_id INT PRIMARY KEY AUTO_INCREMENT,   -- PRIMARY KEY + AUTO_INCREMENT
    student_name VARCHAR(50) NOT NULL,           -- NOT NULL
    email VARCHAR(100) UNIQUE,                   -- UNIQUE
    marks DECIMAL(5,2) CHECK (marks >= 0),       -- CHECK (marks >= 0)
    status VARCHAR(20) DEFAULT 'Active',         -- DEFAULT
    class_id INT,
    FOREIGN KEY (class_id) REFERENCES classes(class_id) -- FOREIGN KEY
);

-- Step 4: Insert Students (Valid Data)
INSERT INTO students (student_name, email, marks, class_id) 
VALUES ('Ravi', 'ravi@student.com', 85.50, 1);

INSERT INTO students (student_name, email, marks, class_id) 
VALUES ('Sita', 'sita@student.com', 90.00, 2);

INSERT INTO students (student_name, email, marks, class_id) 
VALUES ('Manoj', 'manoj@student.com', 75.25, 3);

INSERT INTO students (student_name, email, marks, class_id) 
VALUES ('Priya', 'priya@student.com', 88.00, 2);

-- Step 5: View Students
SELECT * FROM students;

-- Step 6: View Classes
SELECT * FROM classes;
