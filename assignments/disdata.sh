#!/bin/bash


exec < $1
read header #skips first line

while IFS=',' read -r first_name last_name email username password

do 
	echo "First Name: $first_name";
	echo "Last Name: $last_name";
	echo "Email: $email";
	echo "Username: $username";
	echo "Password: $password";
	echo "+-----------------------------------------+"
done 
