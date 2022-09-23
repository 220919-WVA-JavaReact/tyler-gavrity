#!/bin/bash

read -p "What would you like to factorial? " unum;
a=1;
while [ $unum -gt 1 ]
do
	a=$((a * unum));
	unum=$((unum - 1));
done

echo $a;



