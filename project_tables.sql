create database skillnext_db;
use skillnext_db;
CREATE TABLE employee (
	id INT PRIMARY KEY auto_increment ,
    name VARCHAR(100),
    email VARCHAR(100),
    salary DOUBLE
);	

create table student(
	id int primary key auto_increment,
    name varchar(100),
    email varchar(100),
    dept varchar(50)
    );