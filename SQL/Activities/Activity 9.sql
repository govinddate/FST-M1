REM   Script: Activity 9
REM   Activity 9

create table customers ( 
    customer_id int primary key, customer_name varchar(32), 
    city varchar(20), grade int, salesman_id int);

insert all 
into customers values (3002, 'Nick Rimando', 'New York', 100, 5001) 
into customers values (3007, 'Brad Davis', 'New York', 200, 5001) 
into customers values (3005, 'Graham Zusi', 'California', 200, 5002) 
into customers values (3008, 'Julian Green', 'London', 300, 5002) 
into customers values (3004, 'Fabian Johnson', 'Paris', 300, 5006) 
into customers values (3009, 'Geoff Cameron', 'Berlin', 100, 5003) 
into customers values (3003, 'Jozy Altidor', 'Moscow', 200, 5007) 
into customers values (3001, 'Brad Guzan', 'London', 300, 5005) 
SELECT 1 FROM DUAL;

select cust.customer_name, cust.city, sales.salesman_name, sales.commission from customers cust inner join salesman sales on cust.salesman_id=sales.salesman_id;

select cust.customer_name, cust.city, cust.grade, sales.salesman_name, sales.salesman_city FROM customers cust 
left outer join salesman sales ON cust.salesman_id=sales.salesman_id WHERE cust.grade<300 
order by cust.customer_id;

select cust.customer_name, cust.city, sales.salesman_name, sales.commission FROM customers cust 
INNER JOIN salesman sales ON cust.salesman_id=sales.salesman_id 
WHERE sales.commission>12;

SELECT ord.order_no, ord.order_date, ord.purchase_amount, cust.customer_name, cust.grade, sales.salesman_name, sales.commission FROM orders ord 
INNER JOIN customers cust ON ord.customer_id=cust.customer_id 
INNER JOIN salesman sales ON ord.salesman_id=sales.salesman_id;

