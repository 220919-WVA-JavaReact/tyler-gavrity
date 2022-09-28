--Creating a school database
--What tables do we need to create?
--students, teachers, courses, and topics

--Students should have some sort of PRIMARY KEY and (name, phone number, email etc.)
--Courses should have some sort of PRIMARY key and (title, course number, etc.)
--Teachers should have some sort of PRIMARY KEY and (name, phone number, email etc.)
--Topics should have two columns, some primary key and some topic.

create table students (
id serial primary key unique,
"name" varchar(25), 
phoneNum bigint,
email varchar(30)
--courseNum int references courses unique
);

create table teachers (
teach_id int primary key unique,
"name" varchar(25),
phoneNum bigint unique,
email varchar(30) unique
);

create table courses (
courseNum int primary key unique,
teach_id int references teachers unique,
title varchar(30),
topic varchar(25),
topicNum int references topics,
id int references students unique
);

create table topics (
topicNum int primary key,
"name" varchar(25)
);