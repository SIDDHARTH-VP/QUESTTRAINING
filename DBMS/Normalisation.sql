CREATE TABLE Orders (
    OrderID INT,
    CustomerName VARCHAR(100),
    ProductNames VARCHAR(255)
);

INSERT INTO Orders (OrderID, CustomerName, ProductNames) VALUES
(1, 'Alice', 'ProductA, ProductB'),
(2, 'Bob', 'ProductC'),
(3, 'Alice', 'ProductB, ProductC, ProductA');


select * from orders;

CREATE TABLE Orders_1NF (
    OrderID INT,
    CustomerName VARCHAR(100),
    ProductName VARCHAR(100)
);

INSERT INTO Orders_1NF (OrderID, CustomerName, ProductName) VALUES
(1, 'Alice', 'ProductA'),
(1, 'Alice', 'ProductB'),
(2, 'Bob', 'ProductC'),
(3, 'Alice', 'ProductB'),
(3, 'Alice', 'ProductC'),
(3, 'Alice', 'ProductA');

select * from Orders_1NF;



--2NF--
CREATE TABLE Students (
    StudentID INT PRIMARY KEY,
    StudentName VARCHAR(100)
);

INSERT INTO Students (StudentID, StudentName) VALUES
(1, 'Alice'),
(2, 'Bob');
select * from students;


CREATE TABLE Courses (
    CourseID VARCHAR(10) PRIMARY KEY,
    CourseName VARCHAR(100)
);

INSERT INTO Courses (CourseID, CourseName) VALUES
('C101', 'Math'),
('C102', 'Physics'),
('C103', 'Chemistry');
select * from courses;



CREATE TABLE Instructors (
    InstructorID VARCHAR(10) PRIMARY KEY,
    InstructorName VARCHAR(100)
);

INSERT INTO Instructors (InstructorID, InstructorName) VALUES
('I01', 'Dr. Smith'),
('I02', 'Dr. Brown'),
('I03', 'Dr. Johnson');

select * from instructors;



CREATE TABLE Student_Courses (
    StudentID INT,
    CourseID VARCHAR(10),
    PRIMARY KEY (StudentID, CourseID),
    FOREIGN KEY (StudentID) REFERENCES Students(StudentID),
    FOREIGN KEY (CourseID) REFERENCES Courses(CourseID)
);


CREATE TABLE Course_Instructors (
    CourseID VARCHAR(10),
    InstructorID VARCHAR(10),
    PRIMARY KEY (CourseID, InstructorID),
    FOREIGN KEY (CourseID) REFERENCES Courses(CourseID),
    FOREIGN KEY (InstructorID) REFERENCES Instructors(InstructorID)
);


INSERT INTO Student_Courses (StudentID, CourseID) VALUES
(1, 'C101'),
(1, 'C102'),
(2, 'C101'),
(2, 'C103');

INSERT INTO Course_Instructors (CourseID, InstructorID) VALUES
('C101', 'I01'),
('C102', 'I02'),
('C103', 'I03');

select * from course_instructors;
select * from Student_Courses;


--3nf--
CREATE TABLE Sales (
    SalesID INT PRIMARY KEY,
    ProductID INT,
    SaleDate DATE,
    FOREIGN KEY (ProductID) REFERENCES Product(ProductID)
);

CREATE TABLE Product (
    ProductID INT PRIMARY KEY,
    ProductName VARCHAR(100),
    CategoryID INT,
    FOREIGN KEY (CategoryID) REFERENCES Category(CategoryID)
);

CREATE TABLE Category (
    CategoryID INT PRIMARY KEY,
    CategoryName VARCHAR(100)
);

INSERT INTO Category (CategoryID, CategoryName)
VALUES
    (1, 'Fruits'),
    (2, 'Vegetables');

INSERT INTO Product (ProductID, ProductName, CategoryID)
VALUES
    (101, 'Apple', 1),
    (102, 'Banana', 1),
    (103, 'Carrot', 2);

INSERT INTO Sales (SalesID, ProductID, SaleDate)
VALUES
    (1, 101, '2024-01-01'),
    (2, 102, '2024-01-02'),
    (3, 103, '2024-01-03');

select * from category;
select * from product;
select * from sales;


