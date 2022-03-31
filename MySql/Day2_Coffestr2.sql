use coffee_str;
select * from customers;
select * from products;
select * from orders;

-- selecting rows containing two or more values
select * from customers
where last_name in ('Bluth','Taylor','Armstrong');

-- selecting rows not containing two or more values
select * from customers
where first_name not in ('Katie','George','John');

select * from orders;

-- selecting rows/ data which lie between a range of values
-- on dates
select product_id, customer_id, order_time from orders
where order_time between '2017-01-01' and '2017-01-07';
-- on numbers
select product_id, customer_id, order_time from orders
where customer_id between 5 and 10;

select * from customers;
-- on strings
select * from customers
where last_name between 'A' and 'L';

-- like/ pattern matching starting with a letter
select * from customers
where last_name like 'W%';
-- having the letter in it
select * from customers
where last_name like '%o%';
-- ending with a particular letter
select * from customers
where last_name like '%r';

-- Underscore represents exactly one character presceding or aafter the specified letter
select * from customers
where first_name like '_o_';

-- LIKE with numbers
select * from products;
select * from products
where price like '3%';

-- ordering the data
select * from products;

select * from products
order by price asc;

select * from products
order by price desc;
-- ORDER BY ON STRINGS
select * from customers;
select * from customers
order by last_name asc;

select * from customers
order by last_name desc;
-- ORDER BY ON DATE
select * from orders;
select * from orders
where customer_id=1
order by order_time asc;

/* exercise-2
1) from products table, select the name and price of all the products with a coffee origin 
equal to columbia or Indonesia. Ordered by name from A-Z
2) from orders table, select all the orders from february 2017 for customers with id's of 2,4,6 or 8.
3)from the customers table, select the first_name and phone_number of all the customers who's last name contains the pattern 'ar'.
*/

-- 1) 
select * from products;
select name, price from products
where coffee_origin in ('Columbia', 'Indonesia');

-- 2)
select * from orders;
select * from orders
where order_time between '2017-02-01' and '2017-02-28'
and customer_id in (2,4,6,8);

-- 3)
select * from customers;
select first_name, phone_number, last_name from customers
where last_name like '%ar%';


select coffee_origin from products;
-- to select distinct / unique values
select distinct coffee_origin from products;
-- to get all the customers who ordered in feb without distinct
select customer_id from orders 
where order_time between '2017-02-01' and '2017-02-28';
-- to get the distinct customers in feb
select distinct customer_id from orders 
where order_time between '2017-02-01' and '2017-02-28';
-- you will get duplicate customers because they have orderd different products
select distinct customer_id, product_id from orders 
where order_time between '2017-02-01' and '2017-02-28';

-- LIMIT
select * from customers;
select * from customers
limit 5;

select * from customers
limit 10 offset 2;

select * from customers
order by last_name
limit 10;

-- COLUMN NAME ALIAS
select * from products;
select name, price, coffee_origin from products;
-- changing the column names only in the reslut set not the database
select name as Coffee, price, coffee_origin as Country from products;


/* EXERCISE 3
1) from customers table, select distinct last names and order alphabetically from a-z.
2) from orders table , select the first 3 orders placed by customer with id 1, in february 2017.
3) from the products table, select the name , price and coffee_origin but rename the price to retail_price in the result set.alter.
*/

-- 1ST SOULTION
select distinct last_name from customers
order by last_name asc;

-- 2nd solution
select * from orders
where order_time between '2017-02-01' and '2017-02-28'
and customer_id=1
order by order_time asc
limit 3;

-- 3rd solution
select name,price as retail_price,coffee_origin from products;

