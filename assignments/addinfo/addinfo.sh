#!/bin/bash

read -p "What is your first name?" fname ;
read -p "What is your last name?" lname;
read -p "What is your email?" email;
read -p "What is your username?" keyname;
read -p "What is your password?" pword;

echo "+-------------------------------+";
echo "First Name: $fname";
echo "Last Name: $lname";
echo "Email: $email";
echo "Username: $keyname";
echo "Password: *******";



read -p "Is this correct? y/n: " a;
if [ $a = "y" ];
then
echo "saving....."
echo "You have been added to our registry";
echo "$fname,$lname,$email,$keyname,$pword" >> mock_data.csv
else
exec $(readlink -f "$0");
fi

