#!/bin/bash

#Hopefully the code for the calculator. Switch case instead of If
#real=^[0-9]+$'
#if ! [[ ${{2}} =~ ${{real}} ]] ; then
#echo "Error: Input is not a number
#fi
if [[ ${2} =~ ^[0-9]+$ ]] && [[ ${3} =~ ^[0-9]+$ ]];
then

case ${1} in
add)
a=$((${2}+${3}))
echo $a

;;
subtract)
s=$((${2}-${3}))
echo $s

;;
divide)
d=$((${2}/${3}))
echo $d

;;
multiply)
m=$((${2}*${3}))
echo $m

;;
*)
echo "Please try again";
;;
esac
else
echo "Please Enter a Number";
fi
