create table Customer(
customer_id int primary key auto_increment,
first_name varchar(50) not null,
last_name varchar(50),
email varchar(50) unique,
phone varchar(15),
address varchar(50));



create table Rooms (
room_id int primary key auto_increment,
room_type varchar(50),
price decimal(8,2),
room_status varchar(50),
floor_num int);



CREATE TABLE Reservations(
reservation_id int primary key auto_increment,
 customer_id INT,
    room_id INT,
    reservation_date DATE,
    check_in_date DATE,
    check_out_date DATE,
    reservation_status VARCHAR(20),
    foreign key(customer_id) references Customer(customer_id),
	foreign key(room_id) references Rooms(room_id)
);


CREATE TABLE Payments (
    payment_id INT PRIMARY KEY,
    reservation_id INT,
    payment_date DATE,
    amount_paid DECIMAL(8, 2),
    payment_method VARCHAR(20),  
    FOREIGN KEY (reservation_id) REFERENCES Reservations(reservation_id) 
);


create table Staff(
staff_id int primary key auto_increment,
first_name varchar(50),
last_name varchar(50),
position varchar(50),
hire_date date); 

    
    
    CREATE TABLE RoomAssignments (
    assignment_id INT PRIMARY KEY auto_increment,
    staff_id INT,
    room_id INT,
    assignment_date DATE,
    task_description VARCHAR(100),
    FOREIGN KEY (staff_id) REFERENCES Staff(staff_id),
    FOREIGN KEY (room_id) REFERENCES Rooms(room_id)
);


INSERT INTO Customer (first_name,last_name,email,phone,address)VALUES
( 'John', 'Doe', 'john@example.com', '1234567890', '123 Street A'),
( 'Jane', 'Smith', 'jane@example.com', '9876543210', '456 Street B'),
( 'Tom', 'Brown', 'tom@example.com', '5432167890', '789 Street C');

INSERT INTO Rooms (room_type ,price,room_status,floor_num)VALUES
( 'Single', 100.00, 'available', 1),
( 'Double', 150.00, 'occupied', 2);


INSERT INTO Reservations (customer_id,room_id,reservation_date,check_in_date,check_out_date,
    reservation_status) VALUES
( 1, 1, '2023-11-01', '2023-11-05', '2023-11-10', 'confirmed');

INSERT INTO Payments VALUES
(1, 1, '2023-11-01', 500.00, 'credit card');


INSERT INTO Staff (first_name,last_name ,position,hire_date) VALUES
( 'Alice', 'John', 'Receptionist', '2022-01-15');


INSERT INTO RoomAssignments (staff_id,room_id,assignment_date,task_description)VALUES
( 1, 1, '2023-11-10','cleaning');


select * from Rooms 
where floor_num=1 and room_status='available';

select Reservations.reservation_id, customer.first_name,customer.last_name,customer.email,reservations.check_in_date
from reservations
join customer on reservations.customer_id=customer.customer_id
order by reservations.check_in_date;

select customer.first_name,customer.last_name
from reservations 
join customer on reservations.customer_id=customer.customer_id
where DATEDIFF(reservations.check_out_date,reservations.check_in_date)>4;

select reservation_id,sum(amount_paid) as Total
from payments
GROUP BY reservation_id;

select room_type,AVG(price)
from rooms
group by room_type;



select staff.first_name,staff.last_name,count(roomassignments.assignment_id) as Total_Assignments
from roomassignments
join staff on roomassignments.staff_id=staff.staff_id
where assignment_date>=date_sub(curdate(),interval 1 month)
group by staff.staff_id
order by total_assignments desc;


select customer.first_name,customer.last_name,max(reservations.reservation_date) as latest
from reservations
join customer on reservations.customer_id=customer.customer_id
group by customer.customer_id;

select room_id
from rooms
where room_status='available' and room_id not in (
	select room_id from reservations
    where check_in_date<='2023-12-10' and check_out_date>='2023-12-05');
    
--deleting--
delete from payments
where reservation_id in(select reservation_id from reservations 
						where customer_id=1);
                        
                        
delete from reservations where reservation_id=1;






Retrieve all information about rooms available on a specific floor.

Use WHERE and JOIN with the Rooms and Reservations tables.
List all reservations with customer details (first name, last name, email) sorted by check-in date (earliest first).

Use ORDER BY to sort the results.
Find all customers who have reserved rooms for more than 5 nights.

Use DATEDIFF function to calculate the number of nights.
Get the total amount paid for each reservation.

Use SUM() to aggregate the payment amounts and group by reservation.
Find the average room price for each room type.

Use GROUP BY with AVG().
Display the total revenue generated from all reservations in the last month.

Use SUM() and WHERE with date filters.
Find the staff members who have been assigned the most rooms for cleaning or maintenance in the last month.

Use JOIN between Staff and Room Assignments, and GROUP BY to count the number of assignments.
Retrieve the most recent reservation for each customer.

Use JOIN, GROUP BY, and ORDER BY to get the latest reservation per customer.
Delete a reservation and all corresponding payment records.


