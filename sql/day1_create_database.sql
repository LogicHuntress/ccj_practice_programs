-- Create a new database
CREATE DATABASE test_db;

-- Use the database
USE test_db;

-- Create a table
CREATE TABLE students (
    id INT,
    name VARCHAR(50),
    marks INT
);

-- Insert one row
INSERT INTO students VALUES (1, 'Beula', 70);

-- View the table
SELECT * FROM students;
