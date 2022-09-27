--This is a comment in SQL





CREATE TABLE products (
--All column definitions must fit between here
--columnName Datatype
	productName varchar(25),
	productPrice int,
	department varchar(25),
	quantity int
);


create table pokemon (
--id, name, type, type 2 level, nature
--to specify column names that are also keywords it's best practice to put them in double quotes
"number" int,
"name" varchar(25),
type1 varchar(25),
type2 varchar(25),
evolved bool
);

--SQL has sub languages within it
--4 or 5 depending on who you ask (vendor) 
--For our purposes, we consider it 5

--DDL: Data definition language - defines structure or schema for database 
--example: CREATE TABLE

--DML: Data Manipulation language -- ways to manipulate data (what we call CRUD methods)
--CRUD: Create, Read, Update, Delete.
--Create new data > INSERT
--Read existing data > SELECT
--Update existing data > UPDATE
--Delete existing data > DELETE

--to create data we're going to insert into a table

--Lets add some info into the table
--When adding strings use single quotes
insert into products 
values ('Bike', 100, 'Sports', 1);

--Lets take a look at how our datatypes enforce the right type of info
--Integers can only take integers, strings can only take strings
insert into products values('toaster',40,'Kitchen',5);

--Let's try adding some stuff to columns specifically, not all of them
insert into products (productName, productprice, department) values ('Tomato', 1, 'Produce');

--Inserting into the Pokemon table
insert into pokemon values (1, 'Bulbasaur', 'Poison', 23, false);
insert into pokemon values (2, 'Venasaur', 'Poison', 38, true);


--Creating country table witj gdp, population, national food, nationalflower, and capital

create table Country (
gdp bigint,
population bigint,
food varchar(20),
nationalFlower varchar(25),
capital varchar(30)
);

--Insert in values to country table
insert into country values(20900000000000,329000000,'Hamburger','Rose', 'Washington D.C.');
--insert into country values(20900000000000,329000000,'Hamburger','Rose', 'Washington D.C.');
insert into country (gdp, population, nationalflower, capital) values(2600000000000, 1380000000,'Lotus', 'New Delhi');
insert into country values(380600000000000, 83240000, 'Sauerbraten', 'The Cornflower', 'Berlin');
insert into country values(1886000000000, 59500000, 'Ragu alla Bolognese', 'The Beautiful Lily', 'Rome');
insert into country values(14720000000000, 1402000000, 'Peking Duck', 'The plum blossom', 'Beijing');