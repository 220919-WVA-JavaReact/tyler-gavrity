#!/bin/bash

read -p "What would you like to factorial" number;

subn=1;

while [ $number -gt 1 ]
do

	subn=$((subn * number));
	number=$((number - 1));
done

echo $subn;
