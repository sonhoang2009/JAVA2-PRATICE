Create database if not exists Pratice ;

USE Pratice;

CREATE TABLE student(
    studentID char(50) NOT NULL primary key ,
    name varchar(50),
    address varchar(50),
    phone char(10) check ( phone REGEXP '[0-9]{10}' )
);

INSERT INTO student VALUES ('B01010','Nguyen Tuan Anh','Ha Noi',0904818238);

INSERT INTO student VALUES ('B10394','Nguyen Hoang Hai','Hai Duong',049494949);