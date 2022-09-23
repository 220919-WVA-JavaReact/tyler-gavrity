#!/bin/bash

read -p "What would you like to factorial? " nope;

countd=1;

while [ $nope -gt 1 ]
do
	countd=$((countd*nope));
	nope=$((nope - 1));
done
echo $countd;
