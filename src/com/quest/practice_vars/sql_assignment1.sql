create table books(
book_id int primary key auto_increment,
title varchar(50) not null,
author_id int,
publication_year year,
price decimal(10,2),
foreign key (author_id) references authors(author_id)
);

create table authors(
author_id int primary key auto_increment,
first_name varchar(50) not null,
last_name varchar(50));

create table borrowers(
borrower_id int primary key auto_increment,
first_name varchar(50) not null,
last_name varchar(50),
email varchar(50) unique,
dob date);

create table loan(
loan_id  INT Primary Key auto_increment,
 borrower_id int,
 book_id int,
loan_date DATE,
return_date DATE,
foreign key(borrower_id) references borrowers(borrower_id), 
foreign key(book_id) references books(book_id)
);

INSERT INTO Authors (first_name, last_name) VALUES 
											('Ram', 'Fitz'),
											('Jhon', 'SIR'),
											('Sibin', 'George'),
											('Abi', 'Ram'),
											('Mark', 'Cuban');


INSERT INTO books (title, author_id, publication_year, price) VALUES
											('The Great', 1, 1925, 20.00),
											('Palace', 2, 1951, 15.50),
											('Prince', 3, 1949, 22.50),
											('Pride', 4, 1988, 18.00),
											('Adventures', 5, 2003, 25.00);


INSERT INTO borrowers (first_name, last_name, email, dob) VALUES
											('Aswin', 'Doe', 'asw@gmail.com', '1990-05-15'),
											('Akash', 'U', 'aksu@mail.com', '1995-08-22'),
											('Farhad', 'K', 'faru@mail.com', '1984-10-10'),
											('Bob', 'W', 'bobw@mail.com', '2000-01-25'),
											('Sarin', 'Krishna', 'sarin@mail.com', '1992-03-30');


INSERT INTO loan (borrower_id, book_id, loan_date, return_date) VALUES
											(1, 11, '2024-02-15', '2024-03-01'),
											(2, 12, '2024-01-10', '2024-01-25'),
											(3, 13, '2024-05-20', '2024-06-05'),
											(4, 14, '2024-03-15', '2024-03-30'),
											(5, 15, '2024-05-16','2024-05-30');

select *
from books;

select title,price,publication_year
from books
where price>20;

select first_name, last_name, email
from borrowers
where borrower_id in (select borrower_id
						from loan
                        where loan_date> '2024-01-01');
                        
                        
update books set price=25.00 where title='The Great';

delete from loan
where book_id in (select book_id
				from books
                where title="Adventures");
delete from books where title="Adventures";

alter table books add column genre varchar(50);

select count(*) as Totalborrowers from borrowers;

select sum(price) as Totalprice from books;
select avg(price) as avgprice from books;


select *
from books 
where book_id in(select book_id 
					from loan
                    join borrowers on loan.borrower_id=borrowers.borrower_id
                    where timestampdiff(year,dob,curdate())>30);
                    
                    
                    

Create a Database Schema:

Create a new database schema named LibraryManagement.
Create the Following Tables:

Books table with the following columns:
book_id (Primary Key, INT, Auto Increment)
title (VARCHAR)
author_id (Foreign Key referencing author_id in the Authors table)
publication_year (YEAR)
price (DECIMAL)
Authors table with the following columns:
author_id (Primary Key, INT, Auto Increment)
first_name (VARCHAR)
last_name (VARCHAR)
Borrowers table with the following columns:
borrower_id (Primary Key, INT, Auto Increment)
first_name (VARCHAR)
last_name (VARCHAR)
email (VARCHAR, Unique) 
dob (DATE)
Loans table with the following columns:
loan_id (Primary Key, INT, Auto Increment)
borrower_id (Foreign Key referencing borrower_id in the Borrowers table)
book_id (Foreign Key referencing book_id in the Books table)
loan_date (DATE)
return_date (DATE)
Insert Records:

Insert 5 records into each of the four tables (Books, Authors, Borrowers, and Loans). Ensure the data is realistic and consistent with the relationships between the tables.
Perform the Following SQL Operations:

SELECT Queries:

Select all columns from the Books table.
Select the title, price, and publication_year of books where price > 20.
Select the first_name, last_name, and email of borrowers who have borrowed books after '2024-01-01'.
UPDATE Query:

Update the price of the book with title = 'The Great Gatsby' to 25.00.
DELETE Query:

Delete the book from the Books table where title = 'Moby Dick'.
ALTER TABLE Query:

Alter the Books table to add a new column genre of type VARCHAR(50).
Aggregate Functions:

Use the COUNT function to find the total number of borrowers.
Use the SUM function to find the total price of all books in the library.
Use the AVG function to calculate the average price of books.
Subquery:

Write a subquery to find all books that have been borrowed by any borrower who is over 30 years old.
Deliverables:
SQL Script:
Submit a single .sql file that contains:
The script for creating the database (LibraryManagement).
The CREATE table statements for Books, Authors, Borrowers, and Loans.
The INSERT statements for adding data into each table.
All the required SELECT, UPDATE, DELETE, ALTER, and aggregate function queries.
The subquery query.















