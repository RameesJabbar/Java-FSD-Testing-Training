create database student;
use student;

create table students(
student_id varchar(10) not null,
student_name varchar(30) not null,
age int(2) not null,
place varchar(30) not null,
primary key(student_id)
);

select * from students;

-- insrting single data into the table
insert into students(student_id, student_name, age, place)
value('S1', 'Akhil', 20, 'Trivandrum');

-- insrting multiple data into the table
insert into students
values
('S2', 'Manju', 18, 'Ernakulam'),
('S3', 'Shareef', 14, 'Palakkad'),
('S4', 'Praveen', 32, 'Thrishur'),
('S5', 'John', 20, 'Trivandrum'),
('S6', 'Akhil', 20, 'Ernakulam'),
('S7', 'Aneesh', 14, 'Kottaym'),
('S8', 'Lakshmi', 20, 'Kozhikkode'),
('S9', 'Cyril', 12, 'Ernakulam'),
('S10', 'Santhosh', 28, 'Malappuram');

