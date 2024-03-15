#!/bin/bash

echo input first number
read a

echo input second number
read b

c=`expr $a + $b`
d=`expr $a - $b`
e=`expr $a \* $b`
f=`expr $a / $b`
g=`expr $a % $b`

echo Addition: $c
echo Substraction: $d
echo Multiplication: $e
echo Division: $f
echo Modulo: $g


