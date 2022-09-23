#!/bin/bash
a=0;
b=1;
#for (( i=0; i<11; i++))
while [ $a -le 100 ]
do
	echo $a
	c=$((${a} + ${b}));
	a=$b;
	b=$c;
	#echo $b;
	#echo $c;
done


