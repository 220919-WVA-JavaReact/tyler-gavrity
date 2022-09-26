#!/bin/bash

read -p "Please enter a number " a;

nums=${a};
pos=0;
neg=0;
for numbers in ${nums}
do
	if [ ${numbers} -gt 0 ]
	then
		((pos++));
	else
		((neg++));
	fi
done

echo "Postive Numbers: ${pos}";

echo "Negative Numbers: ${neg}";
